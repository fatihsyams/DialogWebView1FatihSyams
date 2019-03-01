package com.example.dialogwebview1fatihsyams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView webVieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webVieww = findViewById(R.id.web_vieww);
        webVieww.getSettings().setJavaScriptEnabled(true);
        webVieww.loadUrl("https://www.idn.sch.id");
    }
}
