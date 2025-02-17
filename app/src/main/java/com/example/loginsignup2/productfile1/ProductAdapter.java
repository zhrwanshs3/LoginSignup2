package com.example.loginsignup2.productfile1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginsignup2.FirebaseServices;
import com.example.loginsignup2.R;
import com.example.loginsignup2.userfile1.User;
import com.example.loginsignup2.userfile1.UserAdapter;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {
    Context context;
    ArrayList<Product> productsList;
    private FirebaseServices fbs;



    public ProductAdapter(Context context1, ArrayList<Product> proList) {
        this.context = context1;
        this.productsList = proList;
        this.fbs = FirebaseServices.getInstance();
    }



    @NonNull

    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v= LayoutInflater.from(context).inflate(R.layout.product_item,parent,false);
        return  new ProductAdapter.MyViewHolder(v);
    }


    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position)
    {
        Product product = productsList.get(position);
        holder.etnameProduct.setText(product.getNameProduct());
        holder.etNumber.setText(product.getNumberProduct());
        holder.etType.setText(product.getType());
        holder.etPrice.setText(product.getPrice());
    }


    public int getItemCount(){
        return productsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView etnameProduct, etType,etNumber,etPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            etnameProduct=itemView.findViewById(R.id.etnameProductProductItem);
            etType=itemView.findViewById(R.id.etTypeProductItem);
            etNumber=itemView.findViewById(R.id.etNumberProductItem);
            etPrice=itemView.findViewById(R.id.etPriceProductItem);



        }
    }


}


