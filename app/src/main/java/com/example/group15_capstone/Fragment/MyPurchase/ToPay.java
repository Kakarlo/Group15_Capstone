package com.example.group15_capstone.Fragment.MyPurchase;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.group15_capstone.Adapter.MyPurchaseRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.R;

public class ToPay extends Fragment {

    private RecyclerView rv;
    private Data data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_purchase_template, container, false);
        rv = view.findViewById(R.id.toPayRv);
        data = new Data();
        //Adapter
        MyPurchaseRvAdapter adapter = new MyPurchaseRvAdapter(getContext(), data.toPay());
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
        return view;
    }

}