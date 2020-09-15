package com.miscodesigns;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FollowingFragment extends Fragment {
    private RecyclerView mRvFollowing;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        FollowingFragment fragment = new FollowingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_following, container, false);

        initView(view);
        setRecyclerView();

        return view;
    }

    private void setRecyclerView() {
        FollowingAdapter adapter = new FollowingAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvFollowing.setLayoutManager(layoutManager);
        mRvFollowing.setAdapter(adapter);
    }

    private void initView(View view) {
        mRvFollowing = view.findViewById(R.id.rv_following);
    }
}
