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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class JFrame extends AppCompatActivity implements OnClickListener{
    private Button button1;
    private Button button2;
    private Button button3;

    int kidou = 0 ;

    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_top);
            setTitle("ボタンを押してね！！");
            button1 = (Button) findViewById(R.id.button1);
            button1.setOnClickListener(this);
            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(this);
            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(this);
            kidou =1 ;
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // オプションメニューを作成する
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item1) {
        switch (item1.getItemId()) {
            case R.id.item1:
                // ボタンをタップした際の処理を記述
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("アプリを終了します。またね～～！")
                        .setPositiveButton("タイトルへ", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            // ボタンをクリックしたときの動作
                                finish();
                            }
                        });
                builder.show();
                break;
        }
        return true;
    }

    public void onClick(View w){
        if(w==button1){
            ImageView img = (ImageView)findViewById(R.id.imageView2);
            img.setBackgroundResource(R.drawable.ani01);

            Random random = new Random();
            int rom = random.nextInt(3);
            if(rom==0){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani03);
            }else if (rom==1){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani02);
            }else{
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani01);
            }



            //Intent intent = new Intent(this, MainActivity.class);
            //startActivityForResult(intent, 0);
        }else if (w==button2){
            ImageView img = (ImageView)findViewById(R.id.imageView2);
            img.setBackgroundResource(R.drawable.ani03);

            Random random = new Random();
            int rom = random.nextInt(3);
            if(rom==0){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani03);
            }else if (rom==1){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani02);
            }else{
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani01);
            }


            //Intent intent = new Intent(this, MainActivity.class);
            //startActivityForResult(intent, 0);
        }else {
            ImageView img = (ImageView)findViewById(R.id.imageView2);
            img.setBackgroundResource(R.drawable.ani02);

            Random random = new Random();
            int rom = random.nextInt(3);
            if(rom==0){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani03);
            }else if (rom==1){
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani02);
            }else{
                ImageView img2 = (ImageView)findViewById(R.id.imageView3);
                img2.setBackgroundResource(R.drawable.ani01);
            }


            //Intent intent = new Intent(this, MainActivity.class);
            //startActivityForResult(intent, 0);
        }

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        ImageView img = (ImageView)findViewById(R.id.imageView2);
        ImageView img2 = (ImageView)findViewById(R.id.imageView3);
        // AnimationDrawableのXMLリソースを指定
        img.setBackgroundResource(R.drawable.android_animation);
        img2.setBackgroundResource(R.drawable.android_animation);
        // AnimationDrawableを取得
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        AnimationDrawable frameAnimation2 = (AnimationDrawable) img2.getBackground();
        // アニメーションの開始
        frameAnimation.start();
        frameAnimation2.start();
    }

}
