package com.example.nearbygrocer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

@SuppressWarnings("ALL")
public class Common {
    public static boolean isConnectedToInternet(Context contex){

        ConnectivityManager connectivityManager= (ConnectivityManager)
                contex.getSystemService(android.content.Context.CONNECTIVITY_SERVICE);
        if(connectivityManager!=null){
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            for (NetworkInfo networkInfo : info) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED)
                    return true;
            }

        }
        return false;
    }
}
