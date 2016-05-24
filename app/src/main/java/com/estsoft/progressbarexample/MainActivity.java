package com.estsoft.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarCircle;
    private ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarCircle = (ProgressBar)findViewById(R.id.progressCircle);
        progressBarCircle.setProgress(0);
        progressBarHorizontal = (ProgressBar)findViewById(R.id.progressHorizontal);
        progressBarHorizontal.setProgress(0);
    }

    public void onButtonClick(View v){
        switch (v.getId()){
            case R.id.buttonToggleProgressCircle : {
                boolean isChecked = ((ToggleButton)v).isChecked();
                progressBarCircle.setVisibility(!isChecked ? View.VISIBLE : View.INVISIBLE);
                break;
            }

            case R.id.buttonProgressBarPrimaryIncrease : {
                progressBarHorizontal.incrementProgressBy(1);
                break;
            }

            case R.id.buttonProgressBarPrimaryDecrease : {
                progressBarHorizontal.incrementProgressBy(-1);
                break;
            }

            case R.id.buttonProgressBarSecondaryIncrease : {
                progressBarHorizontal.incrementSecondaryProgressBy(1);
                break;
            }

            case R.id.buttonProgressBarSecondaryDecrease : {
                progressBarHorizontal.incrementSecondaryProgressBy(-1);
                break;
            }

            default:
                break;
        }
    }
}
