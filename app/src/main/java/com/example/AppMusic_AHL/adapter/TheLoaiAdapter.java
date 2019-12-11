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
import com.example.AppMusic_AHL.model.TheLoai;

import java.util.List;

public class TheLoaiAdapter extends BaseAdapter {

    Context mycontext;
    int myLayout;
    List<TheLoai> arrTheloai;

    public TheLoaiAdapter(Context context, int layout, List<TheLoai> theLoaiList) {

        mycontext = context;
        myLayout = layout;
        arrTheloai = theLoaiList;

    }


    @Override
    public int getCount() {
        return arrTheloai.size();
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
        TextView textView1 = convertView.findViewById(R.id.TenTheloai1);
        textView1.setText(arrTheloai.get(position).getTentheloai());


        ImageView imageView = convertView.findViewById(R.id.ivAnhTheloai1);
        imageView.setImageResource(arrTheloai.get(position).getAnhtheloai());


        return convertView;
    }
}
