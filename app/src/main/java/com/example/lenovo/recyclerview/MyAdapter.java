package com.example.lenovo.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 1/10/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private MyViewHolder holder;
    private View view;
    private Context context;
    private final LayoutInflater inflater;
    private ArrayList<Data> dataList = new ArrayList<>();

    public MyAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = inflater.inflate(R.layout.list_item, parent, false);
        holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = dataList.get(position);
        holder.username.setText(data.getUsername());
        holder.content.setText(data.getContent());
        holder.time.setText(data.getTime());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void setListContent(ArrayList<Data> dataList) {
        this.dataList = dataList;
        notifyItemChanged(0, dataList.size());
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView username, content, time;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            username = (TextView) itemView.findViewById(R.id.user_name);
            content = (TextView) itemView.findViewById(R.id.content);
            time = (TextView) itemView.findViewById(R.id.time);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
