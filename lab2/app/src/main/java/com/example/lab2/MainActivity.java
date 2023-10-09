package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button ansbtn;
    TextView showans;
    EditText value;
    RadioButton ctof,ftoc;
    Double x;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ansbtn=(Button) findViewById(R.id.ansbtn);
        showans=(TextView) findViewById(R.id.showans);
        value=(EditText) findViewById(R.id.value);
        ctof=(RadioButton) findViewById(R.id.ctof);
        ftoc=(RadioButton) findViewById(R.id.ftoc);
        ansbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value.getText().toString().isEmpty()){
                    showans.setText("please enter any value");
                }
                else {
                    x=Double.parseDouble(String.valueOf(value.getText()));
                    if(ctof.isChecked()){
                        x=(x*9)/5+32;
                        showans.setText(String.valueOf(x));
                    } else if (ftoc.isChecked()) {
                        x=(x-32)*5/9;
                        showans.setText(String.valueOf(x));
                    }
                }
            }
        });

    }
}