package com.jaedongchicken.ytplayer.model;

/**
 * Created by JD on 2016-06-01.
 */
public class YTParams {
    private int autoplay = 1;
    private int rel = 0;
    private int showinfo = 0;
    private int enablejsapi = 1;
    private int disablekb = 1;
    private String cc_lang_pref = "en";
    private int controls = 0;

    public int getAutoplay() {
        return autoplay;
    }

    public int getRel() {
        return rel;
    }

    public int getShowinfo() {
        return showinfo;
    }


    public int getEnablejsapi() {
        return enablejsapi;
    }


    public int getDisablekb() {
        return disablekb;
    }


    public String getCc_lang_pref() {
        return cc_lang_pref;
    }


    public int getControls() {
        return controls;
    }

}
