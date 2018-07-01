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

public class PageTwo extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Create a list of CAT1
        final ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Zum Alten Markt", "Mettbagel und westfälische Schlachteplatte zum Bier in rustikalen Räumen mit Elchbüste oder auf der Terrasse.", "Markt 3, 44137 Dortmund"));
        products.add(new Product("Mongo's Restaurant Dortmund", "Drinks nach eigenem Rezept, asiatische Speisen à la carte und mongolisches All-you-can-eat auf Kuhfell-Bänken.", "Lindemannstraße 78, 44137 Dortmund"));
        products.add(new Product("ZBest Friends Sushi Bar", "Die modern eingerichtete Sushibar am See serviert auch thailändische Suppen und gegrillte Fischspezialitäten.", "Am Kai 20, 44263 Dortmund"));
        products.add(new Product("Overkamp", "Das elegante Restaurant ist seit über 300 Jahre im Familienbesitz und serviert gehobene westfälische Gerichte.", "Am Ellberg 1, 44265 Dortmund"));
        products.add(new Product("Wenkers am Markt", "Das gesellige Brauhauslokal mit Terrasse bietet hauseigenes Bier zu deutscher Kost und Schnitzelspezialitäten.", "Betenstraße 1, 44137 Dortmund"));
        products.add(new Product("EMIL Grill & Meer", "Das Restaurant bietet gehobene Grillspezialitäten im Gewölbe mit Kronleuchtern und auf der Terrasse an.", "Emil-Moog-Platz, 44137 Dortmund"));


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
