package com.anderson.dashboardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import com.anderson.dashboardview.view.DashboardView;

public class MainActivity extends AppCompatActivity {
    DashboardView dashboardView;
    SeekBar       skBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        dashboardView = (DashboardView) findViewById(R.id.panView);
        dashboardView.setStartColor(getResources().getColor(R.color.skyblue));
        dashboardView.setEndColor(getResources().getColor(R.color.RED));
        skBar = (SeekBar) findViewById(R.id.seekBar);
        skBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                dashboardView.setPercent(progress);
                 Log.d("xsf","progress="+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
