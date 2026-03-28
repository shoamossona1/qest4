package com.example.qest11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    WebView wV;
    Button but;
    EditText eT;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = findViewById(R.id.EditText);
        wV = findViewById(R.id.WebView);
        but = findViewById(R.id.button);



        wV.getSettings().setJavaScriptEnabled(true);
        String stringurl = "https://www.walla.co.il/";
        wV.setWebViewClient(new WebViewClient());
        wV.loadUrl(stringurl);



        }
    public void go(View view) {
        String url = eT.getText().toString();
        wV.setWebViewClient(new WebViewClient());
        wV.loadUrl(url);
    }
}
