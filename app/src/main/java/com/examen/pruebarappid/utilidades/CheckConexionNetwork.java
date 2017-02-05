package com.examen.pruebarappid.utilidades;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by choqu_000 on 01/02/2017.
 * Conexion
 */

public class CheckConexionNetwork {

    public static boolean isConnectionAvailable(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            //Instancia de conexion de red
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            //Si hay conexion
            if (netInfo != null && netInfo.isConnected()
                    && netInfo.isConnectedOrConnecting()
                    && netInfo.isAvailable()) {
                return true;
            }
        }
        return false;
    }

}
