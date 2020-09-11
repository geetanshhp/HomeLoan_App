package com.loans.homeloans;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class Apply extends AppCompatActivity
{
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdzUforuLgTqUGERLhrJcSmrxR2OBxWSIg_mW32qYkhLzAk9Q/viewform?usp=sf_link"));
        startActivity(intent);
    }
}
