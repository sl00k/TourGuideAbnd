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
        products.add(new Product(getString(com.example.android.tourguideabnd.R.string.PageThree_ProductOne_1), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductOne_2), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductOne_3)));
        products.add(new Product(getString(com.example.android.tourguideabnd.R.string.PageThree_ProductTwo_1), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductTwo_2), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductTwo_3)));
        products.add(new Product(getString(com.example.android.tourguideabnd.R.string.PageThree_ProductThree_1), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductThree_2), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductThree_3)));
        products.add(new Product(getString(com.example.android.tourguideabnd.R.string.PageThree_ProductFour_1), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductFour_2), getString(com.example.android.tourguideabnd.R.string.PageThree_ProductFour_3)));

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
