package com.a13x.tempconverter;

import android.app.Application;

/**
 * Created by Alejandro on 11/11/2016.
 */

public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://github.com/AlGuerrero";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}