package com.examen.pruebarappid.json;

import android.util.Log;

import com.examen.pruebarappid.utilidades.FileUtils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/**
 * Created by choqu_000 on 31/01/2017.
 * Clase json para escritura y lectura de archivo
 */

public class JSONParser {



    static String json = "";
    //metodo para conexion a servidor
    private HttpURLConnection httpConnection;
    //Atributo de instancia para escritura de archivo
    InputStream inputStream = null;
    //Metodo para lectura de archivo
    BufferedReader reader = null;


    public JSONParser() {
    }

    //Metodo para abrir la conecion a una url
    private void openHttpUrlConnection(String urlString) throws IOException {
        Log.d("urlstring in parser", urlString + "");
        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();

        httpConnection = (HttpURLConnection) connection;
        httpConnection.setConnectTimeout(30000);
        httpConnection.setRequestMethod("GET");

        httpConnection.connect();
    }

    //Metodo usando el cliente de apache
    private void openHttpClient(String urlString) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpParams httpParams = httpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);

        HttpGet httpGet = new HttpGet(urlString);

        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity httpEntity = httpResponse.getEntity();
        inputStream = httpEntity.getContent();

        reader = new BufferedReader(
                new InputStreamReader(inputStream, "UTF-8"), 8);
    }

    // Usando  HttpClient para <= Froyo
    public JSONObject getJSONHttpClient(String url)
            throws ClientProtocolException, IOException, JSONException {
        JSONObject jsonObject = null;
        try {
            openHttpClient(url);

            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }

            json = sb.toString();

            Log.d("json", json);
            jsonObject = new JSONObject(json);

        } finally {
            FileUtils.close(inputStream);
            FileUtils.close(reader);
        }
        return jsonObject;
    }

    // Usando HttpURLConnection para > Froyo
    public JSONObject getJSONHttpURLConnection(String urlString)
            throws IOException, JSONException {

        BufferedReader reader = null;
        StringBuffer output = new StringBuffer("");
        InputStream stream = null;
        JSONObject jsonObject = null;
        try {

            openHttpUrlConnection(urlString);

            if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                stream = httpConnection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream,
                        "UTF-8"), 8);
                String line = "";
                while ((line = reader.readLine()) != null)
                    output.append(line + "\n");
                json = output.toString();
                jsonObject = new JSONObject(json);
            }

        } finally {
            FileUtils.close(stream);
            FileUtils.close(reader);
        }
        return jsonObject;
    }
}
