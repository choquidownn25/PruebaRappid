package com.examen.pruebarappid.adaptador;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.examen.pruebarappid.R;
import com.examen.pruebarappid.bean.Producto;
import com.examen.pruebarappid.fragment.HomeFragment;
import com.examen.pruebarappid.fragment.ProductoDetalleFragment;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by choqu_000 on 01/02/2017.
 * Clase para imgen
 */

public class ImageSlideAdapter extends PagerAdapter {
    //Atributos
    ImageLoader imageLoader = ImageLoader.getInstance();
    DisplayImageOptions options;
    private ImageLoadingListener imageListener;
    FragmentActivity activity;
    List<Producto> products;
    HomeFragment homeFragment;

    public ImageSlideAdapter(FragmentActivity activity, List<Producto> products,
                             HomeFragment homeFragment) {
        this.activity = activity;
        this.homeFragment = homeFragment;
        this.products = products;
        options = new DisplayImageOptions.Builder()
                .showImageOnFail(R.drawable.ic_error)
                .showStubImage(R.drawable.ic_launcher)
                .showImageForEmptyUri(R.drawable.ic_empty).cacheInMemory()
                .cacheOnDisc().build();

        imageListener = new ImageDisplayListener();
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public View instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater = (LayoutInflater) activity
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.vp_image, container, false);

        ImageView mImageView = (ImageView) view
                .findViewById(R.id.image_display);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle arguments = new Bundle();
                Fragment fragment = null;
                Log.d("position adapter", "" + position);
                Producto product = (Producto) products.get(position);
                arguments.putParcelable("singleProduct", product);

                // inicia el nuevo framet
                fragment = new ProductoDetalleFragment();
                fragment.setArguments(arguments);

                FragmentTransaction transaction = activity
                        .getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.content_frame, fragment,
                        ProductoDetalleFragment.ARG_ITEM_ID);
                transaction.addToBackStack(ProductoDetalleFragment.ARG_ITEM_ID);
                transaction.commit();
            }
        });

		imageLoader.displayImage(
				((Producto) products.get(position)).getImageUrl(), mImageView,
				options, imageListener);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    private static class ImageDisplayListener extends
            SimpleImageLoadingListener {

        static final List<String> displayedImages = Collections
                .synchronizedList(new LinkedList<String>());

        @Override
        public void onLoadingComplete(String imageUri, View view,
                                      Bitmap loadedImage) {
            if (loadedImage != null) {
                ImageView imageView = (ImageView) view;
                boolean firstDisplay = !displayedImages.contains(imageUri);
                if (firstDisplay) {
                    FadeInBitmapDisplayer.animate(imageView, 500);
                    displayedImages.add(imageUri);
                }
            }
        }
    }
}
