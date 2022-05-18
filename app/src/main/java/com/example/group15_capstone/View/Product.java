package com.example.group15_capstone.View;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group15_capstone.Adapter.ProductRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.Model.ItemModel;
import com.example.group15_capstone.R;

import java.util.List;

public class Product extends AppCompatActivity {

    private RecyclerView rv;
    private Data data;
    private ProductRvAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Intent intent = getIntent();
        String text = intent.getStringExtra("productType");

        //RecyclerView
        rv = findViewById(R.id.productRV);

        //Data
        data = new Data();

        //Adapter
        setOnClickListener(product(text));
        ProductRvAdapter rvAdapter = new ProductRvAdapter(this, product(text), listener);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvAdapter);
    }

    private void setOnClickListener(List<ItemModel> list) {
        listener = (view, position) -> {
            Intent intent = new Intent(this, MyPurchase.class);
            intent.putExtra("product", list.get(position).getText());
            startActivity(intent);
        };
    }

    public List<ItemModel> product(String text){
        switch (text){
            case "Shirts":
                return data.shirt();
            case "Accessories":
                return data.accessories();
            case "Varsity":
                return data.varsityJacket();
            case "Stationary":
                return data.stationary();
            case "SchoolUniform":
                return data.schoolUniform();
            case "StudentId":
                return data.studentId();
            case "Yearbook":
                return data.yearbook();
            default:
                return data.none();
        }
    }
}