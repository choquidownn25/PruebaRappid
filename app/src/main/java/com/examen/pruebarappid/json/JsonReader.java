package com.examen.pruebarappid.json;

/**
 * Created by choqu_000 on 31/01/2017.
 * Clase letura del servicio json
 */

import com.examen.pruebarappid.bean.Producto;
import com.examen.pruebarappid.utilidades.TagNombre;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonReader {

    public static List<Producto> getHome(JSONObject jsonObject)
            throws JSONException {
        //Intancia de lista de los productos
        List<Producto> products = new ArrayList<Producto>();

        JSONArray jsonArray = jsonObject.getJSONArray(TagNombre.TAG_PRODUCTS);
        Producto product;
        //Recorrido del arreglo
        for (int i = 0; i < jsonArray.length(); i++) {
            product = new Producto(); //Instancia de clase
            JSONObject productObj = jsonArray.getJSONObject(i);

            product.setBanner_img(productObj.getString(TagNombre.TAG_BANNER_IMG));
            product.setUser_sr_theme_enabled(productObj.getString(TagNombre.TAG_USER_SR_THEME_ENABLED));
            product.setSubmit_text_html(productObj.getString(TagNombre.TAG_SUBMIT_TEXT_HTML));
            product.setUser_is_banned(productObj.getString(TagNombre.TAG_USER_IS_BANNED));
            product.setWiki_enabled(productObj.getString(TagNombre.TAG_WIKI_ENABLED));
            product.setShow_media(productObj.getString(TagNombre.TAG_SHOW_MEDIA));
            product.setId(productObj.getString(TagNombre.KEY_ID));
            product.setSubmit_text(productObj.getString(TagNombre.TAG_SUBMIT_TEXT));
            product.setDisplay_name(productObj.getString(TagNombre.TAG_DISPLAY_NAME));
            product.setHeader_img(productObj.getString(TagNombre.TAG_HEADER_IMG));
            product.setDescription_html(productObj.getString(TagNombre.TAG_DESCRIPTION_HTML));
            product.setTitle(productObj.getString(TagNombre.TAG_TITLE));
            product.setCollapse_deleted_comments(productObj.getString(TagNombre.TAG_COLLAPSE_DELETED_COMMENTS));
            product.setOver18(productObj.getString(TagNombre.TAG_OVER18));
            product.setPublic_description_html(productObj.getString(TagNombre.TAG_PUBLIC_DESCRIPTION_HTML));
            product.setSpoilers_enabled(productObj.getString(TagNombre.TAG_SPOILERS_ENABLED));
            product.setIcon_size(productObj.getString(TagNombre.TAG_ICON_IMG));
            product.setSuggested_comment_sort(productObj.getString(TagNombre.TAG_SUGGESTED_COMMENT_SORT));
            product.setIcon_img(productObj.getString(TagNombre.TAG_ICON_IMG));
            product.setHeader_title(productObj.getString(TagNombre.TAG_DESCRIPTION));
            product.setUser_is_muted(productObj.getString(TagNombre.TAG_USER_IS_MUTED));
            product.setSubmit_link_label(productObj.getString(TagNombre.TAG_SUBMIT_LINK_LABEL));
            product.setHeader_size(productObj.getString(TagNombre.TAG_HEADER_SIZE));
            product.setPublic_traffic(productObj.getString(TagNombre.TAG_PUBLIC_TRAFFIC));
            product.setAccounts_active(productObj.getString(TagNombre.TAG_ACCOUNTS_ACTIVE));
            product.setSubscribers(productObj.getString(TagNombre.TAG_SUBSCRIBERS));
            product.setSubmit_text_label(productObj.getString(TagNombre.TAG_SUBMIT_TEXT_LABEL));
            product.setLang(productObj.getString(TagNombre.TAG_LANG));
            product.setUser_is_moderator(productObj.getString(TagNombre.TAG_USER_IS_MODERATOR));
            product.setKey_color(productObj.getString(TagNombre.TAG_KEY_COLOR));
            product.setName(productObj.getString(TagNombre.KEY_NAME));
            product.setCreated(productObj.getString(TagNombre.TAG_CREATED));
            product.setUrl(productObj.getString(TagNombre.TAG_URL));
            product.setQuarantine(productObj.getString(TagNombre.TAG_QUARANTINE));
            product.setHide_ads(productObj.getString(TagNombre.TAG_HIDE_ADS));
            product.setCreated_utc(productObj.getString(TagNombre.TAG_CREATED_UTC));
            product.setBanner_size(productObj.getString(TagNombre.TAG_BANNER_SIZE));
            product.setBanner_img(productObj.getString(TagNombre.TAG_BANNER_IMG));
            product.setUser_is_contributor(productObj.getString(TagNombre.TAG_USER_IS_CONTRIBUTOR));
            product.setAdvertiser_category(productObj.getString(TagNombre.TAG_ADVERTISER_CATEGORY));
            product.setPublic_description(productObj.getString(TagNombre.TAG_PUBLIC_DESCRIPTION));
            product.setShow_media_preview(productObj.getString(TagNombre.TAG_SHOW_MEDIA_PREVIEW));
            product.setComment_score_hide_mins(productObj.getString(TagNombre.TAG_COMMENT_SCORE_HIDE_MINS));
            product.setSubmission_type(productObj.getString(TagNombre.TAG_SUBMISSION_TYPE));
            product.setUser_is_subscriber(productObj.getString(TagNombre.TAG_USER_IS_SUBSCRIBER));
            //Lista del producto
            products.add(product);
        }
        return products;
    }
}
