package com.example.group15_capstone.View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.example.group15_capstone.R;

public class ProductDesc extends AppCompatActivity implements View.OnClickListener {

    private Button addToCartBtn, buyNowBtn;
    private ImageButton backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_desc);

        //Button
        addToCartBtn = findViewById(R.id.addToCartBtn);
        buyNowBtn = findViewById(R.id.buyNowBtn);
        backBtn = findViewById(R.id.backBtn);

        //Button Listener
        addToCartBtn.setOnClickListener(this);
        buyNowBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.addToCartBtn:
                Intent a = new Intent(this, ShoppingCart.class);
                startActivity(a);
                break;
            case R.id.buyNowBtn:
                Intent b = new Intent(this, Checkout.class);
                startActivity(b);
                break;
            case R.id.backBtn:
                finish();
                break;
        }
    }
}
