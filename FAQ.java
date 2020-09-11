package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FAQ extends AppCompatActivity
{
    TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
    FloatingActionButton pone,ptwo,sharequestion;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference one=database.getReference("FAQ/A1");
    DatabaseReference two=database.getReference("FAQ/A2");
    DatabaseReference three=database.getReference("FAQ/A3");
    DatabaseReference four=database.getReference("FAQ/A4");
    DatabaseReference five=database.getReference("FAQ/A5");
    DatabaseReference six=database.getReference("FAQ/A6");
    DatabaseReference seven=database.getReference("FAQ/A7");
    DatabaseReference eight=database.getReference("FAQ/A8");
    DatabaseReference nine=database.getReference("FAQ/A9");
    DatabaseReference ten=database.getReference("FAQ/A10");
    DatabaseReference elenven=database.getReference("FAQ/A11");
    DatabaseReference twelve=database.getReference("FAQ/A12");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       // getSupportActionBar().setTitle(" FAQ");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a1=findViewById(R.id.idtext1);
        a2=findViewById(R.id.idtext2);
        a3=findViewById(R.id.idtext3);
        a4=findViewById(R.id.idtext4);
        a5=findViewById(R.id.idtext5);
        a6=findViewById(R.id.idtext6);
        a7=findViewById(R.id.idtext7);
        a8=findViewById(R.id.idtext8);
        a9=findViewById(R.id.idtext9);
        a10=findViewById(R.id.idtext10);
        a11=findViewById(R.id.idtext11);
        a12=findViewById(R.id.idtext12);
        pone=findViewById(R.id.floatingfaqp1);
        ptwo=findViewById(R.id.floatingfaqp2);
        sharequestion=findViewById(R.id.floatingfaqshare);
        ptwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               sharetwo();
            }
        });
        sharequestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
             data();

            }
        });
        pone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareone();
            }
        });
        one.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
            String s1=dataSnapshot.getValue(String.class);
            a1.setText(s1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {

            }
        });
        two.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s2=dataSnapshot.getValue(String.class);
                a2.setText(s2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        three.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s3=dataSnapshot.getValue(String.class);
                a3.setText(s3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        four.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s4=dataSnapshot.getValue(String.class);
                a4.setText(s4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        five.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s5=dataSnapshot.getValue(String.class);
                a5.setText(s5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        six.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String six=dataSnapshot.getValue(String.class);
                a6.setText(six);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        seven.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s7=dataSnapshot.getValue(String.class);
                a7.setText(s7);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        eight.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s8=dataSnapshot.getValue(String.class);
                a8.setText(s8);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        nine.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String nine=dataSnapshot.getValue(String.class);
                a9.setText(nine);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ten.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String ten=dataSnapshot.getValue(String.class);
                a10.setText(ten);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        elenven.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s11=dataSnapshot.getValue(String.class);
                a11.setText(s11);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        twelve.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String f=dataSnapshot.getValue(String.class);
                a12.setText(f);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void data()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="Q1-\tHow can I decide which SBI home loan fits my requirement?\nAns1-\tBankBazaar gives you the option of comparing home loan schemes and an online EMI" +
                "calculator to help you plan your finances well in advance before availing a home loan.\n\n Q2-\tWhat are the various interest rates offered on home loans?\nAns2-\tInterest rates vary with respect to the subscribing customer being a woman or otherwise.\n" +
                " In the former case, the rate stands at 9.35% p.a while other customers are charged a interest rate of 9.40% p.a. These rates are irrespective of the actual loan amount.\n\n" +
                "Q3-\tWhat is the processing fee charged by SBI for home loans?\nAns3-\tSBI charges a low processing fee for its home loans. Upto 0.35% of the loan amount is charged. The amount can be maximum of Rs.11,500\n\n" +
                "Q4-\tCan I pay off my SBI home loan earlier than the initial tenure?\nAns4-\tYes. You can pay off your SBI home loan earlier too, without a pre-payment penalty fee.\n\n Q5-\tIs there any security required for the SBI home loan?\n" +
                "Ans5-, the property that is purchased using the loan serves as the security. In some cases it is at bank’s discretion to ask for additional securities like insurance policies, fixed deposits etc.\n\n" +
                "Q6-\tIs a guarantor required to sign my loan application?\nAns6-\tYes. A guarantor with all the valid and required documents need to sign your loan application.\n\n" +
                "Q7-\tCan joint-applications be made for SBI Home Loans?\nAns7-Yes. Joint applicants are welcome at SBI.\n\n Q8-Are there any tax benefits associated with SBI home loan?\n " +
                "Ans8-Yes. Tax rebate under section 80C of the Income Tax Act is applicable.\n\n Ques9-.\tHow long does it take for my loan to get sanctioned?\nAns9-\tIf all the required documents are in place then your SBI home loan can be sanctioned in a few days.\n\n" +
                "Q10-\tWhere can I apply for SBI home loan?\nAns10-With a network of over 17000 branches in India, SBI home loans can be applied at any of your nearest bank branch.\n\n" +
                "Q11-\tAre long-term home loans beneficial or short-term loans?\nAns11-\tLong-term loans are beneficial in giving you the option and comfort of lower EMIs , however, short-term loans mean higher EMIs but lesser interest." +
                " A borrower can choose the option depending upon his financial status.\n\n Q12-\tWhat kind of job makes me eligible for SBI home loan?\n Ans12-You can either be a salaried employee or self-employed for obtaining this loan. However, the only condition" +
                " is that you should be earning a regular income and should be able to furnish proofs of the same.\n\n";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        startActivity(Intent.createChooser(intent,"Share Via"));
    }

    private void shareone()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);
    }

    private void sharetwo()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8376877999"));
        startActivity(i);
    }
}
