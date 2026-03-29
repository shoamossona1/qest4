package com.example.qest13;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioGroup rg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.Switch);
        rg = findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (sw.isChecked()) {
                    changeBackground(checkedId);
                }
            }
        });
    }

    public void change(View view) {
        if (!sw.isChecked()) {
            changeBackground(rg.getCheckedRadioButtonId());
        }
    }

    public void changeBackground(int checkedId) {
        if (checkedId == R.id.rb1) {
            findViewById(android.R.id.content).setBackgroundColor(
                    android.graphics.Color.parseColor("#FC0000"));

    }
}
