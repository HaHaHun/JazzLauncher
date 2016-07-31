package com.example.kjhoo.sunrinton2016re;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class Listviewitem {
    private String name;
    private Image image;

    public String getName(){
        return name;
    }
    public Image getImage() {
        return image;
    }

    public Listviewitem( String name , Image image)
    {
        this.name = name;
        this.image = image;
    }
}
