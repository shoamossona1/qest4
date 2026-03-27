package com.example.qest9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button but;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        but = findViewById(R.id.button);
        et = findViewById(R.id.Edit_text);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String str = et.getText().toString();
                int num = Integer.parseInt(str);

                if (num % 7 == 0) {
                    but.setText("boom");
                }   else {
                    but.setText(String.valueOf(num));
                    }
                }
            });
        ;}
    }

