package com.example.AppMusic_AHL;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PhatNhac extends AppCompatActivity {
    ArrayList<Music> arrayList;

    int positon = 0;
    MediaPlayer mediaPlayer;

    TextView tvTenbh, tvTimeSong, tvTimeTotal;
    SeekBar skSong;
    ImageButton btnPlay, btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_phat_nhac);
        intn();
        AddSong();
        KhoiTaoMedia();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    //neu dang phat -> pause -> doi hinh play
                    mediaPlayer.pause();
                    btnPlay.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);

                } else {
                    mediaPlayer.start();
                    btnPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
                }
            }
        });

//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                positon++;
//                if (positon > arrayList.size() -1){
//                    positon = 0;
//
//                }
//                KhoiTaoMedia();
//                mediaPlayer.start();
//
//            }
//        });

    }


    private void KhoiTaoMedia() {
        mediaPlayer = MediaPlayer.create(PhatNhac.this, arrayList.get(positon).getForder());

        tvTenbh.setText(arrayList.get(positon).getTenbaihat());
    }

    public void AddSong() {
        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger, R.raw.tapquenvoicodon));
    }

    private void intn() {
        tvTenbh = findViewById(R.id.tvTen);
        tvTimeSong = findViewById(R.id.tvTimeSong);
        tvTimeTotal = findViewById(R.id.tvTimeTotal);
        skSong = findViewById(R.id.sksong);
        btnNext = findViewById(R.id.btnNext);
        btnPlay = findViewById(R.id.btnPlay);
        btnPrev = findViewById(R.id.btnPrev);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:


                intent = new Intent(PhatNhac.this, DanhSachNhac.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
