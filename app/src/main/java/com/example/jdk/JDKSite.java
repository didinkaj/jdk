package com.example.jdk;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class JDKSite extends WebViewClient {
    @Override

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
