package com.example.group15_capstone.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.group15_capstone.Adapter.ShoppingRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.Model.ItemModel;
import com.example.group15_capstone.R;

import java.util.List;

public class ShoppingCart extends AppCompatActivity {

    private RecyclerView rv;
    private Data data;
    private ImageButton backBtn;
    private Button checkoutBtn;
    private ShoppingRvAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        //RecyclerView
        rv = findViewById(R.id.shoppingCartRV);

        //Data
        data = new Data();

        //Adapter
        setOnClickListener(data.shoppingCart());
        ShoppingRvAdapter rvAdapter = new ShoppingRvAdapter(this, data.shoppingCart(), listener);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvAdapter);

        //Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());
        checkoutBtn = findViewById(R.id.checkOutButton);
        checkoutBtn.setOnClickListener(view -> {
            Intent intent = new Intent(ShoppingCart.this, Checkout.class);
            startActivity(intent);
        });
    }

    private void setOnClickListener(List<ItemModel> list) {
        listener = (view, position) -> {
            Intent intent = new Intent(this, ProductDesc.class);
            intent.putExtra("product", list.get(position).getText());
            startActivity(intent);
        };
    }
}