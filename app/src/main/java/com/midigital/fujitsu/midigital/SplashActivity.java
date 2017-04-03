
package com.midigital.fujitsu.midigital;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread splashthread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                    runOnUiThread(new Runnable() {
                        public void run() {
                            startActivity(new Intent(SplashActivity.this, MainActivity.class));
                            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        }
                    });
                    finish();
                    overridePendingTransition(R.anim.fadein,R.anim.fadeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        splashthread.start();

    }
    @Override
    public void onBackPressed() {

    }

    }

