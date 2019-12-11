package com.example.AppMusic_AHL.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.model.Nhac;

import java.util.List;

public class Music_Casi_Adapter extends BaseAdapter {

    Context mContext;
    int mLayout;
    List<Nhac> mlist_baihats;

    public Music_Casi_Adapter(Context context, int Layout, List<Nhac> list_baihats) {
        mContext = context;
        mLayout = Layout;
        mlist_baihats = list_baihats;
    }


    @Override
    public int getCount() {
        return mlist_baihats.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        convertView = inflater.inflate(mLayout, null);

        //ánh xạ
        TextView txt_tenbaihat = convertView.findViewById(R.id.tvTenbh);
        txt_tenbaihat.setText(mlist_baihats.get(position).getTenBaiHat());


        return convertView;
    }
}
