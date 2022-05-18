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
import android.widget.TextView;

import com.example.group15_capstone.R;
import com.example.group15_capstone.View.Account;
import com.example.group15_capstone.View.MainMenu;
import com.example.group15_capstone.View.MyPurchase;

public class AccountFragment extends Fragment implements View.OnClickListener{

    Button buyingBtn, postingBtn, toPayBtn, toShipBtn, toReceiveBtn, toRateBtn, myPurchaseBtn, digitalPurchaseBtn,
    myLikesBtn, recentlyViewedBtn, myRatingBtn, settingsBtn, messageMcsBtn;
    TextView personName, personID;
    ImageView personImg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        //Button
        buyingBtn = view.findViewById(R.id.buyingBtn);
        postingBtn = view.findViewById(R.id.postingBtn);
        toPayBtn = view.findViewById(R.id.toPayBtn);
        toShipBtn = view.findViewById(R.id.toShipBtn);
        toReceiveBtn = view.findViewById(R.id.toReceiveBtn);
        toRateBtn = view.findViewById(R.id.toRateBtn);
        myPurchaseBtn = view.findViewById(R.id.myPurchaseButton);
        digitalPurchaseBtn = view.findViewById(R.id.digitalPurchaseButton);
        myLikesBtn = view.findViewById(R.id.myLikesBtn);
        recentlyViewedBtn = view.findViewById(R.id.recentlyViewedBtn);
        myRatingBtn = view.findViewById(R.id.myRatingBtn);
        settingsBtn = view.findViewById(R.id.settingsBtn);
        messageMcsBtn = view.findViewById(R.id.messageMcsBtn);

        //Button listener
        buyingBtn.setOnClickListener(this);
        postingBtn.setOnClickListener(this);
        toPayBtn.setOnClickListener(this);
        toShipBtn.setOnClickListener(this);
        toReceiveBtn.setOnClickListener(this);
        toRateBtn.setOnClickListener(this);
        myPurchaseBtn.setOnClickListener(this);
        digitalPurchaseBtn.setOnClickListener(this);
        myLikesBtn.setOnClickListener(this);
        recentlyViewedBtn.setOnClickListener(this);
        myRatingBtn.setOnClickListener(this);
        settingsBtn.setOnClickListener(this);
        messageMcsBtn.setOnClickListener(this);

        //TextView
        personName = view.findViewById(R.id.personName);
        personID = view.findViewById(R.id.personID);
        personImg = view.findViewById(R.id.personImg);

        //ImageView
        return view;
        //TODO: TOM NA LEZ GOooooooooooooo
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buyingBtn:
                Intent a = new Intent(getActivity(), MainMenu.class);
                startActivity(a);
                break;
            case R.id.postingBtn:
                Intent b = new Intent(getActivity(), MainMenu.class);
                startActivity(b);
                break;
            case R.id.toPayBtn:
                Intent c = new Intent(getActivity(), MyPurchase.class);
                c.putExtra("tabType", 0);
                startActivity(c);
                break;
            case R.id.toShipBtn:
                Intent d = new Intent(getActivity(), MyPurchase.class);
                d.putExtra("tabType", 1);
                startActivity(d);
                break;
            case R.id.toReceiveBtn:
                Intent e = new Intent(getActivity(), MyPurchase.class);
                e.putExtra("tabType", 2);
                startActivity(e);
                break;
            case R.id.toRateBtn:
                Intent f = new Intent(getActivity(), MyPurchase.class);
                f.putExtra("tabType", 3);
                startActivity(f);
                break;
            case R.id.myPurchaseButton:
                Intent g = new Intent(getActivity(), Account.class);
                g.putExtra("accountType", "My Purchase");
                startActivity(g);
                break;
            case R.id.digitalPurchaseButton:
                Intent h = new Intent(getActivity(), Account.class);
                h.putExtra("accountType", "Digital Purchase");
                startActivity(h);
                break;
            case R.id.myLikesBtn:
                Intent i = new Intent(getActivity(), Account.class);
                i.putExtra("accountType", "My Likes");
                startActivity(i);
                break;
            case R.id.recentlyViewedBtn:
                Intent j = new Intent(getActivity(), Account.class);
                j.putExtra("accountType", "Recently Viewed");
                startActivity(j);
                break;
            case R.id.myRatingBtn:
                Intent k = new Intent(getActivity(), Account.class);
                k.putExtra("accountType", "My Rating");
                startActivity(k);
                break;
            case R.id.settingsBtn:
                Intent l = new Intent(getActivity(), MainMenu.class);
                startActivity(l);
                break;
            case R.id.messageMcsBtn:
                Intent m = new Intent(getActivity(), MainMenu.class);
                startActivity(m);
                break;

        }
    }
}