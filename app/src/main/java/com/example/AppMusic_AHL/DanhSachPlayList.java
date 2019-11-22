package com.example.AppMusic_AHL;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhSachPlayList extends AppCompatActivity {

    ArrayList<Music> arrayList;
    ListView lvNhac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_play_list);

        lvNhac = findViewById(R.id.lvDanhsachYeuthic);

        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));

        MusicAdapter musicAdapter = new MusicAdapter(DanhSachPlayList.this, R.layout.item_list_music, arrayList);


        lvNhac.setAdapter(musicAdapter);
        lvNhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachPlayList.this, PhatNhac.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:

                intent = new Intent(DanhSachPlayList.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
