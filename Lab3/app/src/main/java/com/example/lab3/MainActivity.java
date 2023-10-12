package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username=(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.password);

        Button logbtn = (Button) findViewById(R.id.logbtn);

        //admin and admin
        logbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(username.getText().toString().equals("jafor") && password.getText().toString().equals("203002048")){
                    //correct
                    Intent intent = new Intent(getApplicationContext(),
                            temp.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"Succesfull",Toast.LENGTH_SHORT).show();
                }
                else     Toast.makeText(MainActivity.this,"UnSuccesfull",Toast.LENGTH_SHORT).show();

            }
        });
    }
}