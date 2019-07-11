package com.some.juassignmentlayoutview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button btnRed, btnGreen, resetBtn;
LinearLayout layoutRed, layoutGreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRed = (Button)findViewById(R.id.button);
        btnGreen = (Button)findViewById(R.id.button2);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        layoutRed = (LinearLayout)findViewById(R.id.l2);
        layoutGreen = (LinearLayout)findViewById(R.id.l1);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutGreen.setBackgroundColor(Color.parseColor("#e2604c"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutRed.setBackgroundColor(Color.parseColor("#3cb11e"));
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutGreen.setBackgroundColor(Color.parseColor("#3cb11e"));
                layoutRed.setBackgroundColor(Color.parseColor("#e2604c"));
            }
        });


    }
}
