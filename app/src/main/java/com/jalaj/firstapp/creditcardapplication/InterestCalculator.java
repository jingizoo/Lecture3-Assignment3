package com.jalaj.firstapp.creditcardapplication;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by jalajmehta on 7/2/16.
 */

public class InterestCalculator implements View.OnClickListener {

    private Context ctx;
    float prncple, rate, interestPaid, payment;
    int timeFrame;
EditText edTxtPriniciple, edTxtRate;
    EditText edTxtMonthsRemaining, edTxtInterestPaid,edTxtPayment;
    @Override
    public void onClick(View v) {
        prncple = Float.parseFloat(edTxtPriniciple.getText().toString());
        this.rate = Float.parseFloat( edTxtRate.getText().toString());
        this.payment = Float.parseFloat( edTxtPayment.getText().toString());
       while (prncple > 1)
       {
           float interest = getInterestPaid(this.prncple,this.rate);
           Log.d("principe + interest",this.prncple+" "+interest+" "+payment+" "+rate);
           prncple = getRemainingBalance(this.prncple,interest);
           timeFrame++;
           interestPaid = interestPaid+interest;
       }
        display();

    }

    public  InterestCalculator(Context ctx, EditText edTxtPrinciple, EditText edTxtRate,EditText edTxtPayment, EditText edTxtMonthsRemaining, EditText edTxtInterestPaid){

        this.ctx = ctx;
this.edTxtRate = edTxtRate;
        this.edTxtPriniciple = edTxtPrinciple;
this.edTxtInterestPaid = edTxtInterestPaid;
        this.edTxtMonthsRemaining = edTxtMonthsRemaining;
        this.edTxtPayment = edTxtPayment;
    }


    public float getInterestPaid(float principle, float rate){

        if (rate>0) {
            return principle * rate / (100 * 12);
        }
        return (float)0;
    }

    public float getRemainingBalance (float principle, float interest)
    {
        return principle + interest -payment;
    }

    public void display()
    {
        edTxtMonthsRemaining.setText((CharSequence)(timeFrame+""));
        edTxtInterestPaid.setText((CharSequence)(interestPaid+""));
    }

}
