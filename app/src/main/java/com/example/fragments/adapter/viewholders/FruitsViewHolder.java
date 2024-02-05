package com.example.fragments.adapter.viewholders;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.R;

import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty2;

public class FruitsViewHolder extends RecyclerView.ViewHolder {


    private TextView fruitNameTextView;
    private Button button;
    private View.OnClickListener onClickListener;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        button.setOnClickListener(onClickListener);
    }

    public FruitsViewHolder(@NonNull View itemView) {
        super(itemView);
        fruitNameTextView = itemView.findViewById(R.id.fruitNameTextview);
        button = itemView.findViewById(R.id.removeItem);

    }

    public void bind(String fruitName) {
        fruitNameTextView.setText(fruitName);

    }

}
