package com.miscodesigns;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

public class EditProfileFragment extends Fragment {
    public static EditProfileFragment newInstance() {
        return new EditProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {

        TextView copyLink = view.findViewById(R.id.tv_btn_copy_link);
        final LinearLayout snackbarView = view.findViewById(R.id.ll_edit_profile);

        copyLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar snackbar1 = Snackbar.make(view.findViewById(android.R.id.content), "Link Copied!", Snackbar.LENGTH_SHORT);
                snackbar1.show();*/

                String message = "Link Copied!";
                Snackbar snackbar = Snackbar.make(snackbarView, message, Snackbar.LENGTH_INDEFINITE);
                snackbar.getView().setVisibility(View.INVISIBLE);
                snackbar.setCallback(new Snackbar.Callback() {
                    @Override
                    public void onShown(Snackbar snackbar) {
                        super.onShown(snackbar);
                        snackbar.getView().setVisibility(View.VISIBLE);
                    }
                });
                snackbar.show();

                snackbar.getView().setVisibility(View.GONE);
                snackbar.dismiss();

               /* Snackbar snack = Snackbar.make(snackbarView, "Link Copied!", Snackbar.LENGTH_LONG);
                View view2 = snack.getView();
                FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view2.getLayoutParams();
                params.gravity = Gravity.TOP;
                params.topMargin = 100;
                Log.e("---f", String.valueOf(R.dimen.dp_40));
                view2.setLayoutParams(params);
                snack.show();*/
            }
        });

       /* EditBioFragment nextFrag = new EditBioFragment();
        Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_edit_profile, nextFrag, "findThisFragment")
                .addToBackStack(null)
                .commit();

        EditWebsiteFragment nextFrag1 = new EditWebsiteFragment();
        Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_edit_profile, nextFrag1, "findThisFragment1")
                .addToBackStack(null)
                .commit();
*/

        /*  View tv_btn = view.findViewById(R.id.tv_btn);
        tv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditUserNameFragment nextFrag = new EditUserNameFragment();
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_edit_profile, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });*/
    }
}
