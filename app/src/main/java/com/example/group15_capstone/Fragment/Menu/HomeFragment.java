package com.example.group15_capstone.Fragment.Menu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.group15_capstone.R;
import com.example.group15_capstone.View.Product;
import com.example.group15_capstone.View.ShoppingCart;

public class HomeFragment extends Fragment implements View.OnClickListener{

    Button shirtCategory, accessoriesCategory, varsityCategory, stationaryCategory,
    schoolUniformCategory, studentIdCategory, yearbookCategory;
    ImageView notifBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Button
        shirtCategory = view.findViewById(R.id.shirtCategory);
        accessoriesCategory = view.findViewById(R.id.accessoriesCategory);
        varsityCategory = view.findViewById(R.id.varsityCategory);
        stationaryCategory = view.findViewById(R.id.stationaryCategory);
        schoolUniformCategory = view.findViewById(R.id.schoolUniformCategory);
        studentIdCategory = view.findViewById(R.id.studentIdCategory);
        yearbookCategory = view.findViewById(R.id.yearbookCategory);

        //Button Listener
        shirtCategory.setOnClickListener(this);
        accessoriesCategory.setOnClickListener(this);
        varsityCategory.setOnClickListener(this);
        stationaryCategory.setOnClickListener(this);
        schoolUniformCategory.setOnClickListener(this);
        studentIdCategory.setOnClickListener(this);
        yearbookCategory.setOnClickListener(this);

        //ImageView
        notifBtn = view.findViewById(R.id.notificationButton);
        notifBtn.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), ShoppingCart.class);
            startActivity(intent);
        });

        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), Product.class);
        switch(view.getId()) {
            case R.id.shirtCategory:
                intent.putExtra("productType", "Shirts");
                break;
            case R.id.accessoriesCategory:
                intent.putExtra("productType", "Accessories");
                break;
            case R.id.varsityCategory:
                intent.putExtra("productType", "Varsity");
                break;
            case R.id.stationaryCategory:
                intent.putExtra("productType", "Stationary");
                break;
            case R.id.schoolUniformCategory:
                intent.putExtra("productType", "SchoolUniform");
                break;
            case R.id.studentIdCategory:
                intent.putExtra("productType", "StudentId");
                break;
            case R.id.yearbookCategory:
                intent.putExtra("productType", "Yearbook");
                break;
        }
        startActivity(intent);
    }
}