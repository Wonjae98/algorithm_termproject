package com.example.algorithmproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainMenuActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private SingleInputFragment fragmentsingle = new SingleInputFragment();
    private TogetherInputFragment fragmenttogether = new TogetherInputFragment();
    private HowtoFragment fragmenthowto = new HowtoFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.menu_frame_layout, fragmentsingle).commitAllowingStateLoss();


        BottomNavigationView bottomNavigationView = findViewById(R.id.menu_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()) {
                case R.id.menu_single:
                    transaction.replace(R.id.menu_frame_layout, fragmentsingle).commitAllowingStateLoss();
                    break;
                case R.id.menu_together:
                    transaction.replace(R.id.menu_frame_layout, fragmenttogether).commitAllowingStateLoss();
                    break;
                case R.id.menu_howto:
                    transaction.replace(R.id.menu_frame_layout, fragmenthowto).commitAllowingStateLoss();
                    break;

            }

            return true;
        }
    }
}
