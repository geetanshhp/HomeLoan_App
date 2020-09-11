package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Patner extends AppCompatActivity
{
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference one=database.getReference("Patner/P1");
    DatabaseReference two=database.getReference("Patner/P2");
    TextView t1,t2;
    FloatingActionButton floatingActionButton,floatingActionButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patner);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //getSupportActionBar().setTitle(" Patners");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        t1=findViewById(R.id.idtext1);
        t2=findViewById(R.id.idtext2);
        floatingActionButton=findViewById(R.id.floating);
        floatingActionButton1=findViewById(R.id.floating1);
        floatingActionButton1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                callmethod1();

            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                callmethod();

            }
        });

        one.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s1=dataSnapshot.getValue(String.class);
               // t1.setText(s1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        two.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s2=dataSnapshot.getValue(String.class);
                t2.setText(s2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void callmethod1()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);

    }

    private void callmethod()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);
    }
}
