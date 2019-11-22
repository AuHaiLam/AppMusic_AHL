package com.example.AppMusic_AHL;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class TinTucHolder extends RecyclerView.ViewHolder {

    public TextView tvTitle, tvDesc;

    public TinTucHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDesc = itemView.findViewById(R.id.tvDesc);
    }
}
