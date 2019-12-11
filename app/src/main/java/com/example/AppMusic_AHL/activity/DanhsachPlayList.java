package com.example.AppMusic_AHL.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.fragment.Nhac_Fragment;
import com.example.AppMusic_AHL.model.Nhac;

import java.util.ArrayList;

public class DanhsachPlayList extends AppCompatActivity {

    ArrayList<Nhac> arrayList;
    ListView lvNhacyeuthich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_play_list);

//        lvNhacyeuthich = findViewById(R.id.lvDanhsachYeuthic);
//
//        arrayList = new ArrayList<Nhac>();
//        arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
//        arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
//        arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
//        arrayList.add(new Nhac("1", "Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
//
//        MusicAdapter musicAdapter = new MusicAdapter(DanhsachPlayList.this, R.layout.item_list_music, arrayList);
//
//
//        lvNhacyeuthich.setAdapter(musicAdapter);
//        lvNhacyeuthich.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(DanhsachPlayList.this, PhatNhac.class);
//                startActivity(intent);
//            }
//        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:

                intent = new Intent(DanhsachPlayList.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
