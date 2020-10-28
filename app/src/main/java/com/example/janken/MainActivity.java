package com.example.janken;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    private Button myButton;
    private Button endButton;
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("じゃんけんアプリ！！");

        myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(this);
        endButton = (Button) findViewById(R.id.endButton);
        endButton.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v==myButton){
                Intent intent = new Intent(this, JFrame.class);
                startActivityForResult(intent, 0);
            }

        if(v==endButton){
            //Intent intent = new Intent(this, Progres.class);
            //startActivityForResult(intent, 0);
            finish();
        }


    }

}