package com.example.AppMusic_AHL;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhSachTheLoai extends AppCompatActivity {

    ArrayList<TheLoai> theLoaiList;
    ListView lvTheloai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_the_loai);

        lvTheloai = findViewById(R.id.lvDSTheLoai);

        theLoaiList = new ArrayList<TheLoai>();
        theLoaiList.add(new TheLoai("Thiếu nhi", R.drawable.iconstreamline));
        theLoaiList.add(new TheLoai("Nhạc Trẻ", R.drawable.iconstreamline));
        theLoaiList.add(new TheLoai("Bolero", R.drawable.iconstreamline));
        theLoaiList.add(new TheLoai("Cách mạng", R.drawable.iconstreamline));
        theLoaiList.add(new TheLoai("Nhạc vàng", R.drawable.iconstreamline));
        theLoaiList.add(new TheLoai("nhạc đỏ", R.drawable.iconstreamline));

        TheLoaiAdapter theLoaiAdapter = new TheLoaiAdapter(DanhSachTheLoai.this, R.layout.item_list_theloai, theLoaiList);


        lvTheloai.setAdapter(theLoaiAdapter);
        lvTheloai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachTheLoai.this, DanhSachNhac_CaSi.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:


                intent = new Intent(DanhSachTheLoai.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
