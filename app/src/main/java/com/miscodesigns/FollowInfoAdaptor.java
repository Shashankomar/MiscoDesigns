package com.miscodesigns;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FollowInfoAdaptor extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[]{R.string.following, R.string.followers};
    private Context mContext;

    public FollowInfoAdaptor(Context context, FragmentManager sfm) {
        super(sfm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FollowingFragment.newInstance(1);
            case 1:
            return FollowersFragment.newInstance(1);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
}
