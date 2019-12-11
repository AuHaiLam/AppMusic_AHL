package com.example.AppMusic_AHL.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.activity.PhatNhac;
import com.example.AppMusic_AHL.dao.MusicDAO;
import com.example.AppMusic_AHL.holder.DanhSachNhacHolder;
import com.example.AppMusic_AHL.model.Nhac;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhacAdapter extends RecyclerView.Adapter<DanhSachNhacHolder> implements Filterable {

    public Context context;
    public List<Nhac> nhacList;
    public RecyclerView recyclerView;
    MusicDAO musicDAO;
    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Nhac> nhacArrayList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                nhacArrayList.addAll(musicDAO.ALLMusic());
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Nhac item : musicDAO.ALLMusic()) {
                    if (item.getTenBaiHat().toLowerCase().contains(filterPattern)) {
                        nhacArrayList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = nhacArrayList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            nhacList.clear();
            nhacList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };


    public DanhSachNhacAdapter(Context context, List<Nhac> nhacList, RecyclerView recyclerView) {
        this.context = context;
        this.nhacList = nhacList;
        this.recyclerView = recyclerView;
    }

    @NonNull
    @Override
    public DanhSachNhacHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view =
                LayoutInflater.from(context).
                        inflate(R.layout.item_list_music, parent, false);

        DanhSachNhacHolder danhSachNhacHolder = new DanhSachNhacHolder(view);
        return danhSachNhacHolder;
    }

    @Override
    public int getItemCount() {
        return nhacList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull final DanhSachNhacHolder holder, int position) {

        final Nhac nhac = nhacList.get(position);
        holder.TenBaiHat.setText(nhac.getTenBaiHat());
        holder.TenCaSi.setText(nhac.getTenCasi());
        holder.ImgAnhCaSi.setImageResource(nhac.getLinkAnhbh());

        musicDAO = new MusicDAO(context);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, PhatNhac.class);
                intent.putExtra("LinkAnhBaiHat", nhac.getLinkAnhbh() + "");
                intent.putExtra("LinkBaiHat", nhac.getLinkNhacbh() + "");
                intent.putExtra("TenBaiHat", nhac.getTenBaiHat());
                intent.putExtra("Tencasi", nhac.getTenCasi());
                context.startActivity(intent);

            }
        });

        holder.ImgYeuThich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Đã thêm vào Yêu thích !!!", Toast.LENGTH_LONG).show();


            }

        });
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
}
