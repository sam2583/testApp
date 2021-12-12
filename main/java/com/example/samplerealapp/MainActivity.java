package com.example.samplerealapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.samplerealapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;

    private MeowBottomNavigation bottomNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        initViewPager();
        initBottomNavigation();

    }





    private void initBottomNavigation() {
        binding.mBottomNavigation.add(new MeowBottomNavigation.Model(0, R.drawable.ic_baseline_message_24));
        binding.mBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_baseline_person_24));
        binding.mBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_home_24));
        binding.mBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_baseline_star_24));
        binding.mBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_baseline_search_24));
        binding.mBottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

            }
        });
//
        binding.mBottomNavigation.show(2, true);

        binding.mBottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case 0:
                        binding.mViewPager.setCurrentItem(0, true);
                        break;
                    case 1:
                        binding.mViewPager.setCurrentItem(1, true);
                        break;
                    case 2:
                        binding.mViewPager.setCurrentItem(2, true);
                        break;
                    case 3:
                        binding.mViewPager.setCurrentItem(3, true);
                        break;
                    case 4:
                        binding.mViewPager.setCurrentItem(4, true);
                        break;
                }
            }
        });
    }


    private void initViewPager() {
        MenuViewPagerAdapter adapter = new MenuViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        binding.mViewPager.setAdapter(adapter);
        binding.mViewPager.setCurrentItem(2);
        binding.mViewPager.setUserInputEnabled(false);


    }






}
