package com.example.group15_capstone.Fragment.Menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.group15_capstone.Adapter.NotificationRvAdapter;
import com.example.group15_capstone.Model.Data;
import com.example.group15_capstone.R;

public class NotificationFragment extends Fragment {

    private RecyclerView rv;
    private Data data;
    private ImageView notifBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        rv = view.findViewById(R.id.notificationRV);
        data = new Data();
        //Adapter
        NotificationRvAdapter rvAdapter = new NotificationRvAdapter(getContext(), data.notification());
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(rvAdapter);
        //ImageView
        notifBtn = view.findViewById(R.id.notificationButton);
        notifBtn.setOnClickListener(view1 -> Toast.makeText(getContext(), "Shopping Cart", Toast.LENGTH_SHORT).show());
        return view;
    }

}