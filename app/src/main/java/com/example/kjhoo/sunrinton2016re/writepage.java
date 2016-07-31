package com.example.kjhoo.sunrinton2016re;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class writepage extends AppCompatActivity{
    Bitmap myBitmap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Log.d("asdf",intent.getStringExtra("imageLocation"));
        String location = intent.getStringExtra("imageLocation");
        ImageView image = (ImageView) findViewById(R.id.image_write);
        EditText editText = (EditText) findViewById(R.id.edit);
        if(location != null){
            File imageFile = new File(location);
            if(imageFile.exists()){
                myBitmap = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
                image.setImageBitmap(myBitmap);
            }
        }
        findViewById(R.id.image_upload).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(writepage.this, MainActivity.class);
                PageFragment.items.add(new MainRecyclerItem(myBitmap));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.upload:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
