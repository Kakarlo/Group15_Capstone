package com.example.group15_capstone.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group15_capstone.Model.ItemModel;
import com.example.group15_capstone.R;

import java.util.List;

public class MyPurchaseRvAdapter extends RecyclerView.Adapter<MyPurchaseRvAdapter.ViewHolder> {

    private final List<ItemModel> myPurchase;
    private final LayoutInflater inflater;

    public MyPurchaseRvAdapter(Context context, List<ItemModel> myPurchase) {
        this.myPurchase = myPurchase;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.my_purchase_temp,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.header.setText(myPurchase.get(position).getHeader());
        holder.text.setText(myPurchase.get(position).getText());
        holder.img.setImageResource(myPurchase.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return myPurchase.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView header, text;
        private final ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            header = itemView.findViewById(R.id.notifHeader);
            text = itemView.findViewById(R.id.notifText);
            img = itemView.findViewById(R.id.notifImage);

        }

    }

}
