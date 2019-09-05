package com.example.quicklauncher2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        if (getIntent().hasExtra("com.example.quicklauncher2.Something")){
            TextView textView = (TextView)findViewById(R.id.textView);
            String getText = getIntent().getExtras().getString("com.example.quicklauncher2.Something");
            textView.setText(getText);

        }
    }
}
