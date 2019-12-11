package com.example.AppMusic_AHL.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.activity.DanhSachCaSi;
import com.example.AppMusic_AHL.activity.DanhSachNhac;
import com.example.AppMusic_AHL.activity.DanhSachTheLoai;
import com.example.AppMusic_AHL.activity.DanhsachPlayList;

public class Nhac_Fragment extends Fragment {

    ImageView imageDanhSach, imageYeuThich, imageTheLoai, imageCaSi;

    public Nhac_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_nhac__fragment, container, false);
        imageDanhSach = view.findViewById(R.id.ImDanhSach);
        imageCaSi = view.findViewById(R.id.ImCaSi);
        imageTheLoai = view.findViewById(R.id.ImTheLoai);
        imageYeuThich = view.findViewById(R.id.ImYeuThich);

        imageDanhSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), DanhSachNhac.class);
                startActivity(intent);


            }
        });

        imageYeuThich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), DanhsachPlayList.class);
                startActivity(intent);

            }
        });

        imageTheLoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), DanhSachTheLoai.class);
                startActivity(intent);


            }
        });

        imageCaSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), DanhSachCaSi.class);
                startActivity(intent);


            }
        });


        return view;

    }


}
