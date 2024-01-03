package com.imtiaz_acedamy.practiceproject_2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.imtiaz_acedamy.practiceproject_2.Domains.FutureDomain;
import com.imtiaz_acedamy.practiceproject_2.R;

import java.util.ArrayList;

public class FutureAdapter extends RecyclerView.Adapter<FutureAdapter.viewHolder> {

    ArrayList<FutureDomain> items;
    Context context;

    public FutureAdapter(ArrayList<FutureDomain> items) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public FutureAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future, parent, false);

        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapter.viewHolder holder, int position) {

        holder.dayTxt.setText(items.get(position).getDay());
        holder.lowTxt.setText(items.get(position).getLowTemp()+"");
        holder.highTxt.setText(items.get(position).getHighTemp()+"");
        holder.statusTxt.setText(items.get(position).getStatus());

        int drawableResourceId = holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(), "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView dayTxt, statusTxt,highTxt, lowTxt;
        ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            dayTxt = itemView.findViewById(R.id.dayTxt);
            statusTxt = itemView.findViewById(R.id.statusTxt);
            highTxt = itemView.findViewById(R.id.highTxt);
            lowTxt = itemView.findViewById(R.id.lowTxt);
            pic = itemView.findViewById(R.id.pic);

        }
    }
}
