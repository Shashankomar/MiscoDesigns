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

public class FavouriteSoundsFragment extends Fragment {
    private RecyclerView mRvFavSounds;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        FavouriteSoundsFragment fragment = new FavouriteSoundsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite_sounds, container, false);
        initView(view);
        setRecyclerView();
        return view;
    }

    private void initView(View view) {
        mRvFavSounds = view.findViewById(R.id.rv_fav_sounds);
    }

    private void setRecyclerView() {
        FavoriteSoundsAdapter adapter = new FavoriteSoundsAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvFavSounds.setLayoutManager(layoutManager);
        mRvFavSounds.setAdapter(adapter);
    }
}
