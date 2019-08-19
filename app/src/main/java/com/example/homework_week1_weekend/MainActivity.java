package com.example.homework_week1_weekend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int PICTURE_REQUEST = 1;
    static final int EMI_REQUEST = 2;
    static final int BROWSER_REQUEST = 5;
    static final int BINARY_REQUEST = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takePicture(View view){
        Intent pictureIntent = new Intent(this, picture_activity.class);
        startActivityForResult(pictureIntent, PICTURE_REQUEST);
    }

    public void launchEMI(View view) {
        Intent intentEMI = new Intent(this, EMIActivity.class);
        startActivityForResult(intentEMI, EMI_REQUEST);
    }

    public void launchBrowser(View view) {
        Intent intentBrowser = new Intent(this, BrowserClass.class);
        startActivityForResult(intentBrowser, BROWSER_REQUEST);
    }

    public void launchBinary(View view) {
        Intent intentEMI = new Intent(this, BinaryActivity.class);
        startActivityForResult(intentEMI, BINARY_REQUEST);
    }
}
