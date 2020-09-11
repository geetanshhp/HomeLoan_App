package com.loans.homeloans;

import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Why_We extends AppCompatActivity
{
    TextView textView,textView1,textView2,textView3;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference p1=firebaseDatabase.getReference("Why We/P1");
    DatabaseReference p2=firebaseDatabase.getReference("Why We/P2");
    DatabaseReference p3=firebaseDatabase.getReference("Why We/P3");
    DatabaseReference p4=firebaseDatabase.getReference("Why We/P4");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why__we);
        textView=findViewById(R.id.idw1);
        textView1=findViewById(R.id.idw2);
        textView2=findViewById(R.id.idw3);
        textView3=findViewById(R.id.idw4);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        p1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String d=dataSnapshot.getValue(String.class);
                textView.setText(d);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        p2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String ss=dataSnapshot.getValue(String.class);
                textView1.setText(ss);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        p3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String v=dataSnapshot.getValue(String.class);
                textView2.setText(v);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        p4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String vcx=dataSnapshot.getValue(String.class);
                textView3.setText(vcx);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
