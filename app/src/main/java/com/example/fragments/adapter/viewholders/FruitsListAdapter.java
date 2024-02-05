package com.example.fragments.adapter.viewholders;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.R;

import java.util.ArrayList;


public class FruitsListAdapter extends RecyclerView.Adapter<FruitsViewHolder>{


    private ArrayList<String> fruitsArrayList;
    private RemoveItemClickListener removeItemClickListener;

    public void setRemoveItemClickListener(RemoveItemClickListener removeItemClickListener) {
        this.removeItemClickListener = removeItemClickListener;
    }

    public   FruitsListAdapter(ArrayList<String> fruitsArrayList){
        this.fruitsArrayList=fruitsArrayList;
    }



    @NonNull
    @Override
    public FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruit_list, parent, false);
        return new FruitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String fruitName =fruitsArrayList.get(position);
        holder.bind(fruitName);
        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (removeItemClickListener!=null)
                    removeItemClickListener.onRemoveItem(position);

            }
        });


    }

    @Override
    public int getItemCount() {
        return fruitsArrayList.size();
    }


    public interface RemoveItemClickListener{
        void onRemoveItem(int position);
    }
}
