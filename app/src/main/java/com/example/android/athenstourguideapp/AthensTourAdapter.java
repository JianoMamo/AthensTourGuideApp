package com.example.android.athenstourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AthensTourAdapter extends RecyclerView.Adapter<AthensTourAdapter.MyHolder> {

    private Context context;
    private ArrayList<AthensTour> athensTours;

    public AthensTourAdapter(Context context, ArrayList<AthensTour> athensTours) {
        this.context = context;
        this.athensTours = athensTours;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View cardItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, null);
        MyHolder myHolder = new MyHolder(cardItemView);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.athensTourImageId.setImageResource(athensTours.get(position).getmAthensImageResourceId());
        holder.athensTourTitle.setText(athensTours.get(position).getmAthensStringResourceId());
        holder.athensLocation.setText(athensTours.get(position).getmAthensLocationResourceId());
        holder.athensOperationHours.setText(athensTours.get(position).getmAthensHoursResourceId());
        holder.athensPhone.setText(athensTours.get(position).getmAthensPhoneResourceId());

    }

    @Override
    public int getItemCount() {
        return athensTours.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.athens_image) ImageView athensTourImageId;
        @BindView(R.id.athens_text) TextView athensTourTitle;
        @BindView(R.id.athens_location_text_view) TextView athensLocation;
        @BindView(R.id.athens_hours_text_view) TextView athensOperationHours;
        @BindView(R.id.athens_telephone_text_view) TextView athensPhone;


        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}


