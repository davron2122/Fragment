package com.example.fragments.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.R;
import com.example.fragments.adapter.viewholders.FruitsListAdapter;

import java.util.ArrayList;

public class Homefragment extends Fragment {
    private ArrayList<String> fruitsArrayList;
    private RecyclerView fruitsRecyclerView;
    private FruitsListAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fruitsArrayList = new ArrayList<>();


        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Strawberry");
        fruitsArrayList.add("Mango");
        fruitsArrayList.add("Mandarin");
        fruitsArrayList.add("Cherry");
        fruitsArrayList.add("Grape");
        fruitsArrayList.add("Lemon");


        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Strawberry");
        fruitsArrayList.add("Mango");
        fruitsArrayList.add("Mandarin");
        fruitsArrayList.add("Cherry");
        fruitsArrayList.add("Grape");
        fruitsArrayList.add("Lemon");


        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Strawberry");
        fruitsArrayList.add("Mango");
        fruitsArrayList.add("Mandarin");
        fruitsArrayList.add("Cherry");
        fruitsArrayList.add("Grape");
        fruitsArrayList.add("Lemon");

        adapter=new FruitsListAdapter(fruitsArrayList);


    }

    @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.home_fragment, container, false);
            return view;
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            fruitsRecyclerView = view.findViewById(R.id.fruitsRecycleView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL,false);


        fruitsRecyclerView.setLayoutManager(layoutManager);
        fruitsRecyclerView.setAdapter(adapter);
        adapter.setRemoveItemClickListener(new FruitsListAdapter.RemoveItemClickListener() {
            @Override
            public void onRemoveItem(int position) {
                fruitsArrayList.remove(position);
                adapter.notifyDataSetChanged();
            }
        });




    }

    }
