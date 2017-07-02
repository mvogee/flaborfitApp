package com.matthewvogee.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Switch darkMode = (Switch)findViewById(R.id.switch_darkMode);

        darkMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                changeBGcolor(b);
            }
        });
    }

    private void changeBGcolor(boolean darkMode) {
        RelativeLayout mainBackground = (RelativeLayout)findViewById(R.id.MainBackground);
        RelativeLayout optBackground = (RelativeLayout)findViewById(R.id.optionsBackground);
        if (darkMode) {
            mainBackground.setBackgroundColor(getResources().getColor(R.color.colorBackgroundDark));
            optBackground.setBackgroundColor(getResources().getColor(R.color.colorBackgroundDark));
        }
        else {
            mainBackground.setBackgroundColor(getResources().getColor(R.color.colorBackgroudnLight));
            optBackground.setBackgroundColor(getResources().getColor(R.color.colorBackgroudnLight));
        }
    }
}
