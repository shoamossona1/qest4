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

                }
            }
        });
    }
}
