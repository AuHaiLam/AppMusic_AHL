package com.example.AppMusic_AHL.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;

public class MusicHolder extends RecyclerView.ViewHolder {

    public TextView TenBaiHat, TenCaSi, ThoiGian;
    public ImageView ImgAnhCaSi, ImgYeuThich;

    public MusicHolder(@NonNull View itemView) {
        super(itemView);

        TenBaiHat = itemView.findViewById(R.id.tvTenBaiHat);
        ThoiGian = itemView.findViewById(R.id.tvThoiGian);
        TenCaSi = itemView.findViewById(R.id.tvTencasi);
        ImgAnhCaSi = itemView.findViewById(R.id.ImgAnhcasi);
        ImgYeuThich = itemView.findViewById(R.id.ImgYeuThich);

    }
}
