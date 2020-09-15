package com.miscodesigns;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        initView();
        setupViewFragment();
    }

    private void initView() {
    }

    private void setupViewFragment() {
        EditProfileFragment fragment =
                (EditProfileFragment) getSupportFragmentManager().findFragmentById(R.id.fl_edit_profile);
        if (fragment == null) {
            // Create the fragment

            fragment = EditProfileFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(
                    getSupportFragmentManager(), fragment, R.id.fl_edit_profile);
        }
    }
}
