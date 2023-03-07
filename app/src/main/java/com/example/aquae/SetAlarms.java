package com.example.aquae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.google.android.material.slider.RangeSlider;

public class SetAlarms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarms);
        RangeSlider rangeSlider = findViewById(R.id.continuousSlider);
        rangeSlider.addOnSliderTouchListener(new RangeSlider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull RangeSlider slider) {
                Log.d("onStartTrackingTouch",slider.getValues().toString());
            }

            @Override
            public void onStopTrackingTouch(@NonNull RangeSlider slider) {
                Log.d("onStopTrackingTouch", slider.getValues().toString());
            }
        });

    }

}