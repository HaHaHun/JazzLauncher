package com.example.kjhoo.sunrinton2016re;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class asdf extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asdf);
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap)intent.getParcelableExtra("image");
        ImageView imageView = (ImageView) findViewById(R.id.image_big);
        imageView.setImageBitmap(bitmap);
    }
}
