package com.miscodesigns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileImagesAdapter extends RecyclerView.Adapter<ProfileImagesAdapter.ProfileImagesViewHolder> {
    private Context mContext;

    public ProfileImagesAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public ProfileImagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ProfileImagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileImagesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class ProfileImagesViewHolder extends RecyclerView.ViewHolder {
        public ProfileImagesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
