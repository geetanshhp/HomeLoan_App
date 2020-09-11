package com.loans.homeloans;

import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class About_Us extends AppCompatActivity
{
    TextView textView,textView1;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference p1=database.getReference("About Us/P1");
    DatabaseReference p2=database.getReference("About Us/P2");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about__us);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView=findViewById(R.id.idtext1);
        textView1=findViewById(R.id.idtext2);


        //getSupportActionBar().setTitle(" About Us");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        p1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {

               String s1=dataSnapshot.getValue(String.class);

               textView.setText(s1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Toast.makeText(About_Us.this, "No Internet", Toast.LENGTH_SHORT).show();
            }
        });
        p2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s2=dataSnapshot.getValue(String.class);
                textView1.setText(s2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
