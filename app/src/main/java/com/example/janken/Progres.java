package com.example.janken;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;



public class Progres extends AppCompatActivity{
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
        ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar1);
        bar.setMax(100);
        bar.setProgress(80);
    }

}
