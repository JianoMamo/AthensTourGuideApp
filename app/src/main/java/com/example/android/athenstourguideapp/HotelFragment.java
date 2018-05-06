package com.example.android.athenstourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.athens_tour_recyclerview,container,false);

        final ArrayList<AthensTour> athensToursGuide = new ArrayList<>();
        athensToursGuide.add(new AthensTour(R.drawable.hilton_athens_hotel, getString(R.string.hilton_hotel),getString(R.string.hilton_address),getString(R.string.hotel_hours),getString(R.string.hilton_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.athens_oscar_hotel, getString(R.string.athens_oscar_hotel),getString(R.string.athens_oscar_address),getString(R.string.hotel_hours),getString(R.string.athens_oscar_number)));
        athensToursGuide.add(new AthensTour(R.drawable.athens_tiare_hotel, getString(R.string.athens_tiare_hotel),getString(R.string.athens_tiare_address),getString(R.string.hotel_hours),getString(R.string.athens_tiare_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.melia_athens_hotel, getString(R.string.melia_hotel),getString(R.string.melia_address),getString(R.string.hotel_hours),getString(R.string.melia_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.divani_caravel_hotel, getString(R.string.divani_caravel_hotel),getString(R.string.divani_caravel_address),getString(R.string.hotel_hours),getString(R.string.divani_caravel_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.crown_plaza_hotel, getString(R.string.crowne_plaza_hotel),getString(R.string.crowne_plaza_address),getString(R.string.hotel_hours),getString(R.string.crowne_plaza_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.grande_britagne_hotel, getString(R.string.grande_britagne_hotel),getString(R.string.grande_britagne_address),getString(R.string.hotel_hours),getString(R.string.grande_britagne_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.president_hotel, getString(R.string.president_hotel),getString(R.string.president_address),getString(R.string.hotel_hours),getString(R.string.president_phone)));

        RecyclerView athensRecyclerView = rootView.findViewById(R.id.rv_tour_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        athensRecyclerView.setLayoutManager(layoutManager);
        athensRecyclerView.setHasFixedSize(true);

        AthensTourAdapter adapter = new AthensTourAdapter(getActivity(), athensToursGuide);
        athensRecyclerView.setAdapter(adapter);

        return rootView;
    }

}
