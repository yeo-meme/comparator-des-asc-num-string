package com.nalazoocare.comparatort;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nalazoocare.comparatort.databinding.ItemListBinding;

import java.util.List;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-03-30
 */
public class MAdapter extends RecyclerView.Adapter<MHolder> {


    private List<String> dataList;

    public void setDataList(List<String> list) {
        dataList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MHolder(ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MHolder holder, int position) {

        holder.bind(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }
}
