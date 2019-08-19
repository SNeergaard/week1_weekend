package com.example.homework_week1_weekend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EMIActivity extends AppCompatActivity {
    private Double loanAmount;
    private Double interestRate;
    private Integer loanTenure;
    private Double loanPayment;
    private Double Total;

    private EditText etAmount, etInterest, etTenure;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);

        etAmount = findViewById(R.id.etAmount);
        etInterest = findViewById(R.id.etInterest);
        etTenure = findViewById(R.id.etTenure);
        tvTotal = findViewById(R.id.tvTotal);

    }

    public void get_EMI(View view) {
        loanAmount = Double.parseDouble(etAmount.getText().toString());
        interestRate = (Double.parseDouble(etInterest.getText().toString()))/100;
        loanTenure = Integer.parseInt(etTenure.getText().toString());
        loanPayment = (interestRate/loanTenure);
        Total = loanAmount*loanPayment*Math.pow(1+loanPayment,loanTenure)/(Math.pow(1+loanPayment,loanTenure)-1);
        tvTotal.setText(Total.toString());
    }
}
