package com.example.AppMusic_AHL.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.adapter.SingerAdapter;
import com.example.AppMusic_AHL.fragment.Nhac_Fragment;
import com.example.AppMusic_AHL.model.CaSi;

import java.util.ArrayList;

public class DanhSachCaSi extends AppCompatActivity {

    ArrayList<CaSi> arrayCasi;
    ListView lvCasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_ca_si);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        lvCasi = findViewById(R.id.lvDSCaSi);

        arrayCasi = new ArrayList<CaSi>();
        arrayCasi.add(new CaSi(1, "TiTi", R.drawable.titi));
        arrayCasi.add(new CaSi(2, "Jack", R.drawable.emgioi));
        arrayCasi.add(new CaSi(3, "Kha", R.drawable.loiyeungaydai));
        arrayCasi.add(new CaSi(1, "TiTi", R.drawable.titi));
        arrayCasi.add(new CaSi(2, "Jack", R.drawable.emgioi));
        arrayCasi.add(new CaSi(3, "Kha", R.drawable.loiyeungaydai));



        SingerAdapter singerAdapter = new SingerAdapter(DanhSachCaSi.this, R.layout.item_list_casi, arrayCasi);


        lvCasi.setAdapter(singerAdapter);
        lvCasi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachCaSi.this, DanhSachNhac_CaSi.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:

                intent = new Intent(DanhSachCaSi.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

