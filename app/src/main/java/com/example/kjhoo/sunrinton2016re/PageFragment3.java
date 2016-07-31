package com.example.kjhoo.sunrinton2016re;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kjhoo on 2016-07-22.
 */
public class PageFragment3 extends Fragment {
    String text;
    Button a;
    ImageView imageViewm,imageView2;
    TextView textView;
    LinearLayout layout1,layout2,layout3;

    public PageFragment3(String text) {
        this.text = text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main3, container, false);
        a = (Button)view.findViewById(R.id.asdasfq);
        imageViewm = (ImageView)view.findViewById(R.id.underline);
        textView = (TextView)view.findViewById(R.id.maketext);
        imageView2 = (ImageView)view.findViewById(R.id.asdgwdheq);
        layout1 = (LinearLayout)view.findViewById(R.id.file1);
        layout2 = (LinearLayout)view.findViewById(R.id.file2);
        layout3 = (LinearLayout)view.findViewById(R.id.file3);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("친구 2");
                imageView2.setBackgroundResource(R.drawable.folder);
                imageViewm.setBackgroundColor(000000);
            }
        });
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),nextactivity.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),nextactivity.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),nextactivity.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
