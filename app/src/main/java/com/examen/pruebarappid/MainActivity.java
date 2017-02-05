package com.examen.pruebarappid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.examen.pruebarappid.fragment.HomeFragment;
import com.examen.pruebarappid.fragment.ProductoDetalleFragment;

//import android.util.Log;


public class MainActivity extends FragmentActivity {

    private Fragment contentFragment;
    HomeFragment homeFragment;
    ProductoDetalleFragment pdtDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("content")) {
                String content = savedInstanceState.getString("content");
                if (content.equals(ProductoDetalleFragment.ARG_ITEM_ID)) {
                    if (fragmentManager
                            .findFragmentByTag(ProductoDetalleFragment.ARG_ITEM_ID) != null) {
                        contentFragment = fragmentManager
                                .findFragmentByTag(ProductoDetalleFragment.ARG_ITEM_ID);
                    }
                }
            }
            if (fragmentManager.findFragmentByTag(HomeFragment.ARG_ITEM_ID) != null) {
                homeFragment = (HomeFragment) fragmentManager
                        .findFragmentByTag(HomeFragment.ARG_ITEM_ID);
                contentFragment = homeFragment;
            }
        } else {
            homeFragment = new HomeFragment();
            switchContent(homeFragment, HomeFragment.ARG_ITEM_ID);
        }
    }

    //Se guarda la instancia
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (contentFragment instanceof HomeFragment) {
            outState.putString("content", HomeFragment.ARG_ITEM_ID);
        } else {
            outState.putString("content", ProductoDetalleFragment.ARG_ITEM_ID);
        }
        super.onSaveInstanceState(outState);
    }
    //Se aplica el contexto
    public void switchContent(Fragment fragment, String tag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        while (fragmentManager.popBackStackImmediate())
            ;

        if (fragment != null) {
            FragmentTransaction transaction = fragmentManager
                    .beginTransaction();
            transaction.replace(R.id.content_frame, fragment, tag);
            // Se agregan los framman
            if (!(fragment instanceof HomeFragment)) {
                transaction.addToBackStack(tag);
            }
            transaction.commit();
            contentFragment = fragment;
        }
    }
//Presionar para atras
    @Override
    public void onBackPressed() {
        FragmentManager fm = getSupportFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            super.onBackPressed();
        } else if (contentFragment instanceof HomeFragment
                || fm.getBackStackEntryCount() == 0) {
            finish();
        }
    }


}
