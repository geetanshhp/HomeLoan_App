package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Share extends AppCompatActivity
{

ImageButton insta,facebook,googleplus,twitter,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        insta=findViewById(R.id.idinstagram);
        facebook=findViewById(R.id.idfacebook);
        googleplus=findViewById(R.id.idSkype);
        twitter=findViewById(R.id.idtwitter);
        whatsapp=findViewById(R.id.idlinkedid);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

       whatsapp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               LinkedIn();

           }
       });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Twitter();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Facebook();

            }
        });
        googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Skype();

            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Instagram();

            }
        });
    }

    private void LinkedIn()
    {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "For Home Loan or BT plz Contact  " + "https://play.google.com/store/apps/details?id=com.loans.homeloans&hl=en");
            intent.setPackage("com.whatsapp");
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Please install What's app", Toast.LENGTH_SHORT).show();
        }
    }

    private void Twitter()
    {
        try
        {
            Intent shareintent = new Intent(Intent.ACTION_SEND);
            shareintent.setType("text/plain");
            shareintent.putExtra(Intent.EXTRA_TEXT, "For Home Loan or BT plz Contact  " + "https://play.google.com/store/apps/details?id=com.loans.homeloans&hl=en");
            shareintent.setPackage("advanced.twitter.android");
            startActivity(shareintent);
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Please install twitter ", Toast.LENGTH_SHORT).show();
        }
    }

    private void Skype()
    {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "For Home Loan or BT plz Contact " + "https://play.google.com/store/apps/details?id=com.loans.homeloans&hl=en");
            intent.setPackage("com.google.android.apps.plus");
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Please install Google Plus", Toast.LENGTH_SHORT).show();
        }

    }

    private void Facebook()
    {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "For Home Loan or BT plz Contact " + "https://play.google.com/store/apps/details?id=com.loans.homeloans&hl=en");
            intent.setPackage("com.facebook.katana");
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Please install facebook", Toast.LENGTH_SHORT).show();
        }
    }

    private void Instagram()
    {

        try {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "For Home Loan or BT plz Contact " + "https://play.google.com/store/apps/details?id=com.loans.homeloans&hl=en");
        intent.setPackage("com.instagram.android");
        startActivity(intent);
    }
        catch (Exception e)
        {
            Toast.makeText(this, "Please install Instagram", Toast.LENGTH_SHORT).show();
        }
    }
}
