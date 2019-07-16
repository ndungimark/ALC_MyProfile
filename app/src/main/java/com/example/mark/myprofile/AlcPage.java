package com.example.mark.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AlcPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_page);
        WebView browser = (WebView) findViewById(R.id.Mywebview);
        browser.loadUrl("https://www.andela.com/alc");
    }
}
