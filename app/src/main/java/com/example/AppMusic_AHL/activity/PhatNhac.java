package com.example.AppMusic_AHL.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.AppMusic_AHL.R;
import com.example.AppMusic_AHL.dao.MusicDAO;
import com.example.AppMusic_AHL.model.Nhac;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhatNhac extends AppCompatActivity {
    public static int TimeOnly = 0;
    public Handler myHandler = new Handler();
    MediaPlayer mediaPlayer;
    public int position;
    SeekBar skSong;
    ArrayList<Nhac> arrayList;
    TextView tvTenbh, tvTencasi, tvTimeSong, tvTimeTotal;
    ImageView imageViewDia;
    ImageButton btnPlay, btnNext, btnPrev, btnRandom, btnRepeat;
    Animation animation;

    List<Nhac> nhacList = new ArrayList<>();
    MusicDAO musicDAO;

    int LinkBaiHat;
    String TenBaiHat;
    String TenCasi;
    boolean laplai = false;
    boolean ngaunhien = false;
    private Runnable UpdateSongTime = new Runnable() {
        @Override
        public void run() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
            tvTimeSong.setText(simpleDateFormat.format(mediaPlayer.getCurrentPosition()));
            tvTimeTotal.setText(simpleDateFormat.format(mediaPlayer.getDuration()));
            skSong.setProgress(mediaPlayer.getCurrentPosition());
            myHandler.postDelayed(this, 100);


            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    position++;
                    if (position > nhacList.size() - 1) {
                        position = 0;
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }

                    if (laplai == true) {
                        position = position - 1;

                    }

                    if (ngaunhien == true) {
                        Random random = new Random();
                        int index = random.nextInt(nhacList.size());
                        if (index == position) {
                            position = index - 1;
                        }
                        position = index;

                    }

                    KhoiTaoMedia();
                    mediaPlayer.start();
                    btnPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
                    imageViewDia.startAnimation(animation);
                }

            });


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_phat_nhac);


        intn();


        musicDAO = new MusicDAO(this);
        nhacList = musicDAO.ALLMusic();
        Intent intent = getIntent();
        LinkBaiHat = Integer.parseInt(intent.getStringExtra("LinkBaiHat"));
        TenBaiHat = intent.getStringExtra("TenBaiHat");
        TenCasi = intent.getStringExtra("TenCaSi");
        tvTenbh.setText(TenBaiHat);
        tvTencasi.setText(TenCasi);
        mediaPlayer = MediaPlayer.create(PhatNhac.this, LinkBaiHat);
        mediaPlayer.start();
        setTime();
        OnSeeBar();


        animation = AnimationUtils.loadAnimation(this, R.anim.dia_quay);
        imageViewDia.startAnimation(animation);
    }

    public void setTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        if (TimeOnly == 0) {
            skSong.setMax(mediaPlayer.getDuration());
        }

        tvTimeTotal.setText(simpleDateFormat.format(mediaPlayer.getDuration()));

        tvTimeSong.setText(simpleDateFormat.format(mediaPlayer.getCurrentPosition()));


        skSong.setProgress(mediaPlayer.getCurrentPosition());
        myHandler.postDelayed(UpdateSongTime, 100);

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void BtnPlay(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            btnPlay.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);


        } else {
            mediaPlayer.start();
            btnPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);

        }


    }

    public void BtnPrev(View view) {
        position--;
        if (position < 0) {
            position = nhacList.size() - 1;
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        if (laplai == true) {
            position = position - 1;

        }

        if (ngaunhien == true) {
            Random random = new Random();
            int index = random.nextInt(nhacList.size());
            if (index == position) {
                position = index - 1;
            }
            position = index;
        }

        KhoiTaoMedia();
        mediaPlayer.start();
        btnPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
    }

    public void BtnNext(View view) {
        position++;
        if (position > nhacList.size() - 1) {
            position = 0;
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        if (laplai == true) {
            position = position - 1;

        }

        if (ngaunhien == true) {
            Random random = new Random();
            int index = random.nextInt(nhacList.size());
            if (index == position) {
                position = index - 1;
            }
            position = index;
        }

        KhoiTaoMedia();
        mediaPlayer.start();
        btnPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
    }

    public void BtnRamDom(View view) {
        if (ngaunhien == false) {
            if (laplai == true) {
                laplai = false;
                btnRandom.setImageResource(R.drawable.ic_random_black_24dp);
                btnRepeat.setImageResource(R.drawable.ic_repeat_pink_24dp);
            }
            btnRandom.setImageResource(R.drawable.ic_random_pink_24dp);
            ngaunhien = true;
        } else {
            btnRandom.setImageResource(R.drawable.ic_random_black_24dp);
            ngaunhien = false;
        }
    }


    public void Btnrepeat(View view) {
        if (laplai == false) {
            if (ngaunhien == true) {
                ngaunhien = false;
                btnRepeat.setImageResource(R.drawable.ic_repeat_pink_24dp);
                btnRandom.setImageResource(R.drawable.ic_random_pink_24dp);
            }
            btnRepeat.setImageResource(R.drawable.ic_repeat_pink_24dp);
            laplai = true;
        } else {
            btnRepeat.setImageResource(R.drawable.ic_repeat_one_pink_24dp);
            laplai = false;
        }


    }


    private void KhoiTaoMedia() {
        mediaPlayer = MediaPlayer.create(PhatNhac.this, nhacList.get(position).getLinkNhacbh());
        tvTenbh.setText(nhacList.get(position).getTenBaiHat());
        tvTencasi.setText(nhacList.get(position).getTenCasi());


    }



    private void intn() {

        imageViewDia = findViewById(R.id.imgAnhDia);
        tvTenbh = findViewById(R.id.tvTenbh);
        tvTencasi = findViewById(R.id.tvTenSica);
        tvTimeSong = findViewById(R.id.tvTimeSong);
        tvTimeTotal = findViewById(R.id.tvTimeTotal);
        skSong = findViewById(R.id.sksong);
        btnNext = findViewById(R.id.btnNext);
        btnPlay = findViewById(R.id.btnPlay);
        btnPrev = findViewById(R.id.btnPrev);
        btnRandom = findViewById(R.id.btnRandom);
        btnRepeat = findViewById(R.id.btnReapet);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:


                intent = new Intent(PhatNhac.this, com.example.AppMusic_AHL.activity.DanhSachNhac.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    public void DanhSachIcon(View view) {

        Intent intent = new Intent(PhatNhac.this, com.example.AppMusic_AHL.activity.DanhSachNhac.class);
        startActivity(intent);
    }

    public void OnSeeBar() {
        skSong.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(seekBar.getProgress());
            }
        });
    }
//    public void onStop(){
//        mediaPlayer.stop();
//        super.onStop();
//    }

    public void BtnFB(View view) {
        Intent intent = new Intent(PhatNhac.this, Login_Facebook.class);
        startActivity(intent);
    }
}
