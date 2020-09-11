package com.loans.homeloans;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class EMI extends AppCompatActivity
{
EditText editTextamount,editTextrate,editTexttime;
TextInputLayout layoutamount,layoutrate,layouttime;
TextView TextView1;
DecimalFormat decimalFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
        editTextamount=findViewById(R.id.idamount);
        editTextrate=findViewById(R.id.idrate);
        editTexttime=findViewById(R.id.idtime);
        TextView1=findViewById(R.id.idemi);
        layoutamount=findViewById(R.id.idinput1);
        layoutrate=findViewById(R.id.idinput2);
        layouttime=findViewById(R.id.idinput3);
        decimalFormat=new DecimalFormat("##.00");
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void ClearData(View view)
    {
        if(editTexttime.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Time is empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            editTexttime.setText("");
        }
        if(editTextrate.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Rate is empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            editTextrate.setText("");
        }
        if(editTextamount.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Amount is empty", Toast.LENGTH_SHORT).show();
        }
        else {
            editTextamount.setText("");

        }


        TextView1.setText("");

    }

    public void Check(View view)
    {
        boolean flag=true;
        if(editTextamount.getText().toString().isEmpty())
        {
            layoutamount.setError("Plz Enter Amount");
            flag=false;
        }
        else
        {
            layoutamount.setErrorEnabled(false);
        }
        if(editTextrate.getText().toString().isEmpty())
        {
            layoutrate.setError("Plz Enter Rate");
            flag=false;

        }
        else
        {
            layoutrate.setErrorEnabled(false);
        }
        if(editTexttime.getText().toString().isEmpty())
        {
            layouttime.setError("Plz Enter Time");
            flag=false;
        }
        else
        {
            layouttime.setErrorEnabled(false);
        }
        if(flag)
        {
            layoutamount.setErrorEnabled(false);
            layoutrate.setErrorEnabled(false);
            layouttime.setErrorEnabled(false);
            String s1 = editTextamount.getText().toString();
            String s2 = editTextrate.getText().toString();
            String s3 = editTexttime.getText().toString();
            float amount = Float.parseFloat(s1);
            float rate = Float.parseFloat(s2);
            rate = rate / (12 * 100);
            float time = Float.parseFloat(s3);
            time = time * 12;
           float d = (float) (Math.pow(1 + rate, time) - 1);
            float emi = (float) ((amount * rate * Math.pow(1 + rate, time)) / d);
            String d1=decimalFormat.format(emi);

           // double d1=decimalFormat.format(emi);
           // String finalvalue=String.valueOf(emi);
           TextView1.setText(d1);

        }

    }
}
