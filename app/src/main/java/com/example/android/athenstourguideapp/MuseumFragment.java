package com.example.android.athenstourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.athens_tour_recyclerview, container, false);

        final ArrayList<AthensTour> athensToursGuide = new ArrayList<>();
        athensToursGuide.add(new AthensTour(R.drawable.acropolis_museum, getString(R.string.acropolis_museum),getString(R.string.acropolis_museum_address),getString(R.string.acropolis_museum_hours),getString(R.string.acropolis_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.byzantine_museum, getString(R.string.byzantine_museum),getString(R.string.byzantine_museum_address),getString(R.string.byzantine_museum_hours),getString(R.string.byzantine_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.modern_art_museum, getString(R.string.modern_art_museum),getString(R.string.modern_art_museum_address),getString(R.string.modern_art_museum_hours),getString(R.string.modern_art_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.museum_mpenaki, getString(R.string.benaki_museum),getString(R.string.benaki_museum_address),getString(R.string.benaki_museum_hours),getString(R.string.benaki_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.national_archeological_museum, getString(R.string.national_archeological_museum),getString(R.string.archeological_museum_address),getString(R.string.archeological_museum_hours),getString(R.string.archeological_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.war_museum, getString(R.string.war_museum),getString(R.string.war_museum_address),getString(R.string.war_museum_hours),getString(R.string.war_museum_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.natural_history_museum, getString(R.string.natural_history_museum),getString(R.string.natural_museum_address),getString(R.string.natural_museum_hours),getString(R.string.natural_museum_phone)));

        RecyclerView athensRecyclerView = rootView.findViewById(R.id.rv_tour_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        athensRecyclerView.setLayoutManager(layoutManager);
        athensRecyclerView.setHasFixedSize(true);

        AthensTourAdapter adapter = new AthensTourAdapter(getActivity(), athensToursGuide);
        athensRecyclerView.setAdapter(adapter);

        return rootView;
    }
}
