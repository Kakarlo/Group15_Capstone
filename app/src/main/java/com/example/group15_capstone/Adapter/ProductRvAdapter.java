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

public class ProductRvAdapter extends RecyclerView.Adapter<ProductRvAdapter.ViewHolder> {

    private final List<ItemModel> product;
    private final LayoutInflater inflater;
    private final RecyclerViewClickListener listener;

    public ProductRvAdapter(Context context, List<ItemModel> product, RecyclerViewClickListener listener) {
        this.product = product;
        this.inflater = LayoutInflater.from(context);
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.product_temp,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.header.setText(product.get(position).getHeader());
        holder.text.setText(product.get(position).getText());
        holder.img.setImageResource(product.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return product.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView header, text;
        private final ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            header = itemView.findViewById(R.id.notifHeader);
            text = itemView.findViewById(R.id.notifText);
            img = itemView.findViewById(R.id.notifImage);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }

    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

}
