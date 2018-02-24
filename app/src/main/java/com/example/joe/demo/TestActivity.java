package com.example.joe.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button action = findViewById(R.id.action);
        action.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.action :
                TextView display = findViewById(R.id.userDisplay);
                EditText input = findViewById(R.id.userInput);
                display.setText(input.getText().toString());
        }
    }
}
