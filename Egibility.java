package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Egibility extends AppCompatActivity
{
    FloatingActionButton f,c,s;
    TextView textViewe1,textViewe2,textViewsal1,textViewsal2,bt1,bt2,bt3,bt4,bt,kyc1,kyc2,kyc3,kyc4,pp1,pp2,pp3,z1,z2,z3;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference sal=firebaseDatabase.getReference("Eligible salry/P1");
    DatabaseReference sal1=firebaseDatabase.getReference("Eligible salry/P2");
    DatabaseReference self1=firebaseDatabase.getReference("Eligible salry/Self employ 1");
    DatabaseReference self2=firebaseDatabase.getReference("Eligible salry/Sele employ 2");
    DatabaseReference pbt1=firebaseDatabase.getReference("Eligibility for bt/P1");
    DatabaseReference pbt2=firebaseDatabase.getReference("Eligibility for bt/P2");
    DatabaseReference pbt3=firebaseDatabase.getReference("Eligibility for bt/P3");
    DatabaseReference pbt4=firebaseDatabase.getReference("Eligibility for bt/P4");
    DatabaseReference Wbt=firebaseDatabase.getReference("BT/");
    DatabaseReference d1=firebaseDatabase.getReference("Documents/P2");
    DatabaseReference d2=firebaseDatabase.getReference("Documents/P3");
    DatabaseReference d3=firebaseDatabase.getReference("Documents/P4");
    DatabaseReference d4=firebaseDatabase.getReference("Documents/P1");
    DatabaseReference d5=firebaseDatabase.getReference("Documents/G1");
    DatabaseReference d6=firebaseDatabase.getReference("Documents/G2");
    DatabaseReference d7=firebaseDatabase.getReference("Documents/G3");
    DatabaseReference d8=firebaseDatabase.getReference("Documents/P6");
    DatabaseReference d9=firebaseDatabase.getReference("Documents/P7");
    DatabaseReference d10=firebaseDatabase.getReference("Documents/P5");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egibility);
        textViewe1=findViewById(R.id.idsaltext1);
        textViewe2=findViewById(R.id.idsaltext2);
        textViewsal1=findViewById(R.id.idselftext1);
        textViewsal2=findViewById(R.id.idselftext2);
        bt1=findViewById(R.id.idbt1);
        bt2=findViewById(R.id.idbt2);
        bt3=findViewById(R.id.idbt3);
        bt4=findViewById(R.id.idbt4);
        bt=findViewById(R.id.idwhatisbt);
        kyc1=findViewById(R.id.idkyc1);
        kyc2=findViewById(R.id.idkyc2);
        kyc3=findViewById(R.id.idkyc3);
        kyc4=findViewById(R.id.idkyc4);
        pp1=findViewById(R.id.id1);
        pp2=findViewById(R.id.id2);
        pp3=findViewById(R.id.id3);
        z1=findViewById(R.id.id4);
        z2=findViewById(R.id.id5);
        z3=findViewById(R.id.id6);
        f=findViewById(R.id.floatingForm);
        c=findViewById(R.id.floatingCall);
        s=findViewById(R.id.floatingShare);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                share();

            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                fillform();

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                makecall();

            }
        });

        d1.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String x2=dataSnapshot.getValue(String.class);
                kyc1.setText(x2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String c=dataSnapshot.getValue(String.class);
                kyc2.setText(c);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String v=dataSnapshot.getValue(String.class);
                kyc3.setText(v);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                kyc4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {


            }
        });
        d5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String v=dataSnapshot.getValue(String.class);
                pp1.setText(v);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String b=dataSnapshot.getValue(String.class);
                pp2.setText(b);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String b=dataSnapshot.getValue(String.class);
                pp3.setText(b);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String g=dataSnapshot.getValue(String.class);
                z1.setText(g);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String h=dataSnapshot.getValue(String.class);
                z2.setText(h);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String a=dataSnapshot.getValue(String.class);
                z3.setText(a);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        Wbt.addValueEventListener(new ValueEventListener() {
                                      @Override
                                      public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                                      {
                                          String d=dataSnapshot.getValue(String.class);
                                          bt.setText(d);

                                      }

                                      @Override
                                      public void onCancelled(@NonNull DatabaseError databaseError) {

                                      }
                                  });
                sal.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        textViewe1.setText(val);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
        sal1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val1=dataSnapshot.getValue(String.class);
                textViewe2.setText(val1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        self1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
              String v1=dataSnapshot.getValue(String.class);
              textViewsal1.setText(v1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        self2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String v=dataSnapshot.getValue(String.class);
                textViewsal2.setText(v);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        pbt1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String v2=dataSnapshot.getValue(String.class);
                bt1.setText(v2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        pbt2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String v3=dataSnapshot.getValue(String.class);
                bt2.setText(v3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        pbt3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String v=dataSnapshot.getValue(String.class);
                bt3.setText(v);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        pbt4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String f=dataSnapshot.getValue(String.class);
                bt4.setText(f);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    private void share()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="Personal KYC:\nAadhar card, PAN card, Address Proof, Electricity/Gas proof \n\n Properties Documents:\n Allotment Letter, Possession Letter, Registry, Completion Certificate, Occupancy Certificate, BBA \n\n Business/Self-Employed: \n Company Papers, GST Certified, Three year ITR \n\n Jobs/Salaried:\n Last 3 year ITR, One Year Salary Slip, Form 16 and 26(AS), Company ID Card";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        startActivity(Intent.createChooser(intent,"Share Via"));

    }

    private void fillform()
    {
        Intent intent=new Intent(this,Apply.class);
        startActivity(intent);
    }

    private void makecall()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);

    }
}
