package com.example.risbo.worldtraveler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static final int[] COUNTRIES = {
            R.drawable.uk,
            R.drawable.australia,
            R.drawable.brazil,
            R.drawable.jamaica

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.countries);
        for (int id : COUNTRIES) { // int id : COUNTRIES to go through the entire int array
            ImageView img = new ImageView(this);
            img.setImageResource(id);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, // width
                    ViewGroup.LayoutParams.WRAP_CONTENT); // height
            params.setMargins(10,10,10,10);
            img.setLayoutParams(params);
            layout.addView(img);
        }
    }
}
