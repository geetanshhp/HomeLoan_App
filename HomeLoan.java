package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
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

public class HomeLoan extends AppCompatActivity
{
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    Button button;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference Wp1=firebaseDatabase.getReference("Home Loan/What is Home Loan");
    DatabaseReference Wp2=firebaseDatabase.getReference("Home Loan/What is Home loan2");
    DatabaseReference Wp3=firebaseDatabase.getReference("Home Loan/What is Home loan3");
    DatabaseReference Tp1=firebaseDatabase.getReference("Home Loan/T1");
    DatabaseReference Tp2=firebaseDatabase.getReference("Home Loan/T2");
    DatabaseReference Tp3=firebaseDatabase.getReference("Home Loan/T3");
    DatabaseReference Tp4=firebaseDatabase.getReference("Home Loan/T4");
    DatabaseReference Tp5=firebaseDatabase.getReference("Home Loan/T5");
    DatabaseReference Tp6=firebaseDatabase.getReference("Home Loan/T6");
    DatabaseReference Tp7=firebaseDatabase.getReference("Home Loan/T7");
    DatabaseReference Tp8=firebaseDatabase.getReference("Home Loan/T8");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_loan);
        t1=findViewById(R.id.idtext1);
        t2=findViewById(R.id.idtext2);
        t3=findViewById(R.id.idtext3);
        t4=findViewById(R.id.idType1);
        t5=findViewById(R.id.idType2);
        t6=findViewById(R.id.idType3);
        t7=findViewById(R.id.idType4);
        t8=findViewById(R.id.idType5);
        t9=findViewById(R.id.idType6);
        t10=findViewById(R.id.idType7);
        t11=findViewById(R.id.idType8);
        button=findViewById(R.id.idhelp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                help();

            }
        });
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Wp1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s1=dataSnapshot.getValue(String.class);
                t1.setText(s1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wp2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
               String s2=dataSnapshot.getValue(String.class);
               t2.setText(s2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
            Wp3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    String s3=dataSnapshot.getValue(String.class);
                    t3.setText(s3);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Tp1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String s4=dataSnapshot.getValue(String.class);
                    t4.setText(s4);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Tp2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    String s1=dataSnapshot.getValue(String.class);
                    t5.setText(s1);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Tp3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    String s2=dataSnapshot.getValue(String.class);
                    t6.setText(s2);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Tp4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    String s3=dataSnapshot.getValue(String.class);
                    t7.setText(s3);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        Tp5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s5=dataSnapshot.getValue(String.class);
                t8.setText(s5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s9=dataSnapshot.getValue(String.class);
                t9.setText(s9);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s10=dataSnapshot.getValue(String.class);
                t10.setText(s10);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s0=dataSnapshot.getValue(String.class);
                t11.setText(s0);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void help()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);

    }


}
