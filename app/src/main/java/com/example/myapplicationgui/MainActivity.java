package com.example.myapplicationgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText TxtN1;
 private EditText TxtN2;
 private TextView txtResult
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtN1 = findViewById(R.id.TxtN1);
        TxtN2 = findViewById(R.id.TxtN2);
        TxtN1 = findViewById(R.id.txtResult);
    }
}