package com.example.homework_week1_weekend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class BrowserClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_class);
        WebView browser = (WebView) findViewById(R.id.wv);
        browser.loadUrl("https://www.wizards.com/dnd/dice/dice.htm");
    }
}
