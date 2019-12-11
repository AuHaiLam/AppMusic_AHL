package com.example.AppMusic_AHL.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.adapter.DanhSachNhacAdapter;
import com.example.AppMusic_AHL.adapter.MusicAdapter;
import com.example.AppMusic_AHL.dao.MusicDAO;
import com.example.AppMusic_AHL.fragment.Nhac_Fragment;
import com.example.AppMusic_AHL.model.Music;
import com.example.AppMusic_AHL.model.Nhac;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhac extends AppCompatActivity {
    TextView tv_tenbaihatdangphat;
    List<Nhac> nhacList = new ArrayList<>();
    ImageButton IMGB_play, IMGB_next, IMGB_pre;
    DanhSachNhacAdapter danhSachNhacAdapter;
    MusicDAO musicDAO;
    MusicAdapter musicAdapter;
    RecyclerView recyclerView;
    MediaPlayer player = new MediaPlayer();
    int vitri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_nhac);
        tv_tenbaihatdangphat = findViewById(R.id.txt_dang_phat);
        IMGB_next = findViewById(R.id.bt_next);
        IMGB_play = findViewById(R.id.bt_pause);
        IMGB_pre = findViewById(R.id.bt_re);

        recyclerView = findViewById(R.id.rvDanhsachNhac);


        musicDAO = new MusicDAO(this);


//        DanhSachNhacAdapter adapter_listbaihat = new DanhSachNhacAdapter(DanhSachNhac.this,nhacList, recyclerView);
//        recyclerView.setAdapter(adapter_listbaihat);
//        khoitao();
//        player.start();
//        IMGB_play.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
//
//        recyclerView.setOnClickListener(new AdapterView.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//
//                if (player.isPlaying()) {
//                    player.stop();
//                }
//                else {
//
//                    khoitao();
//                }
//                IMGB_play.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
//            }
//        });
//
//        IMGB_play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(player.isPlaying()) {
//                    player.pause();
//                    IMGB_play.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
//                }
//                else {
//                    player.start();
//                    IMGB_play.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
//                }
//            }
//        });


        add();
        input();

    }

    public void input() {
        nhacList = musicDAO.ALLMusic();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        danhSachNhacAdapter = new DanhSachNhacAdapter(this, nhacList, recyclerView);
        recyclerView.setAdapter(danhSachNhacAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:

                intent = new Intent(DanhSachNhac.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void add() {
        musicDAO.InsertMusic(new Music(1, 1, 1, "Tập quen với cô đơn", "Ti Ti", "4:03", R.raw.tapquenvoicodon, R.drawable.titi, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 1, 2, "Cô thắm không về", "Phát Hồ; Jokes Bii; Thiện", "4:13", R.raw.cothamkhongve, R.drawable.cothamkhongve, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 1, 3, "Lời yêu ngây dại", "Kha", "4:30", R.raw.loiyeungaydai, R.drawable.loiyeungaydai, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 1, 4, "Em gì ơi", "Jack & K-ICM", "4:30", R.raw.emgioi, R.drawable.emgioi, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 1, 5, "Lời yêu ngây dại", "Kha", "4:30", R.raw.loiyeungaydai, R.drawable.loiyeungaydai, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 1, 6, "Lặng lẽ Buông (cover) ", "Đường Hưng", "4:02", R.raw.langlebuong, R.drawable.langlebuong, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 2, 1, "Cắc cùm cum", "Ti Ti", "4:18", R.raw.caccumcum, R.drawable.caccumcum, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 3, 7, "Phải khóc hay cười", "HKT", "5:11", R.raw.phaikhochaycuoi, R.drawable.phaikhochaycuoi, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 2, 8, "Em ơi lên phố", "Minh Vương", "4:18", R.raw.emoilenpho, R.drawable.emoilenpho, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 3, 3, "Hồng Nhan", "Jack", "4:18", R.raw.hongnhan, R.drawable.hongnhan, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));
        musicDAO.InsertMusic(new Music(1, 2, 3, "Việt nam tôi", "Jack $ K-ICM", "4:18", R.raw.vietnamtoi, R.drawable.vietnamtoi, "https://beta.chiasenhac.vn/mp3/vietnam/v-pop/tap-quen-voi-co-don~ti-ti~tsvtqmwmqfe898.html"));

        return;
    }

    private void khoitao() {
        MediaPlayer.create(DanhSachNhac.this, nhacList.get(vitri).getLinkNhacbh());
        tv_tenbaihatdangphat.setText("Đang phát: " + nhacList.get(vitri).getTenBaiHat());

        player.start();
    }

}


