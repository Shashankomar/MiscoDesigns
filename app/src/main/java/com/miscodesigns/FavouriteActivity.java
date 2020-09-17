package com.miscodesigns;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FavouriteActivity extends AppCompatActivity {

    private ViewPager mVpFav;
    private TabLayout mTlFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        initView();
        setTabs();
    }

    private void setTabs() {
        FavouriteAdapter favouriteAdapter = new FavouriteAdapter(this, getSupportFragmentManager());
        mVpFav.setAdapter(favouriteAdapter);
        mTlFav.setupWithViewPager(mVpFav);
    }

    private void initView() {
        mVpFav = findViewById(R.id.vp_fav);
        mTlFav = findViewById(R.id.tl_fav);
    }
}