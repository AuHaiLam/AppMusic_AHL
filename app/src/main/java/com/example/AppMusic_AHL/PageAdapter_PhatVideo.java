package com.example.AppMusic_AHL;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter_PhatVideo extends FragmentStatePagerAdapter {
    public PageAdapter_PhatVideo(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Tiếp Theo";
                break;
            case 1:
                title = "Thông Tin";
                break;
        }
        return title;
    }


    @Override
    public Fragment getItem(int i) {

        Fragment frag = null;
        switch (i) {
            case 0:
                frag = new Video_Fragment_TiepTheo();
                break;
            case 1:
                frag = new Video_Fragment_ThongTin();
                break;

        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
