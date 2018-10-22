package com.pc.intentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public TextView name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        this.name = findViewById(R.id.textView2Name);
        Bundle extras = getIntent().getExtras();
        this.name.setText(extras.get("firstName").toString() +" "+ extras.get("lastName").toString());
    }
}
