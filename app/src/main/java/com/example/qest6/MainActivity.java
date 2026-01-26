package com.example.qest6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView Tv;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv = findViewById(R.id.Tv);


    }

    //
    public void go(View view) {

        counter = counter + 1;


        if (counter == 6) {
            Tv.setText("Enough to click. Go to new start!");
            counter = 0;
        } else {
            Tv.setText("This is a click number:" + counter);

        }
    }
}

