package com.example.janken;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;



public class Progres extends AppCompatActivity{
    private Button button_pro;
    private  ProgressBar progressBar;
    private int percent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
        ProgressBar progressBar1 = (ProgressBar)findViewById(R.id.progressBar);
        progressBar1.setMax(100); // 水平プログレスバーの最大値を設定
        progressBar1.setProgress(20); // 水平プログレスバーの値を設定
        progressBar1.setSecondaryProgress(60); // 水平プログレスバーのセカンダリ値を設定


    }

}
