package com.example.hm_adapter_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class SpinnerAdapter extends BaseAdapter {
    private Context context;
    private String[] items;
    private int[] images;
    private LayoutInflater inflater;

    public SpinnerAdapter(Context context, String[] items, int[] images) {
        this.context = context;
        this.items = items;
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = inflater.inflate(R.layout.spinner_item, viewGroup, false);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.imageView);
            holder.textView = view.findViewById(R.id.textView);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.textView.setText(items[i]);
        holder.imageView.setImageResource(images[i]);

        return view;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
