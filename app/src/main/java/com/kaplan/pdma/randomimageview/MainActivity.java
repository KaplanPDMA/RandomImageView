package com.kaplan.pdma.randomimageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    int[] balls = {R.drawable.b2, R.drawable.b9, R.drawable.b13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Random r = new Random();
        int i = r.nextInt(balls.length);
        imageView.setImageResource(balls[i]);
    }
}
