package com.example.kjhoo.sunrinton2016re;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kjhoo on 2016-07-22.
 */
public class PageFragment extends Fragment {
    String text;
    public PageFragment(String text) {
        this.text = text;
    }

    RecyclerView recyclerView;
    MainRecyclerAdapter adapter;
    public static List<MainRecyclerItem>items = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        final int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300.0f,
                this.getResources().getDisplayMetrics());
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int totalWidth = parent.getWidth();
                int cardView = px;
                int sidePadding = (totalWidth - cardView)/2;
                sidePadding = Math.max(0, sidePadding);
                outRect.set(sidePadding, 5, sidePadding, 5);
            }
        });
//        items.add(new MainRecyclerItem(R.drawable.sample_image));
        adapter = new MainRecyclerAdapter(items);

        recyclerView.setAdapter(adapter);
        return view;
    }
}
