package com.example.termi.jacksonvilletourapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.termi.jacksonvilletourapp.EatingFragment;
import com.example.termi.jacksonvilletourapp.EventFragment;
import com.example.termi.jacksonvilletourapp.FunFragment;
import com.example.termi.jacksonvilletourapp.HistoryFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EventFragment();
            case 1:
                return new FunFragment();
            case 2:
                return new EatingFragment();
            case 3:
                return new HistoryFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}

