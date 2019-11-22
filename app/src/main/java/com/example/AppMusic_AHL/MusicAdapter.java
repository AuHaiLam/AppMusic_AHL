package com.example.AppMusic_AHL;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MusicAdapter extends BaseAdapter {


    Context mycontext;
    int myLayout;
    List<Music> arrMusic;

    public MusicAdapter(Context context, int layout, List<Music> musicList) {

        mycontext = context;
        myLayout = layout;
        arrMusic = musicList;

    }


    @Override
    public int getCount() {
        return arrMusic.size();
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
        TextView textView1 = convertView.findViewById(R.id.tvTenBH);
        textView1.setText(arrMusic.get(position).getTenbaihat());
        TextView textView2 = convertView.findViewById(R.id.tvTime);
        textView2.setText(arrMusic.get(position).getThoigian());
        TextView textView3 = convertView.findViewById(R.id.tvCasi);
        textView3.setText(arrMusic.get(position).getCasi());

        ImageView imageView = convertView.findViewById(R.id.ivIconSinger);
        imageView.setImageResource(arrMusic.get(position).getAnhbh());


        return convertView;
    }
}






