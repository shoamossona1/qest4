package com.example.qest5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class  MainActivity extends AppCompatActivity {
    Button but;
    int counter=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);





        }


    public void go(View view) {
        if (counter==6) {
            but.setText("Enough to click. Go to new start!");
            counter = 0;
        }
        else {
            but.setText("This is a click number:" + counter);
            counter = counter + 1;
        }
    }
}