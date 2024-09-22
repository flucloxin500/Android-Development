package com.teamflux.surahfornamaz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebBrowserActivity extends AppCompatActivity {

    WebView webView;

    public static String web_url="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_browser_layout);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(web_url);

        //Initialize websetting//
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // initialize connectivity manager///
        ConnectivityManager connectivityManager = (ConnectivityManager)
                getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        // Get Active net info //
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        /// check net status ///
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()){
            /// when internet is inactive //
            Dialog dialog = new Dialog(this);
            // set content view
            dialog.setContentView(R.layout.no_internet);
            // set outside touch
            dialog.setCanceledOnTouchOutside(false);
            // set dialog width and height
            dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.MATCH_PARENT);

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().getAttributes().windowAnimations =
                    android.R.style.Animation_Dialog;


            dialog.show();
        } else {

        }



    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}