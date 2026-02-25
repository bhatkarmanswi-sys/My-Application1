package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.submitButton);
        TextView thankYou = findViewById(R.id.thankYouText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thankYou.setVisibility(View.VISIBLE);
            }
        });
    }
}