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
import com.example.AppMusic_AHL.model.Video;

import java.util.List;

public class VideoAdapter extends BaseAdapter {
    Context mycontext;
    int myLayout;
    List<Video> arrVideo;

    public VideoAdapter(Context context, int layout, List<Video> videoList) {

        mycontext = context;
        myLayout = layout;
        arrVideo = videoList;

    }


    @Override
    public int getCount() {
        return arrVideo.size();
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
        TextView textView1 = convertView.findViewById(R.id.tvTenVideo);
        textView1.setText(arrVideo.get(position).getTenvideo());
        TextView textView2 = convertView.findViewById(R.id.tvTimeVieo);
        textView2.setText(arrVideo.get(position).getTime());
        TextView textView3 = convertView.findViewById(R.id.tvCasiVideo);
        textView3.setText(arrVideo.get(position).getCasi());

        ImageView imageView = convertView.findViewById(R.id.imVideo);
        imageView.setImageResource(arrVideo.get(position).getAnhvideo());


        return convertView;
    }
}
