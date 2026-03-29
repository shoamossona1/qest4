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
    /**
     * Changes the background color of the screen according to the checked RadioButton.
     * There are 4 possible background colors:
     * rb1 - Red, rb2 - Green, rb3 - Blue, rb4 - Purple.
     */

    public void change(View view) {
        if (!sw.isChecked()) {
            changeBackground(rg.getCheckedRadioButtonId());
        }
    }

    public void changeBackground(int checkedId) {
        if (checkedId == R.id.rb1) {
            findViewById(android.R.id.content).setBackgroundColor(
                    android.graphics.Color.parseColor("#FC0000")); // אדום
        }
        else if (checkedId == R.id.rb2) {
            findViewById(android.R.id.content).setBackgroundColor(
                    android.graphics.Color.parseColor("#00FC00")); // ירוק
        }
        else if (checkedId == R.id.rb3) {
            findViewById(android.R.id.content).setBackgroundColor(
                    android.graphics.Color.parseColor("#0000FC")); // כחול
        }
        else if (checkedId == R.id.rb4) {
            findViewById(android.R.id.content).setBackgroundColor(
                    android.graphics.Color.parseColor("#9600FF")); // סגול
        }
    }
}


