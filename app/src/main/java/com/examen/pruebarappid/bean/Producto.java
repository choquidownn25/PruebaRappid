package com.examen.pruebarappid.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by choqu_000 on 31/01/2017.
 * Clase donde se bean el dato del json
 */

public class Producto implements Parcelable {

    private String id;
    //private String name;
    private String imageUrl;

    private String banner_img;
    private String user_sr_theme_enabled;
    private String submit_text_html;
    private String user_is_banned;
    private String wiki_enabled;
    private String show_media;
    private String submit_text;
    private String display_name;
    private String header_img;
    private String description_html;
    private String title;
    private String collapse_deleted_comments;
    private String over18;
    private String public_description_html;
    private String spoilers_enabled;
    private String icon_img;
    private String header_title;
    private String description;
    private String user_is_muted;
    //private String[] icon_size;
    private String icon_size;
    private String suggested_comment_sort;
    private String submit_link_label;
    //private String[] header_size;
    private String header_size;
    private String public_traffic;
    private String accounts_active;
    private String subscribers;
    private String submit_text_label;
    private String lang;
    private String user_is_moderator;
    private String key_color;
    private String name;
    private String created;
    private String url;
    private String quarantine;
    private String hide_ads;
    private String created_utc;
    private String banner_size;
    private String user_is_contributor;

    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }

    public String getUser_sr_theme_enabled() {
        return user_sr_theme_enabled;
    }

    public void setUser_sr_theme_enabled(String user_sr_theme_enabled) {
        this.user_sr_theme_enabled = user_sr_theme_enabled;
    }

    public String getSubmit_text_html() {
        return submit_text_html;
    }

    public void setSubmit_text_html(String submit_text_html) {
        this.submit_text_html = submit_text_html;
    }

    public String getUser_is_banned() {
        return user_is_banned;
    }

    public void setUser_is_banned(String user_is_banned) {
        this.user_is_banned = user_is_banned;
    }

    public String getWiki_enabled() {
        return wiki_enabled;
    }

    public void setWiki_enabled(String wiki_enabled) {
        this.wiki_enabled = wiki_enabled;
    }

    public String getShow_media() {
        return show_media;
    }

    public void setShow_media(String show_media) {
        this.show_media = show_media;
    }

    public String getSubmit_text() {
        return submit_text;
    }

    public void setSubmit_text(String submit_text) {
        this.submit_text = submit_text;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getHeader_img() {
        return header_img;
    }

    public void setHeader_img(String header_img) {
        this.header_img = header_img;
    }

    public String getDescription_html() {
        return description_html;
    }

    public void setDescription_html(String description_html) {
        this.description_html = description_html;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCollapse_deleted_comments() {
        return collapse_deleted_comments;
    }

    public void setCollapse_deleted_comments(String collapse_deleted_comments) {
        this.collapse_deleted_comments = collapse_deleted_comments;
    }

    public String getOver18() {
        return over18;
    }

    public void setOver18(String over18) {
        this.over18 = over18;
    }

    public String getPublic_description_html() {
        return public_description_html;
    }

    public void setPublic_description_html(String public_description_html) {
        this.public_description_html = public_description_html;
    }

    public String getSpoilers_enabled() {
        return spoilers_enabled;
    }

    public void setSpoilers_enabled(String spoilers_enabled) {
        this.spoilers_enabled = spoilers_enabled;
    }
    /*
    public String[] getIcon_size() {
        return icon_size;
    }*/
    /*
    public void setIcon_size(String icon_size) {
        this.icon_size = icon_size;
    }*/

    public String getSuggested_comment_sort() {
        return suggested_comment_sort;
    }

    public void setSuggested_comment_sort(String suggested_comment_sort) {
        this.suggested_comment_sort = suggested_comment_sort;
    }

    public String getIcon_img() {
        return icon_img;
    }

    public void setIcon_img(String icon_img) {
        this.icon_img = icon_img;
    }

    public String getHeader_title() {
        return header_title;
    }

    public void setHeader_title(String header_title) {
        this.header_title = header_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser_is_muted() {
        return user_is_muted;
    }

    public void setUser_is_muted(String user_is_muted) {
        this.user_is_muted = user_is_muted;
    }

    public String getSubmit_link_label() {
        return submit_link_label;
    }

    public void setSubmit_link_label(String submit_link_label) {
        this.submit_link_label = submit_link_label;
    }
    /*
    public String[] getHeader_size() {
        return header_size;
    }

    public void setHeader_size(String header_size) {
        this.header_size = header_size;
    }*/

    public String getPublic_traffic() {
        return public_traffic;
    }

    public void setPublic_traffic(String public_traffic) {
        this.public_traffic = public_traffic;
    }

    public String getAccounts_active() {
        return accounts_active;
    }

    public void setAccounts_active(String accounts_active) {
        this.accounts_active = accounts_active;
    }

    public String getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(String subscribers) {
        this.subscribers = subscribers;
    }

    public String getSubmit_text_label() {
        return submit_text_label;
    }

    public void setSubmit_text_label(String submit_text_label) {
        this.submit_text_label = submit_text_label;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUser_is_moderator() {
        return user_is_moderator;
    }

    public void setUser_is_moderator(String user_is_moderator) {
        this.user_is_moderator = user_is_moderator;
    }

    public String getKey_color() {
        return key_color;
    }

    public void setKey_color(String key_color) {
        this.key_color = key_color;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(String quarantine) {
        this.quarantine = quarantine;
    }

    public String getHide_ads() {
        return hide_ads;
    }

    public void setHide_ads(String hide_ads) {
        this.hide_ads = hide_ads;
    }

    public String getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(String created_utc) {
        this.created_utc = created_utc;
    }

   /* public String[] getBanner_size() {
        return banner_size;
    }*/

    public void setBanner_size(String banner_size) {
        this.banner_size = banner_size;
    }

    public String getUser_is_contributor() {
        return user_is_contributor;
    }

    public void setUser_is_contributor(String user_is_contributor) {
        this.user_is_contributor = user_is_contributor;
    }

    public String getAdvertiser_category() {
        return advertiser_category;
    }

    public void setAdvertiser_category(String advertiser_category) {
        this.advertiser_category = advertiser_category;
    }

    public String getPublic_description() {
        return public_description;
    }

    public void setPublic_description(String public_description) {
        this.public_description = public_description;
    }

    public String getShow_media_preview() {
        return show_media_preview;
    }

    public void setShow_media_preview(String show_media_preview) {
        this.show_media_preview = show_media_preview;
    }

    public String getComment_score_hide_mins() {
        return comment_score_hide_mins;
    }

    public void setComment_score_hide_mins(String comment_score_hide_mins) {
        this.comment_score_hide_mins = comment_score_hide_mins;
    }

    public String getSubreddit_type() {
        return subreddit_type;
    }

    public void setSubreddit_type(String subreddit_type) {
        this.subreddit_type = subreddit_type;
    }

    public String getSubmission_type() {
        return submission_type;
    }

    public void setSubmission_type(String submission_type) {
        this.submission_type = submission_type;
    }

    public String getUser_is_subscriber() {
        return user_is_subscriber;
    }

    public void setUser_is_subscriber(String user_is_subscriber) {
        this.user_is_subscriber = user_is_subscriber;
    }

    private String advertiser_category;
    private String public_description;
    private String show_media_preview;
    private String comment_score_hide_mins;
    private String subreddit_type;
    private String submission_type;
    private String user_is_subscriber;

    public Producto() {
        super();
    }

    private Producto(Parcel in) {
        super();
        this.id = in.readString();
        this.name = in.readString();
        this.imageUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(getId());
        parcel.writeString(getName());
        parcel.writeString(getImageUrl());
    }

    public static final Parcelable.Creator<Producto> CREATOR = new Parcelable.Creator<Producto>() {
        public Producto createFromParcel(Parcel in) {
            return new Producto(in);
        }

        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static Parcelable.Creator<Producto> getCreator() {
        return CREATOR;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int datoId = Integer.parseInt(id);
        int result = 1;
        result = prime * result + datoId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", name=" + name + ", imageUrl="
                + imageUrl + "]";
    }

    public void setIcon_size(String icon_size) {
        this.icon_size = icon_size;
    }

    public void setHeader_size(String header_size) {
        this.header_size = header_size;
    }
}
