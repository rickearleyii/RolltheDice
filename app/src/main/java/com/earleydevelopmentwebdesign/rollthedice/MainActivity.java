package com.earleydevelopmentwebdesign.rollthedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create variables to hold views and retrieve them from resource id
        Button rollButton = findViewById(R.id.rollbutton);
        final ImageView rightDice_image = findViewById(R.id.rightDice_image);
        final ImageView leftDice_image = findViewById(R.id.leftDice_image);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        //listener to roll button
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Button clicked!");
                //create a random number object and variable to hold random number
                Random randomNumberGenerator = new Random();
                //bound equals Max minus 1
                int randomNumber = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "Random number is: " + randomNumber);
                //setting the image of the dice array to random number
                rightDice_image.setImageResource(diceArray[randomNumber]);
                randomNumber = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "2nd Random number is: " + randomNumber);
               leftDice_image.setImageResource(diceArray[randomNumber]);
            }
        });


    }
}
