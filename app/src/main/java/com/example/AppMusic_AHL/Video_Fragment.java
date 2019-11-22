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

public class Video_Fragment extends Fragment {
    ArrayList<Video> arrayList;
    ListView lvVideo;


    public Video_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video__fragment, container, false);

        lvVideo = view.findViewById(R.id.lvVideo);

        arrayList = new ArrayList<Video>();
        arrayList.add(new Video("Em sẽ là cô dâu", "Kiều thơ - Cover", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));
        arrayList.add(new Video("Tập quen với cô đơn", "TiTi", "4:03", R.raw.tapquenvoicodon, R.drawable.videoicon));

        VideoAdapter videoAdapter = new VideoAdapter(getActivity(), R.layout.list_item_video, arrayList);


        lvVideo.setAdapter(videoAdapter);
        lvVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), PhatVideo.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
