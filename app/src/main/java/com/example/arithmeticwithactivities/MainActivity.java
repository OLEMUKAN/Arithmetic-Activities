package com.example.arithmeticwithactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button addBtn, subBtn, divBtn, multiBtn, exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addBtn = findViewById(R.id.additionButton);
        subBtn = findViewById(R.id.subtractionButton);
        divBtn = findViewById(R.id.divisionButton);
        multiBtn = findViewById(R.id.multiplyButton);
        exitBtn = findViewById(R.id.ExitButton);

        addition();
        subtraction();
        multiplications();
        division();
        exit();
    }

    private void exit() {
        exitBtn.setOnClickListener(v-> finish());
    }

    private void division() {
        divBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,DivisionActivity.class)));
    }

    private void addition(){
        addBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,AddActivity.class)));
    }
    private void subtraction(){
        subBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,SubtractionActivity.class)));
    }
    private void multiplications(){
        multiBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MultiplicationActivity.class)));
    }

}