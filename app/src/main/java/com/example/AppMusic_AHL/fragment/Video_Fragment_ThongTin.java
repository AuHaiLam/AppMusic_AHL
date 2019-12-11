package com.example.AppMusic_AHL.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.example.AppMusic_AHL.R;

public class Video_Fragment_ThongTin extends Fragment {

    ScrollView scrollView;


    public Video_Fragment_ThongTin() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video__fragment__thong_tin, container, false);


        return view;
    }
}
