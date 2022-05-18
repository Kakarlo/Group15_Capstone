package com.example.group15_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.group15_capstone.R;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    ImageView mcsCart, mcsBags;
    Animation leftright, rightleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //ImageView
        mcsCart = findViewById(R.id.mcsCart);
        mcsBags = findViewById(R.id.mcsBags);

        //Animation
        leftright = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        leftright.setStartOffset(400);
        rightleft = AnimationUtils.loadAnimation(this, R.anim.right_to_left);
        rightleft.setStartOffset(700);

        //Animating
        mcsCart.startAnimation(leftright);
        mcsBags.startAnimation(rightleft);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainMenu.class);
            startActivity(intent);
            finish();
        },3000);

    }

}