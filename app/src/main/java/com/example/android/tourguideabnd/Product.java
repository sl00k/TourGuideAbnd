package com.example.android.tourguideabnd;


/**
 * Created by Belal on 10/18/2017.
 */


public class Product {
    private static int NO_IMAGE_PROVIDED = -1;
    private String title;
    private String info;
    private String street;
    private int imageId = NO_IMAGE_PROVIDED;

    public Product(String title, String info, String street) {
        this.title = title;
        this.info = info;
        this.street = street;
    }

    public Product(String title, String info, String street, int image) {
        this.title = title;
        this.info = info;
        this.street = street;
        this.imageId = image;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public String getStreet() {
        return street;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }
}

