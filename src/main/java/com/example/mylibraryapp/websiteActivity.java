package com.example.mylibraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class websiteActivity extends AppCompatActivity {

    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        Intent intent = getIntent();

        if (null != intent) {
            String url = intent.getStringExtra("url");
            wb = findViewById(R.id.webView);
            wb.loadUrl(url);
            wb.setWebViewClient(new WebViewClient());
            wb.getSettings().setJavaScriptEnabled(true);

        }

    }

    public void onBackPressed() {
        if (wb.canGoBack()) {
            wb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}