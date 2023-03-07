package com.example.aquae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button setRemindersBtn = findViewById(R.id.button);
        final Button modifyAlarmsBtn = findViewById(R.id.button2);
        final Button deleteAlarmsBtn = findViewById(R.id.button3);

        setRemindersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,SetAlarms.class);
                startActivity(intent);
                finish();
            }
        });

        modifyAlarmsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ModifyAlarms.class);
                startActivity(intent);
                finish();
            }
        });
    }
}