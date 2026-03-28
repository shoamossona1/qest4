package com.example.qest12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch sW;
    ToggleButton tB;
    Button btn;
    int of=0;
    int on=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sW = findViewById(R.id.Switch1);
        tB = findViewById(R.id.ToggleButton);
        btn = findViewById(R.id.Button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sW.isChecked()) {
                    on = 1;
                } else {
                    on = 0;
                }

                if (tB.isChecked()) {
                    of = 1;
                } else {
                    of = 0;
                }

                if (on == 1 && of == 1) {
                    findViewById(android.R.id.content).setBackgroundColor(
                            android.graphics.Color.parseColor("#FC0000"));
                }
                else if (on == 1 && of == 0) {
                    findViewById(android.R.id.content).setBackgroundColor(
                            android.graphics.Color.parseColor("#00FC00"));
                }
                else if (on == 0 && of == 1) {
                    findViewById(android.R.id.content).setBackgroundColor(
                            android.graphics.Color.parseColor("#0000FC"));
                }
                else {
                    findViewById(android.R.id.content).setBackgroundColor(
                            android.graphics.Color.parseColor("#9600FF"));
                }
            }
        });
    }
}