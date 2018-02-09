package com.cyw.a2018020901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckedTextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

//除了follow firebase的admob做,也要去google admob註冊得到幾個碼,共三種類別廣告, banner,一頁,倒數
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private AdView mAdView;
    CheckedTextView ctv;
    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ctv=(CheckedTextView)findViewById(R.id.checkedTextView);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}