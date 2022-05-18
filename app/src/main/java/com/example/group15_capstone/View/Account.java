package com.example.group15_capstone.View;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group15_capstone.Adapter.ProductRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.Model.ItemModel;
import com.example.group15_capstone.R;

import java.util.List;

public class Account extends AppCompatActivity {

    private RecyclerView rv;
    private Data data;
    private ImageButton backBtn;
    private TextView accountText;
    private ProductRvAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_template);
        Intent intent = getIntent();
        String text = intent.getStringExtra("accountType");

        //RecyclerView
        rv = findViewById(R.id.accountRV);

        //Data
        data = new Data();

        //Adapter
        setOnClickListener(product(text));
        ProductRvAdapter rvAdapter = new ProductRvAdapter(this, product(text), listener);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvAdapter);

        //Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());

        //TextView
        accountText = findViewById(R.id.accountText);
        accountText.setText(text);
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
            case "My Purchase":
                return data.myPurchase();
            case "Digital Purchase":
                return data.digitalPurchase();
            case "My Likes":
                return data.myLikes();
            case "Recently Viewed":
                return data.recentlyViewed();
            case "My Rating":
                return data.myRating();
            default:
                return data.none();
        }
    }
}