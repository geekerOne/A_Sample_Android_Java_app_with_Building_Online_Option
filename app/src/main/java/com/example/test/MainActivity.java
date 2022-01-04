package com.example.test;

import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast toastMessage;//for showing message
        toastMessage = Toast.makeText(MainActivity.this, "Hello World!",
        Toast.LENGTH_LONG);
        toastMessage.show();
        
    }

}
