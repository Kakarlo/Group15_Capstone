package com.example.group15_capstone.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.group15_capstone.Adapter.MyPurchasePageAdapter;
import com.example.group15_capstone.R;
import com.google.android.material.tabs.TabLayout;

public class MyPurchase extends AppCompatActivity {

    TabLayout tabMyPurchase;
    ViewPager2 vp;
    MyPurchasePageAdapter vpAdapter;
    ImageButton backBtn;
    int i, test = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_purchase);

        //Working
        Intent intent = getIntent();
        i = intent.getIntExtra("tabType", 0);

        //Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());

        //tabLayout
        tabMyPurchase = findViewById(R.id.tabLayout);

        //viewPager
        vp = findViewById(R.id.myPurchasePager);

        FragmentManager fm = getSupportFragmentManager();
        vpAdapter = new MyPurchasePageAdapter(fm,getLifecycle());
        vp.setAdapter(vpAdapter);

        //listens for the tab layout
        tabMyPurchase.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //binds the tab layout to the view pager
        vp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (test >= 0){
                    tabMyPurchase.selectTab(tabMyPurchase.getTabAt(i));
                    test -= 1;
                } else {
                    tabMyPurchase.selectTab(tabMyPurchase.getTabAt(position));
                }
            }
        });

    }
}