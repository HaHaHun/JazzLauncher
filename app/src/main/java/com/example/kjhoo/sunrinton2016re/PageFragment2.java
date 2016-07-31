package com.example.kjhoo.sunrinton2016re;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kjhoo on 2016-07-22.
 */
public class PageFragment2 extends Fragment {
    String text;
    public PageFragment2(String text) {
        this.text = text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main2, container, false);

        return view;
    }
}
