package com.example.kjhoo.sunrinton2016re;

import android.graphics.Bitmap;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class MainRecyclerItem {
    Bitmap imgae;

    public MainRecyclerItem(Bitmap imgae) {
        this.imgae = imgae;
    }
    public Bitmap getImage(){
        return this.imgae;
    }
}
