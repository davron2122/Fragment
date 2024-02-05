package com.example.fragments.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fragments.fragment.Homefragment;
import com.example.fragments.fragment.Messagefragment;
import com.example.fragments.fragment.Profilefragment;

public class CustomFragmentAdapter extends FragmentStateAdapter  {
    public CustomFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       Fragment fragment = null;
       switch (position){
           case 0:
              fragment= new Homefragment();
              break;
           case 1:
               fragment = new Messagefragment();
               break;
           case 2:
               fragment = new Profilefragment();
               break;
           default:
               fragment=new Fragment();
       }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
