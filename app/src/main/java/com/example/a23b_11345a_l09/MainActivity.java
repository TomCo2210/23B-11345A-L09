package com.example.a23b_11345a_l09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView main_LBL_helloWorld = findViewById(R.id.main_LBL_helloWorld);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LBL_helloWorld.setText(R.string.hello_world);
    }
}