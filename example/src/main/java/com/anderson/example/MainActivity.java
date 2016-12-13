package com.anderson.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.anderson.dashboardview.view.DashboardView;

public class MainActivity extends AppCompatActivity {
    DashboardView dashboardView;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dashboardView = (DashboardView) findViewById(R.id.dashboardView);
//        dashboardView.setStartColor(getResources().getColor(R.color.GREEN));
//        dashboardView.setEndColor(getResources().getColor(R.color.RED));
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                dashboardView.setPercent(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TestActivity.class);
                startActivity(i);
            }
        });
        findViewById(R.id.visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dashboardView.getVisibility() == View.VISIBLE) {
                    dashboardView.setVisibility(View.GONE);
                } else {
                    dashboardView.setVisibility(View.VISIBLE);
                }
            }
        });

    }


}
