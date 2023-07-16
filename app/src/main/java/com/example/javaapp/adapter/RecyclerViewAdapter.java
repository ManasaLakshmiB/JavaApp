package com.example.javaapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.javaapp.R;
import com.example.javaapp.model.RecyclerData;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<RecyclerData> flags;//listitems

    public void setListItems(List<RecyclerData>listItems){
        this.flags = listItems;
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.textView.setText(flags.get(position).getFlags().getAlt());
        Glide.with(holder.imageView)
                .load(flags.get(position).getFlags().getSvg())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        if(flags == null)
           return 0;
        else
            return  flags.size();
    }
    public class MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            textView = itemView.findViewById(R.id.textview);
        }
    }

}
