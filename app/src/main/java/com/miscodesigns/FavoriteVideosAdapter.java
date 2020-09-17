package com.miscodesigns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavoriteVideosAdapter extends RecyclerView.Adapter<FavoriteVideosAdapter.FavoriteVideosViewHolder> {

    private Context mContext;

    public FavoriteVideosAdapter(Context context) {

        mContext = context;
    }

    @NonNull
    @Override
    public FavoriteVideosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fav_videos, parent, false);
        return new FavoriteVideosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteVideosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class FavoriteVideosViewHolder extends RecyclerView.ViewHolder {
        public FavoriteVideosViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
