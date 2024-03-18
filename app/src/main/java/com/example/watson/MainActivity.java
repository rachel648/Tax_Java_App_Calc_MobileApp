package com.example.watson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        number1EditText = findViewById(R.id.number1EditText);
        number2EditText = findViewById(R.id.number2EditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void addNumbers(View view) {
        // Get the numbers from the EditText fields
        String number1Str = number1EditText.getText().toString();
        String number2Str = number2EditText.getText().toString();

        try {
            // Perform addition if the input is not empty
            if (!number1Str.isEmpty() && !number2Str.isEmpty()) {
                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);

                // Calculate the sum
                double sum = number1 + number2;

                // Display the result in the TextView with two decimal places
                resultTextView.setText(String.format("Result: %.2f", sum));
            } else {
                // Handle empty input
                resultTextView.setText("Please enter both numbers.");
            }
        } catch (NumberFormatException e) {
            // Handle the case where input cannot be parsed to a double
            resultTextView.setText("Invalid input. Please enter valid numbers.");
        }
    }
}
