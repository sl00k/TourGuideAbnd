package com.example.android.tourguideabnd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class PagerAdapter extends FragmentPagerAdapter {
    private String categories[] = {"Activ", "Tavern", "Events", "Beer"};

    PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PageOne();
        } else if (position == 1) {
            return new PageTwo();
        } else if (position == 2) {
            return new PageThree();
        } else {
            return new PageFour();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Generate title based on item position
        return categories[position];
    }
}
