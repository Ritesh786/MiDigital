package com.midigital.fujitsu.midigital.Parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.midigital.fujitsu.midigital.R;

public class ParentLoginPage extends AppCompatActivity implements View.OnClickListener {
     Button mpfinallogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parentloginpage);

        mpfinallogin = (Button) findViewById(R.id.parentfinal_login);
        mpfinallogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent parentlginint = new Intent(ParentLoginPage.this,SelectStudentPage.class);
        startActivity(parentlginint);
    }
}
