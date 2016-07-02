package com.jalaj.firstapp.creditcardapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText tvPrinciple, tvInterest, tvPayment, tvcardBalance, tvMonthsRemaining,tvInterestPaid;
    Button bCompute,bClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grid);


        tvPrinciple = (EditText) findViewById(R.id.edTxt_card_balance);
        tvInterest = (EditText) findViewById(R.id.edTxt_ylyInterest);
        tvPayment = (EditText) findViewById(R.id.edTxt_minPayment);
        tvcardBalance = (EditText) findViewById(R.id.edTxt_card_balance);
        tvMonthsRemaining = (EditText) findViewById(R.id.edtxt_months_remaining);
         tvInterestPaid = (EditText) findViewById(R.id.edtxt_interest_paid);
        bCompute = (Button)findViewById(R.id.btn_Calculate);
        InterestCalculator ic = new InterestCalculator(getApplicationContext(),tvPrinciple,tvInterest,tvPayment,tvMonthsRemaining,tvInterestPaid);

        bCompute.setOnClickListener(ic);

        tvPrinciple.setText("1000");
        tvPayment.setText("100");
        tvInterest.setText("36");

    }


}
