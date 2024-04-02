package com.example.arithmeticwithactivities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class DivisionActivity extends AppCompatActivity {
    Button divBtn, backBtn;
    TextView result;
    EditText firstNum, secondNum;
    Double num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        divBtn = findViewById(R.id.buttonDiv);
        backBtn = findViewById(R.id.backButton);
        result = findViewById(R.id.Result);
        firstNum = findViewById(R.id.firstNumber);
        secondNum = findViewById(R.id.secondNumber);

        division();
        closeActivity();
    }
    private void division() {
        divBtn.setOnClickListener(v -> {
            num1 = Double.parseDouble(firstNum.getText().toString());
            num2 = Double.parseDouble(secondNum.getText().toString());
            sum = num1 / num2;
            result.setText(String.format(Locale.getDefault(), "%.2f", sum));
        });
    }
    private void closeActivity() {
        backBtn.setOnClickListener(v -> finish());
    }
}