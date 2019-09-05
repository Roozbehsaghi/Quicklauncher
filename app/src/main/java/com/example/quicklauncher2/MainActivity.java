package com.example.quicklauncher2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextPageButton = (Button)findViewById(R.id.nextPageButton);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPagetIntent = new Intent(getApplicationContext(), SecondPageActivity.class);
                nextPagetIntent.putExtra("com.example.quicklauncher2.Something", "You clicked me?");
                startActivity(nextPagetIntent);
            }
        });

        Button linkedInButton = (Button)findViewById(R.id.Git_Hub_btn);
        linkedInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gitHub = "https://github.com/Roozbehsaghi?tab=repositories";
                Uri goToWebAddress = Uri.parse(gitHub);

                Intent webAddressIntent = new Intent(Intent.ACTION_VIEW, goToWebAddress);
                startActivity(webAddressIntent);
            }
        });
    }
}
