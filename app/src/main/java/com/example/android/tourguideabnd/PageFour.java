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

public class PageFour extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Create a list of CAT1
        final ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Brinkhoff´s No.1", "Die Marke ist nach dem Entdecker des hellen Dortmunder Biertyps, dem Braumeister Fritz Brinkhoff, benannt. ", ""));
        products.add(new Product("Dortmunder Kronen ", "Keine andere Marke ist so eng und so lange mit der Stadt Dortmund verbunden wie Dortmunder Kronen. 575 Jahre Brautradition.", ""));
        products.add(new Product("Dortmunder Actien-Brauerei", "Rund um den Globus ist DAB seither ein Markenzeichen Dortmunder (und Deutscher) Bierkultur.", ""));
        products.add(new Product("Dortmunder Actien-Brauerei", "Rund um den Globus ist DAB seither ein Markenzeichen Dortmunder (und Deutscher) Bierkultur.", ""));
        products.add(new Product("Dortmunder Union", "Die Dortmunder Union Marken haben das Dortmunder Wahrzeichen - das Dortmunder U - als Markensymbol und somit eine enge Verbindung zur Stadt Dortmund.", ""));


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
