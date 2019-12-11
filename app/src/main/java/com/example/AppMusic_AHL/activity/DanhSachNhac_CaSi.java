package com.example.AppMusic_AHL.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.adapter.Music_Casi_Adapter;
import com.example.AppMusic_AHL.model.Nhac;

import java.util.ArrayList;

public class DanhSachNhac_CaSi extends AppCompatActivity {
    ArrayList<Nhac> arrayList;
    ListView lvNhac_casi;
    TextView txt_tencasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_nhac__ca_si);

        txt_tencasi = findViewById(R.id.tvTencasi);
        Intent intent = getIntent();
        int vt = intent.getIntExtra("position", 0);
        String cs = intent.getStringExtra("tencasi");
        lvNhac_casi = findViewById(R.id.lvNhac_Casi);
        txt_tencasi.setText("Ca sĩ: " + cs);

        arrayList = new ArrayList<Nhac>();

        switch (vt) {
            case 0:
                arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
                break;
            case 1:
                arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
                break;
            case 2:
                arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
                break;
            case 3:
                arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
                Music_Casi_Adapter musicAdapter = new Music_Casi_Adapter(DanhSachNhac_CaSi.this, R.layout.item_list_music, arrayList);
//
//
                lvNhac_casi.setAdapter(musicAdapter);
        lvNhac_casi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachNhac_CaSi.this, PhatNhac.class);
                startActivity(intent);
            }
        });


        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:


                intent = new Intent(DanhSachNhac_CaSi.this, DanhSachCaSi.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
