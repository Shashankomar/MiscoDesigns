package com.miscodesigns;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewFragment();

    }

    private void setupViewFragment() {
        SignUpFragment fragment =
                (SignUpFragment) getSupportFragmentManager().findFragmentById(R.id.frameLayout);
        if (fragment == null) {
            // Create the fragment
            fragment = SignUpFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(
                    getSupportFragmentManager(), fragment, R.id.frameLayout);
        }

    }
}