package com.example.AppMusic_AHL.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.activity.PhatNhac;
import com.example.AppMusic_AHL.holder.MusicHolder;
import com.example.AppMusic_AHL.model.Music;

import java.util.List;


public class MusicAdapter extends RecyclerView.Adapter<MusicHolder> {


    public Context context;
    public List<Music> musicList;
    public RecyclerView recyclerView;

    public MusicAdapter(Context context, List<Music> musicList, RecyclerView recyclerView) {
        this.context = context;
        this.musicList = musicList;
        this.recyclerView = recyclerView;
    }


    @NonNull
    @Override
    public MusicHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view =
                LayoutInflater.from(context).
                        inflate(R.layout.item_list_music, viewGroup, false);

        MusicHolder musicHolder = new MusicHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicHolder musicHolder, int i) {

        final Music music = musicList.get(i);
        musicHolder.TenBaiHat.setText(music.getTenBaiHat());
        musicHolder.ThoiGian.setText(music.getTime());
        musicHolder.TenCaSi.setText(music.getTenCasi());
        musicHolder.ImgAnhCaSi.setImageResource(music.getLinkAnh());

        musicHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PhatNhac.class);
                intent.putExtra("LinkAnhBaiHat", music.getLinkAnh() + "");
                intent.putExtra("LinkBaiHat", music.getLinknhac() + "");
                intent.putExtra("TenBaiHat", music.getTenBaiHat());
                intent.putExtra("Tencasi", music.getTenCasi());
                intent.putExtra("ThoiGian", music.getTime());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

}









