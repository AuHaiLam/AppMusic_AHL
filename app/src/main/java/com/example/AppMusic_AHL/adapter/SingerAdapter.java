package com.example.AppMusic_AHL.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.model.CaSi;

import java.util.List;

public class SingerAdapter extends BaseAdapter {


    Context mycontext;
    int myLayout;
    List<CaSi> arrCasi;

    public SingerAdapter(Context context, int layout, List<CaSi> caSiList) {

        mycontext = context;
        myLayout = layout;
        arrCasi = caSiList;

    }


    @Override
    public int getCount() {
        return arrCasi.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);
        TextView textView1 = convertView.findViewById(R.id.Tencasi);
        textView1.setText(arrCasi.get(position).getTencasi());


        ImageView imageView = convertView.findViewById(R.id.ivAnhcasi);
        imageView.setImageResource(arrCasi.get(position).getAnhcasi());


        return convertView;
    }
}
