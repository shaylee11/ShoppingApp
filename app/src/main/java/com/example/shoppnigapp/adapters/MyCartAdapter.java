package com.example.shoppnigapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppnigapp.R;
import com.example.shoppnigapp.models.MyCartModel;

import java.util.List;


public class MyCartAdapter extends RecyclerView.Adapter<MyCartAdapter.ViewHolder> {

    Context context;
    List<MyCartModel> list;
    int totalAmount =0;

    public MyCartAdapter(Context context, List<MyCartModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyCartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_cart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyCartAdapter.ViewHolder holder, int position) {

        holder.date.setText(list.get(position).getCurrentDate());
        holder.time.setText(String.valueOf(list.get(position).getCurrentTime()));
        holder.price.setText(list.get(position).getCurrentPrice());
        holder.name.setText(String.valueOf(list.get(position).getCurrentName()));
        holder.totalPrice.setText(list.get(position).getCurrentPrice());
        holder.totalQuantity.setText(String.valueOf(list.get(position).getCurrentName()));



        totalAmount = totalAmount + list.get(position).getTotalprice();
        Intent intent = new Intent("MyTotal");
        intent.putExtra("totalAmount",totalAmount);

        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date,time,price,name,totalPrice,totalQuantity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.current_date);
            time = itemView.findViewById(R.id.current_time);
            price = itemView.findViewById(R.id.product_price);
            name = itemView.findViewById(R.id.product_name);
            totalPrice = itemView.findViewById(R.id.total_price);
            totalQuantity = itemView.findViewById(R.id.total_quantity);
        }
    }
}
