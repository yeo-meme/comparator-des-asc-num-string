package com.nalazoocare.comparatort;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nalazoocare.comparatort.databinding.ItemListBinding;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-03-30
 */
public class MHolder extends RecyclerView.ViewHolder {

    private ItemListBinding binding;
    private Context context;

    public MHolder(@NonNull ItemListBinding v) {
        super(v.getRoot());
        this.binding = v;
        this.context = v.getRoot().getContext();
    }

    public void bind(String number) {

    }
}
