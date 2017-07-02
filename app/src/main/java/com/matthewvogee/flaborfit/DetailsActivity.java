package com.matthewvogee.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            if (MainActivity.OptDarkMode)
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalWeightsBlue, getApplicationContext().getTheme()));
            else
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalWeightsBlue, getApplicationContext().getTheme()));
        }
        else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            if (MainActivity.OptDarkMode)
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalYogaPurp, getApplicationContext().getTheme()));
            else
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalYogaPurp, getApplicationContext().getTheme()));
        }
        else {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            if (MainActivity.OptDarkMode)
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalCardioGreen, getApplicationContext().getTheme()));
            else
                mainBG.setBackgroundColor(getResources().getColor(R.color.normalCardioGreen, getApplicationContext().getTheme()));
        }
    }
}
