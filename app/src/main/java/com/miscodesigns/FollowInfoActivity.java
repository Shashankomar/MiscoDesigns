package com.miscodesigns;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FollowInfoActivity extends AppCompatActivity {
    private TabLayout tl;
    private ViewPager vp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_info);

        initView();

        setTabs();
    }

    private void initView() {
        tl = findViewById(R.id.tab_layout);
        vp = findViewById(R.id.view_pager);
    }

    private void setTabs() {
        FollowInfoAdaptor adaptor = new FollowInfoAdaptor(this, getSupportFragmentManager());
        vp.setAdapter(adaptor);
        tl.setupWithViewPager(vp);
    }
}
