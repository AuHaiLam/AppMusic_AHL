package com.example.AppMusic_AHL;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhSachNhac_CaSi extends AppCompatActivity {
    ArrayList<Music> arrayList;
    ListView lvNhac_casi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_nhac__ca_si);

        lvNhac_casi = findViewById(R.id.lvNhac_Casi);

        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));

        MusicAdapter musicAdapter = new MusicAdapter(DanhSachNhac_CaSi.this, R.layout.item_list_music, arrayList);


        lvNhac_casi.setAdapter(musicAdapter);
        lvNhac_casi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachNhac_CaSi.this, PhatNhac.class);
                startActivity(intent);
            }
        });


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
