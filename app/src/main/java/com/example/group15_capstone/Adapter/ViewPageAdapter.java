package com.example.group15_capstone.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.group15_capstone.Fragment.Menu.AccountFragment;
import com.example.group15_capstone.Fragment.Menu.HomeFragment;
import com.example.group15_capstone.Fragment.Menu.NotificationFragment;

public class ViewPageAdapter extends FragmentStateAdapter {

    public ViewPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new HomeFragment();
            case 2:
                return new AccountFragment();
            default:
                return new NotificationFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
