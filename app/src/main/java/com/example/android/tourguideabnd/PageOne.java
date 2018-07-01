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

public class PageOne extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Create a list of CAT1
        final ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(getString(R.string.PageOne_ProductOne_1), getString(R.string.PageOne_ProductOne_2), getString(R.string.PageOne_ProductOne_3), R.drawable.bergmann_bier_kiosk));
        products.add(new Product(getString(R.string.PageOne_ProductTwo_1), getString(R.string.PageOne_ProductTwo_2), getString(R.string.PageOne_ProductTwo_3), R.drawable.deutsches_fu_ballmuseum_dortmund));
        products.add(new Product(getString(R.string.PageOne_ProductThree_1), getString(R.string.PageOne_ProductThree_2), getString(R.string.PageOne_ProductThree_3), R.drawable.dortmund__industriemuseum_zeche_zollern));
        products.add(new Product(getString(R.string.PageOne_ProductFour_1), getString(R.string.PageOne_ProductFour_2), getString(R.string.PageOne_ProductFour_3), R.drawable.dortmunderu));
        products.add(new Product(getString(R.string.PageOne_ProductFive_1), getString(R.string.PageOne_ProductFive_2), getString(R.string.PageOne_ProductFive_3), R.drawable.signal_iduna_park_new_sign));
        products.add(new Product(getString(R.string.PageOne_ProductSix_1), getString(R.string.PageOne_ProductSix_2), getString(R.string.PageOne_ProductSix_3), R.drawable.weihnachtsbaum_2014));
        products.add(new Product(getString(R.string.PageOne_ProductSeven_1), getString(R.string.PageOne_ProductSeven_2), getString(R.string.PageOne_ProductSeven_3), R.drawable.westfalenpark_mit_florianturm));


        //create new ProductAdapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), products);

        // find the recyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        // make the recyclerView use our adapter
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
