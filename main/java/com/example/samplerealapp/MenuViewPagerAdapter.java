package com.example.samplerealapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MenuViewPagerAdapter extends FragmentStateAdapter {


    public MenuViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentMessageContainer();
            case 1:
                return new FragmentAccountContainer();

            case 2:
                return new FragmentHomeContainer();

            case 3:
                return new FragmentFavoriteContainer();

            case 4:
                return new FragmentSearchContainer();


        }


        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
