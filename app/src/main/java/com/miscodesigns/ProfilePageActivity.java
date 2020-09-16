package com.miscodesigns;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class ProfilePageActivity extends AppCompatActivity {
    private RecyclerView rvBtmShtImage;
    private LinearLayout bottomSheet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        initView();
        setBtmShtBehaviour();
        setRecyclerView();


    }

    private void setRecyclerView() {
        ProfileImagesAdapter adapter = new ProfileImagesAdapter(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvBtmShtImage.setLayoutManager(layoutManager);
        rvBtmShtImage.setAdapter(adapter);
    }

    private void setBtmShtBehaviour() {
        BottomSheetBehavior<LinearLayout> bsBehaviour = BottomSheetBehavior.from(bottomSheet);
        bsBehaviour.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

    }

    private void initView() {
        rvBtmShtImage = findViewById(R.id.rv_btmsht_image);
        bottomSheet = findViewById(R.id.bottom_sheet);
    }
}
