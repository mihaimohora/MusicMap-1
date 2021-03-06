package com.example.cristianbaita.MusicMap.helper;

import android.location.Address;

/**
 * Created by Rares - Desktop on 14.09.2016.
 */
public class GeoSearchResult {

    private Address address;

    public GeoSearchResult(Address address)
    {
        this.address = address;
    }

    public String getAddress(){

        String display_address = "";

        for(int i = 0; i <= address.getMaxAddressLineIndex(); i++)
        {
            display_address += address.getAddressLine(i) + ", ";
        }

        display_address = display_address.substring(0, display_address.length() - 2);

        return display_address;
    }


    public double getLongitude(){
        return address.getLongitude();
    }

    public double getLatitude(){
        return address.getLatitude();
    }

    public String toString(){
        String display_address = "";

        if(address.getFeatureName() != null)
        {
            display_address += address + ", ";
        }

        for(int i = 0; i < address.getMaxAddressLineIndex(); i++)
        {
            display_address += address.getAddressLine(i);
        }

        return display_address;
    }
}