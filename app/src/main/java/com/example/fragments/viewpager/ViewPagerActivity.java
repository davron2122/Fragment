package com.example.fragments.viewpager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fragments.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ViewPagerActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager2 viewPager2;
    CustomFragmentAdapter CustomFragmentAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_activity);
        viewPager2 = findViewById(R.id.viewpager);
        CustomFragmentAdapter = new CustomFragmentAdapter(ViewPagerActivity.this);
        viewPager2.setAdapter(CustomFragmentAdapter);


        bottomNavigationView = findViewById(R.id.buttomnavigationmenu);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.im_home);

                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.im_message);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.im_profile);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}

