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

public class SubtractionActivity extends AppCompatActivity {
    Button subBtn, backBtn;
    TextView result;
    EditText firstNum, secondNum;
    Double num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        subBtn = findViewById(R.id.buttonSub);
        backBtn = findViewById(R.id.backButton);
        result = findViewById(R.id.Result);
        firstNum = findViewById(R.id.firstNumber);
        secondNum = findViewById(R.id.secondNumber);

        subtraction();
        closeActivity();
    }

    private void subtraction() {
        subBtn.setOnClickListener(v -> {
            num1 = Double.parseDouble(firstNum.getText().toString());
            num2 = Double.parseDouble(secondNum.getText().toString());
            sum = num1 - num2;
            result.setText(String.format(Locale.getDefault(), "%.2f", sum));
        });
    }
    private void closeActivity() {
        backBtn.setOnClickListener(v -> finish());
    }

}