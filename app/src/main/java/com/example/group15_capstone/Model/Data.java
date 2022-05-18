package com.example.group15_capstone.Model;

import com.example.group15_capstone.R;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<ItemModel> item;

    public List<ItemModel> none(){
        item = new ArrayList<>();
        return item;
    }

    public List<ItemModel> schoolUniform(){
        item = new ArrayList<>();
        item.add(new ItemModel("Winter Uniform", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Summer Uniform", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Swimming Uniform", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("PE Uniform", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Diving Uniform", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Basketball Uniform", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Gloves", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Hat", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> accessories(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Metaverse", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> shirt(){
        item = new ArrayList<>();
        item.add(new ItemModel("School Uniform", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Basketball Jersey", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Volleyball Jersey", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("T-Shirts", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("School Uniform", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Basketball Jersey", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Volleyball Jersey", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("T-Shirts", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> stationary(){
        item = new ArrayList<>();
        item.add(new ItemModel("Pencil", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Eraser", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Paper", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Research", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Notebook", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Marker GOld", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Whiteboard", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Coffee", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> studentId(){
        item = new ArrayList<>();
        item.add(new ItemModel("Digital ID", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("VIP ID", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Physical ID", "Php 300", R.drawable.to_pay_icon));
        return item;
    }

    public List<ItemModel> varsityJacket(){
        item = new ArrayList<>();
        item.add(new ItemModel("Marlins", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Hawks", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Alpha", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("MX3", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Omega", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Century GOld", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Paracetamol", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Hashbrown", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> yearbook(){
        item = new ArrayList<>();
        item.add(new ItemModel("Year 2030", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Year 2022", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Year 1970", "Php 300", R.drawable.to_pay_icon));
        return item;
    }

    public List<ItemModel> digitalPurchase(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        return item;
    }

    public List<ItemModel> myLikes(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Metaverse", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> myPurchase(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Metaverse", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> myRating(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Metaverse", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> recentlyViewed(){
        item = new ArrayList<>();
        item.add(new ItemModel("ToothBrush", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Scope", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Ring", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Pins", "Php 200", R.drawable.to_rate_icon));
        item.add(new ItemModel("Sewing Machine", "Php 350", R.drawable.to_recieve_icon));
        item.add(new ItemModel("50 Bobux", "Php 300", R.drawable.cancel_icon));
        item.add(new ItemModel("Minecraft", "Php 300", R.drawable.to_pay_icon));
        item.add(new ItemModel("Metaverse", "Php 200", R.drawable.to_rate_icon));
        return item;
    }

    public List<ItemModel> toPay(){
        item = new ArrayList<>();
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.ic_baseline_shopping_bag_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD is still being transfered by the seller to the designated shipping location near San Francisco Bay", R.drawable.mcs_bags));
        item.add(new ItemModel("Hey", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.mcm_logo));
        return item;
    }

    public List<ItemModel> toRate(){
        item = new ArrayList<>();
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.ic_baseline_arrow_back_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.shirts));
        item.add(new ItemModel("Hey", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.ic_baseline_home_24));
        return item;
    }

    public List<ItemModel> toShip(){
        item = new ArrayList<>();
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.ic_baseline_shopping_bag_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.ic_baseline_notifications_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.ic_baseline_notifications_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.notification_icon_background_rounded));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.ic_baseline_notifications_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.ic_baseline_notifications_24));
        item.add(new ItemModel("Hey", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.mcm_logo));
        return item;
    }

    public List<ItemModel> toRecieve(){
        item = new ArrayList<>();
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.ic_baseline_shopping_bag_24));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.mcs_bags));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.mcs_bags));
        item.add(new ItemModel("Delivery", "Parcel 9459-2222-GYCD ", R.drawable.mcs_bags));
        item.add(new ItemModel("Hey", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.mcm_logo));
        item.add(new ItemModel("Hey", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.mcm_logo));
        return item;
    }

    public List<ItemModel> notification(){
        //Notifications
        item = new ArrayList<>();
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Cancellation Request Accepted", "Your cancellation request has been approved. Order 321748219RGYXV has been cancelled", R.drawable.cancel_icon));
        item.add(new ItemModel("COD Request Accepted", "The COD payment method for your order 2022983362WRD6F has been approved", R.drawable.to_pay_icon));
        item.add(new ItemModel("Have You Rated Your Purchase?", "Order 9459-2222-GYCD is complete. Your feedback matters to us!", R.drawable.to_rate_icon));
        item.add(new ItemModel("Have You Rated Your Purchase?", "Order 9459-2222-GYCD is complete. Your feedback matters to us!", R.drawable.to_rate_icon));
        item.add(new ItemModel("GCash Payment Request Accepted", "You can now use your GCash account for digital purchase of goods", R.drawable.to_pay_icon));
        item.add(new ItemModel("Parcel", "Parcel 9459-2222-GYCD has been delivered on your doorstep", R.drawable.to_recieve_icon));
        item.add(new ItemModel("Cancellation Request Accepted", "Your cancellation request has been approved. Order 321748219RGYXV has been cancelled", R.drawable.cancel_icon));
        item.add(new ItemModel("Have You Rated Your Purchase?", "Order 9459-2222-GYCD is complete. Your feedback matters to us!", R.drawable.to_rate_icon));
        item.add(new ItemModel("GCash Payment Request Accepted", "You can now use your GCash account for digital purchase of goods", R.drawable.to_pay_icon));
        item.add(new ItemModel("COD Request Accepted", "The COD payment method for your order 2022983362WRD6F has been approved", R.drawable.to_pay_icon));
        item.add(new ItemModel("Have You Rated Your Purchase?", "Order 9459-2222-GYCD is complete. Your feedback matters to us!", R.drawable.to_rate_icon));
        return item;
    }

}
