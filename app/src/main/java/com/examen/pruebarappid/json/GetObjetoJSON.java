package com.examen.pruebarappid.json;

import android.os.Build;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by choqu_000 on 31/01/2017.
 * Clase de Objeto Json
 *
 */

public class GetObjetoJSON {

    //Clase json para mapeo de informarcion
    public static JSONObject getJSONObject(String url) throws IOException,
            JSONException {

        JSONObject jsonObject = null;
        JSONParser jsonParser = new JSONParser();

        //Usa la conexion HttpURLConnection
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.FROYO){
            jsonObject = jsonParser.getJSONHttpURLConnection(url);
        }else {
            jsonObject= jsonParser.getJSONHttpClient(url);
        }
        //Retorna json
        return jsonObject;
    }
}
