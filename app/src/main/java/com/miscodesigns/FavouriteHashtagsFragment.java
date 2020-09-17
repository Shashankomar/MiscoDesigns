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

public class FavouriteHashtagsFragment extends Fragment {
    private RecyclerView mRvFavHashtags;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        FavouriteHashtagsFragment fragment = new FavouriteHashtagsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite_hashtags, container, false);

        initView(view);
        setRecyclerView();

        return view;
    }

    private void initView(View view) {
        mRvFavHashtags = view.findViewById(R.id.rv_fav_hashtags);
    }

    private void setRecyclerView() {
        FavoriteHashtagsAdapter adapter = new FavoriteHashtagsAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvFavHashtags.setLayoutManager(layoutManager);
        mRvFavHashtags.setAdapter(adapter);
    }
}
