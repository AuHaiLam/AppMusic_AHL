package com.example.AppMusic_AHL;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Danh sách MP3";
                break;
            case 1:
                title = "Danh sách MP4";
                break;
            case 2:
                title = "Tin Tức - Trực Tuyến";
                break;
        }
        return title;
    }


    @Override
    public Fragment getItem(int i) {

        Fragment frag = null;
        switch (i) {
            case 0:
                frag = new Nhac_Fragment();
                break;
            case 1:
                frag = new Video_Fragment();
                break;
            case 2:
                frag = new TinTuc_Fragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
