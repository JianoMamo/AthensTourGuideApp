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
public class NightLifeFragment extends Fragment {


    public NightLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.athens_tour_recyclerview,container,false);

        final ArrayList<AthensTour> athensToursGuide = new ArrayList<>();
        athensToursGuide.add(new AthensTour(R.drawable.galaxy_bar_athens, getString(R.string.athens_galaxy_bar),getString(R.string.hilton_address),getString(R.string.galaxy_bar_hours),getString(R.string.galaxy_bar_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.couleur_locale, getString(R.string.couleur_locale),getString(R.string.couleur_locale_address),getString(R.string.couleur_locale_hours),getString(R.string.couleur_locale_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.roof_garden_bar_grande_britagne, getString(R.string.grande_britagne_roof_garden),getString(R.string.grande_britagne_address),getString(R.string.roof_grande_britagne_hours),getString(R.string.roof_grande_britagne_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.j_coctail_bar, getString(R.string.j_coctail_bar),getString(R.string.j_cocktail_bar_address),getString(R.string.j_cocktail_bar_hours),getString(R.string.j_cocktail_bar_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.athens_open_air_cinema, getString(R.string.open_air_cinema),getString(R.string.open_air_cinema_address),getString(R.string.open_air_cinema_hours),getString(R.string.open_air_cinema_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.blue_beach_bar_athens, getString(R.string.blue_beach_bar),getString(R.string.blue_beach_bar_address),getString(R.string.blue_beach_bar_hours),getString(R.string.blue_beach_bar_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.brettos_wine_bar, getString(R.string.vrettos_wine_bar),getString(R.string.vrettos_address),getString(R.string.vrettos_hours),getString(R.string.vrettos_phone)));
        athensToursGuide.add(new AthensTour(R.drawable.half_note_jazz_club, getString(R.string.half_note_jazz_club),getString(R.string.half_note_address),getString(R.string.half_note_hours),getString(R.string.half_note_phone)));

        RecyclerView athensRecyclerView = rootView.findViewById(R.id.rv_tour_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        athensRecyclerView.setLayoutManager(layoutManager);
        athensRecyclerView.setHasFixedSize(true);

        AthensTourAdapter adapter = new AthensTourAdapter(getActivity(), athensToursGuide);
        athensRecyclerView.setAdapter(adapter);

        return rootView;
    }

}
