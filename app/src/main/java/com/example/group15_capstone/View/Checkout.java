package com.example.group15_capstone.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.group15_capstone.Adapter.CheckoutRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.R;

public class Checkout extends AppCompatActivity {

    private ImageButton backBtn;
    private Button placeOrderBtn;
    private RecyclerView rv;
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());
        placeOrderBtn = findViewById(R.id.placeOrderBtn);
        placeOrderBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Checkout.this, MainMenu.class);
            startActivity(intent);
            Toast.makeText(this, "Your Order has been sent!", Toast.LENGTH_SHORT).show();
            finish();
        });

        //RecyclerView
        rv = findViewById(R.id.checkoutRV);

        //Data
        data = new Data();

        //Adapter
        CheckoutRvAdapter rvAdapter = new CheckoutRvAdapter(this, data.shoppingCart());
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvAdapter);
    }
}