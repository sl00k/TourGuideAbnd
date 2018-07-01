package com.example.android.tourguideabnd;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PageThree extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Create a list of CAT1
        final ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Schellack & Co", "Musik der 20er- bis 40er-Jahre", "Location: domicil "));
        products.add(new Product("Violet Quartet", "Jazz, Ethno, Trance", "Location: Dortmunder U "));
        products.add(new Product("Deep Dive", "Chill, House, Lounge mit P.M.FM + Live-Einlagen zum Sonnenuntergang, bei gutem Wetter ", "Location: Herr Walter "));
        products.add(new Product("Mitteilungen für interessierte Dorfbewohner", "mit Fritz Eckenga, Gast: Severin Groebner", "Location: Kino im U "));

        //create new CategoryAdapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), products);

        // find the list view
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        // make the ListView use our adapter
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
