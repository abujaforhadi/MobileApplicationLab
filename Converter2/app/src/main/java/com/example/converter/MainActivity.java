package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ans;
    TextView showans;
    EditText value;
    RadioButton ctof,ftoc;
    Double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=(Button) findViewById(R.id.ans);
        showans=(TextView) findViewById(R.id.showans);
        value=(EditText) findViewById(R.id.value);
        ctof=(RadioButton) findViewById(R.id.ctof);
        ftoc=(RadioButton) findViewById(R.id.ftoc);
        showans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value.getText().toString().isEmpty()){
                    showans.setText("Please Enter any value");
                }
                else {
                    x=Double.parseDouble(String.valueOf(value.getText()));
                    if(ctof.isChecked()){
                        x=(x*9)/5+32;
                        showans.setText(String.valueOf(x)+"F");
                    } else if (ftoc.isChecked()) {
                        x=(x-32)*5/9;
                        showans.setText(String.valueOf(x)+"C");
                    }
                }
            }
        });

    }
}