package com.miscodesigns;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FavouriteVideosFragment extends Fragment {
    private RecyclerView mRvFavVideos;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        FavouriteVideosFragment fragment = new FavouriteVideosFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite_videos, container, false);

        mRvFavVideos = view.findViewById(R.id.rv_fav_videos);
        FavoriteVideosAdapter adapter = new FavoriteVideosAdapter(getContext());
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        mRvFavVideos.setLayoutManager(manager);
        mRvFavVideos.setAdapter(adapter);

        return view;
    }
}
