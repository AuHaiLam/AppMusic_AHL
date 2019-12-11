package com.example.AppMusic_AHL.presenter;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.AppMusic_AHL.dao.MusicDAO;
import com.example.AppMusic_AHL.model.Nhac;
import com.example.AppMusic_AHL.view.PhatNhacView;

import java.util.ArrayList;
import java.util.List;

public class PhatNhacPresenter {
    public static int onTimeOnly = 0;
    public PhatNhacView phatNhacView;
    public Context context;
    public double starttime = 0;
    public double finaltime = 0;
    public Handler myHandler = new Handler();
    public int position = 0;
    TextView tvNameSong, tvNameSingle;
    ImageView ImgAnhcasi;
    MediaPlayer mediaPlayer;
    SeekBar seekBar;
    List<Nhac> nhacList = new ArrayList<>();
    MusicDAO musicDAO;
    private Runnable UpdateSongTime = new Runnable() {
        @Override
        public void run() {
            starttime = mediaPlayer.getCurrentPosition();
            phatNhacView.setTimeStart();
            phatNhacView.SbStart();
            myHandler.postDelayed(this, 100);
        }
    };

    public PhatNhacPresenter(PhatNhacView phatNhacView, Context context) {
        this.phatNhacView = phatNhacView;
        this.context = context;
    }

    public void MediaPlayer(int LinkBaiHat) {
        mediaPlayer = MediaPlayer.create(context, LinkBaiHat);
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.start();
        SetTime();
    }

    public void SetTime() {
        finaltime = mediaPlayer.getDuration();
        starttime = mediaPlayer.getCurrentPosition();
        if (onTimeOnly == 0) {
            phatNhacView.Sbend();
        }

        phatNhacView.setTimeEnd();
        phatNhacView.setTimeStart();
        phatNhacView.SbStart();
        myHandler.postDelayed(UpdateSongTime, 100);
    }

    public void Pause_Play() {
        if (mediaPlayer.isPlaying()) {
            phatNhacView.Play();
        } else {
            phatNhacView.Pause();
        }
    }

    public void next() {
        position--;
        if (position < 0) {
            position = nhacList.size() - 1;
        }
        if (mediaPlayer.isPlaying()) {
            phatNhacView.next();
        }
        CreateMediaPlayer(tvNameSong, tvNameSingle, ImgAnhcasi);
        mediaPlayer.start();
    }

    public void pre() {

        position--;
        if (position < 0) {
            position = nhacList.size() - 1;
        }
        if (mediaPlayer.isPlaying()) {
            phatNhacView.pre();
        }
        CreateMediaPlayer(tvNameSong, tvNameSingle, ImgAnhcasi);
        mediaPlayer.start();
    }


    public void CreateMediaPlayer(TextView tvNameSong, TextView tvNameSingle, ImageView ImgPLAnhcasi) {
        musicDAO = new MusicDAO(context);

        mediaPlayer = MediaPlayer.create(context, nhacList.get(position).getLinkNhacbh());
        tvNameSong.setText(nhacList.get(position).getTenBaiHat());
        tvNameSingle.setText(nhacList.get(position).getTenCasi());
        ImgPLAnhcasi.setImageResource(nhacList.get(position).getLinkAnhbh());
    }


}
