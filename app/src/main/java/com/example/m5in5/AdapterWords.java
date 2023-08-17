package com.example.m5in5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m5in5.databinding.ItemBinding;

import java.util.List;

public class AdapterWords extends RecyclerView.Adapter <AdapterWords.ViewHolder> {

    private List <String> words;

    @NonNull

    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {
        String item = words.get(position);
        holder.showInformation(item);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void setData(List<String> data) {
        this.setData(data);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemBinding itemBinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
        public void showInformation(String words){
            itemBinding.textView.setText(words);
        }
    }
}
