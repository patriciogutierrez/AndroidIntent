package com.pc.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView firstName;
    public TextView lastName;
    public Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.firstName = findViewById(R.id.editTextFirstName);
        this.lastName =findViewById(R.id.editTextLastName);
        this.buttonContinue = findViewById(R.id.buttonActivity2);
        this.buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentActivity2();
            }
        });

    }

    private void intentActivity2() {
        Intent i = new Intent(getApplicationContext(),Activity2.class);
        i.putExtra("firstName", this.firstName.getText());
        i.putExtra("lastName", this.lastName.getText());

        startActivity(i);

    }

}
