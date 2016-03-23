package com.example.risbo.worldtraveler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
  /*  private static final int[] COUNTRIES = {
            R.drawable.uk,
            R.drawable.australia,
            R.drawable.brazil,
            R.drawable.jamaica

    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  LinearLayout layout = (LinearLayout) findViewById(R.id.countries);
        for (int id : COUNTRIES) { // int id : COUNTRIES to go through the entire int array
//            ImageView img = new ImageView(this);
//            img.setImageResource(id);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT, // width
//                    ViewGroup.LayoutParams.WRAP_CONTENT); // height
//            params.setMargins(10,10,10,10);
//            img.setLayoutParams(params);
//            layout.addView(img);


            View country = getLayoutInflater().inflate(R.layout.country,null); // when you call getLayoutInflater() it goes to the XML file, reads the XML tags,; turns into Java object and it returns a type View
            ImageView flag = (ImageView) country.findViewById(R.id.countryflag);
            flag.setImageResource(id);
            layout.addView(country);*/

        addCountry("UK",R.drawable.uk,true);
        addCountry("Australia",R.drawable.australia,false);
        addCountry("Brazil",R.drawable.brazil,false);
        addCountry("Jamaica",R.drawable.jamaica,false);



    }

    // When you talk to an OUTSIDE variable to an INSIDE class, you have to make the variable "final"

    private void addCountry(final String name, int imageID, boolean visited){
        LinearLayout layout = (LinearLayout) findViewById(R.id.countries);
        //for (int id : COUNTRIES) { // int id : COUNTRIES to go through the entire int array
//            ImageView img = new ImageView(this);
//            img.setImageResource(id);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT, // width
//                    ViewGroup.LayoutParams.WRAP_CONTENT); // height
//            params.setMargins(10,10,10,10);
//            img.setLayoutParams(params);
//            layout.addView(img);


            View country = getLayoutInflater().inflate(R.layout.country,null); // when you call getLayoutInflater() it goes to the XML file, reads the XML tags,; turns into Java object and it returns a type View

            TextView textView = (TextView) country.findViewById(R.id.countryname);  // /!\ DONT FORGET TO PUT country. before findViewById because you want to check the country XML /!\
            textView.setText(name);

            ImageView flag = (ImageView) country.findViewById(R.id.countryflag); // /!\ DONT FORGET TO PUT country. before findViewById because you want to check the country XML /!\
            flag.setImageResource(imageID);

            CheckBox visitedBox = (CheckBox) country.findViewById(R.id.countryvisited); // /!\ DONT FORGET TO PUT country. before findViewById because you want to check the country XML /!\
            visitedBox.setChecked(visited);

            Button bomb = (Button) country.findViewById(R.id.countrybomb); // /!\ DONT FORGET TO PUT country. before findViewById because you want to check the country XML /!\
            bomb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"KABOOM ! You bombed "+ name,Toast.LENGTH_SHORT).show();
                }
            });

            layout.addView(country);
       // }

    }


}
