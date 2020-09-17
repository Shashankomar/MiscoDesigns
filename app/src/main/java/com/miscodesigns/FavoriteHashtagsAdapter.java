package com.miscodesigns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavoriteHashtagsAdapter extends RecyclerView.Adapter<FavoriteHashtagsAdapter.FavoriteHashtagViewHolder> {
    private Context mContext;

    public FavoriteHashtagsAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public FavoriteHashtagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fav_hashtags, parent, false);
        return new FavoriteHashtagViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteHashtagViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class FavoriteHashtagViewHolder extends RecyclerView.ViewHolder {
        public FavoriteHashtagViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
