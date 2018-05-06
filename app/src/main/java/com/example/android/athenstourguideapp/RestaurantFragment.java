package com.example.android.athenstourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.athens_tour_recyclerview,container,false);

        final ArrayList<AthensTour> athensToursGuide = new ArrayList<>();
        athensToursGuide.add(new AthensTour(R.drawable.royal_olympic_restaurant, getString(R.string.royal_olympic_restaurant),getString(R.string.olympic_restaurant_address),getString(R.string.royal_olympic_restaurant_hours),getString(R.string.royal_olympic_restaurant_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.spondi_restaurant, getString(R.string.spondi_restaurant),getString(R.string.spondi_address),getString(R.string.spondi_hours),getString(R.string.spondi_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.dinner_in_the_sky, getString(R.string.dinner_in_the_sky),getString(R.string.dinner_location),getString(R.string.dinner_hours),getString(R.string.dinner_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.kohylia_restaurant, getString(R.string.kohilia_restaurant),getString(R.string.kohilia_address),getString(R.string.kohilia_hours),getString(R.string.kohilia_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.electra_palace_restaurant, getString(R.string.electra_palace_restaurant),getString(R.string.electra_location),getString(R.string.electra_hours),getString(R.string.electra_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.malabar_restaurant, getString(R.string.malabar_restaurant),getString(R.string.malabar_address),getString(R.string.malabar_hours),getString(R.string.malabar_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.alatsi_restaurant, getString(R.string.alatsi_restaurant),getString(R.string.alatsi_address),getString(R.string.alatsi_hours),getString(R.string.alatsi_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.duo_mazi_restaurant, getString(R.string.duomazi_restaurant),getString(R.string.duo_mazi_address),getString(R.string.duo_mazi_hours),getString(R.string.duo_mazi_phone)));

        RecyclerView athensRecyclerView = rootView.findViewById(R.id.rv_tour_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        athensRecyclerView.setLayoutManager(layoutManager);
        athensRecyclerView.setHasFixedSize(true);

        AthensTourAdapter adapter = new AthensTourAdapter(getActivity(), athensToursGuide);
        athensRecyclerView.setAdapter(adapter);

        return rootView;

    }

}
