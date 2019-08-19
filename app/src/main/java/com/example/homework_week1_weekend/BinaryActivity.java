package com.example.homework_week1_weekend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BinaryActivity extends AppCompatActivity {

    private EditText etNumber;
    private TextView tvNumber;

    private String number;
    private Integer binary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        etNumber = findViewById(R.id.etNumber);
        tvNumber = findViewById(R.id.tvNumber);
    }

    public void launchConvert(View view) {
        number = etNumber.getText().toString();
        binary = Integer.parseInt(number,2);
        tvNumber.setText(binary.toString());
    }
}
