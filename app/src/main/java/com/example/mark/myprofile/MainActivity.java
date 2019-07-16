package com.example.mark.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.ALCButton);
        Button buttonTwo = findViewById(R.id.button2);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // System.out.println("Button Clicked");
                Intent AlcPageIntent = new Intent(getApplicationContext(), AlcPage.class);
                startActivity(AlcPageIntent);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // System.out.println("Button Clicked");
                Intent AlcPageIntent = new Intent(getApplicationContext(), MarkProfile.class);
                startActivity(AlcPageIntent);
            }
        });
    }
}
