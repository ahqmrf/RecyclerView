package com.example.lenovo.recyclerview;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    private ArrayList<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MyAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        updateRecyclerViewContent();
    }

    private void updateRecyclerViewContent() {
        for (int count = 0; count < 50; count++) {
            Data data = new Data();
            data.setUsername("Ariful Hoque Maruf");
            data.setContent("Brainstation 23");
            data.setTime(System.currentTimeMillis() + "");
            dataList.add(data);
        }

        adapter.setListContent(dataList);
        recyclerView.setAdapter(adapter);
    }
}
