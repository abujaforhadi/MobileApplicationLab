package com.example.ctf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText fahrenheitEditText;
    private TextView celsiusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahrenheitEditText = findViewById(R.id.fahrenheitEditText);
        celsiusTextView = findViewById(R.id.celsiusTextView);

        findViewById(R.id.convertButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the Fahrenheit temperature from the EditText widget.
                float fahrenheitTemperature = Float.parseFloat(fahrenheitEditText.getText().toString());

                // Convert the Fahrenheit temperature to Celsius.
                float celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;

                // Display the Celsius temperature in the TextView widget.
                celsiusTextView.setText(String.valueOf(celsiusTemperature) + " °C");
            }
        });
    }
}
