package com.example.AppMusic_AHL;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Video_Fragment_TiepTheo extends Fragment {

    public ListView listViewVideo;
    ArrayList<Video> arrayList;

    public Video_Fragment_TiepTheo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video__fragment__tiep_theo, container, false);

        listViewVideo = view.findViewById(R.id.lvvideo_thongtin);

        arrayList = new ArrayList<Video>();
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));

        VideoAdapter videoAdapter = new VideoAdapter(getActivity(), R.layout.list_item_video, arrayList);


        listViewVideo.setAdapter(videoAdapter);
        listViewVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), PhatVideo.class);
                startActivity(intent);
            }
        });

        return view;

    }

}
