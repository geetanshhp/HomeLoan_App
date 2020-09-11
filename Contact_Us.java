package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Contact_Us extends AppCompatActivity
{
    String amit1,amit2;
    //String phone2,phone3;
    TextView n,textView_phone1,e,textView_phone2;
    FloatingActionButton c1,c2,s;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference name=database.getReference("Details/Name");
    DatabaseReference phone1=database.getReference("Details/n1");
    DatabaseReference mail=database.getReference("Details/email");
    DatabaseReference phone2=database.getReference("Details/n2");


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       n=findViewById(R.id.idname);
       textView_phone1=findViewById(R.id.idphone1);
       e=findViewById(R.id.idemail);
       textView_phone2=findViewById(R.id.idphone2);
       c1=findViewById(R.id.floatingcall1);
       c2=findViewById(R.id.floatingcall2);
       s=findViewById(R.id.floatingShare);
       s.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               share();
           }
       });
       c1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               callnumbertwo();

           }
       });
       c2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               callnumberone();

           }
       });




      phone1.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot)
           {
              amit1=dataSnapshot.getValue(String.class);
              textView_phone1.setText(amit1);



           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });

       name.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot)
           {
               String s=dataSnapshot.getValue(String.class);
               n.setText(s);

           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       phone2.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot)
           {
              amit2=dataSnapshot.getValue(String.class);
              textView_phone2.setText(amit2);


           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       mail.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot)
           {
               String d=dataSnapshot.getValue(String.class);
               e.setText(d);

           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
        textView_phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                callnumbertwo();

            }
        });
        textView_phone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callnumberone();
            }
        });

    }

    private void share()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="We are here to answere any question you may have about our sevices \nFeel free to ask:\n Name: Amit Kumar\n Mobile No1: 9811079213 \n  Mobile No2: 8376877999 \n  Email: sendyourloandocuments@gmail.com \n ";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        //intent.putExtra(Intent.EXTRA_TEXT,v1);
        startActivity(Intent.createChooser(intent,"Share Via"));
    }

    private void callnumbertwo()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213 "));
        startActivity(i);
    }

    private void callnumberone()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8376877999"));
        startActivity(i);

    }
}
