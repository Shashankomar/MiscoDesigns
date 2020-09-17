package com.miscodesigns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavoriteSoundsAdapter extends RecyclerView.Adapter<FavoriteSoundsAdapter.FavoriteSoundsViewHolder> {
    private Context mContext;

    public FavoriteSoundsAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public FavoriteSoundsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fav_sounds, parent, false);
        return new FavoriteSoundsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteSoundsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class FavoriteSoundsViewHolder extends RecyclerView.ViewHolder {
        public FavoriteSoundsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
