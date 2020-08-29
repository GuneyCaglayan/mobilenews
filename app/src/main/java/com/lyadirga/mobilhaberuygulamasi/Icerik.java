package com.lyadirga.mobilhaberuygulamasi;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by kiosk on 09/12/2016.
 */
public class Icerik  extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String link=getIntent().getStringExtra("link");

        WebView webView=new WebView(this);
        WebSettings ws=webView.getSettings();
        ws.setJavaScriptEnabled(true);
        webView.loadUrl(link);

        setContentView(webView);
    }
}
