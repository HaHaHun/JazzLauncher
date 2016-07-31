package com.example.kjhoo.sunrinton2016re;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class nextactivity extends AppCompatActivity {

    ImageView a ,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_in);
        a = (ImageView) findViewById(R.id.goback);
        b= (ImageView)findViewById(R.id.screenshot);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });//캡쳐한거 올려가져있는것처럼보이도록 미리넣어놓은거


    }
}

