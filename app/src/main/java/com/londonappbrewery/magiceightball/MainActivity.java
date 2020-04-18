package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] arrayBall ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final ImageView img = (ImageView)findViewById(R.id.imageView);
        Button ask_btn = (Button)findViewById(R.id.ask);
        ask_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random number = new Random();
                int val = number.nextInt(5);

                img.setImageResource(arrayBall[val]);

            }
        });

    }

}
