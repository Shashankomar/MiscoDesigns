package com.miscodesigns;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class EditProfileFragment extends Fragment {
    private TextView mTvBtnEditUsername, mTvBtnEditBio, mTvBtnEditWebsite;
    private TextView mCopyLink;
    private LinearLayout snackbarView;

    public static EditProfileFragment newInstance() {
        return new EditProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        initView(view);
        setClickListeners();
        return view;
    }

    private void setClickListeners() {
        mCopyLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snack = Snackbar.make(snackbarView, "Link Copied!", Snackbar.LENGTH_LONG);
                View view2 = snack.getView();
                FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view2.getLayoutParams();
                params.gravity = Gravity.TOP;
                params.topMargin = 100;
                view2.setLayoutParams(params);
                snack.show();
            }
        });

        mTvBtnEditUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditUserNameFragment nextFrag = new EditUserNameFragment();
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_edit_profile, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        mTvBtnEditBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditBioFragment nextFrag = new EditBioFragment();
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_edit_profile, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        mTvBtnEditWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditWebsiteFragment nextFrag1 = new EditWebsiteFragment();
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_edit_profile, nextFrag1, "findThisFragment1")
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    private void initView(View view) {
        mTvBtnEditUsername = view.findViewById(R.id.tv_btn_change_username);
        mTvBtnEditBio = view.findViewById(R.id.tv_btn_change_bio);
        mTvBtnEditWebsite = view.findViewById(R.id.tv_btn_change_website);
        mCopyLink = view.findViewById(R.id.tv_btn_copy_link);
        snackbarView = view.findViewById(R.id.ll_edit_profile);
    }
}