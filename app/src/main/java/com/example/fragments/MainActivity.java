package com.example.fragments;

import static com.example.fragments.R.id.fragment_container;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fragments.fragment.Homefragment;
import com.example.fragments.fragment.Messagefragment;
import com.example.fragments.fragment.Profilefragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_main);
        bottomNavigationView = findViewById(R.id.buttomnavigationmenu);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {




            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {

                    case R.id.im_home:
                        getSupportFragmentManager().beginTransaction().replace(fragment_container, new Homefragment()).commit();

                        break;


                    case R.id.im_message:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Messagefragment()).commit();

                        break;

                    case R.id.im_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Profilefragment()).commit();

                        break;


                }
                return true;
            }
        });

    }
}