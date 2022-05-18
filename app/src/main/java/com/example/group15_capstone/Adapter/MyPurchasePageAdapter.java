package com.example.group15_capstone.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.group15_capstone.Fragment.MyPurchase.ToPay;
import com.example.group15_capstone.Fragment.MyPurchase.ToRate;
import com.example.group15_capstone.Fragment.MyPurchase.ToReceive;
import com.example.group15_capstone.Fragment.MyPurchase.ToShip;

public class MyPurchasePageAdapter extends FragmentStateAdapter {

    public MyPurchasePageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new ToShip();
            case 2:
                return new ToReceive();
            case 3:
                return new ToRate();
            default:
                return new ToPay();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
