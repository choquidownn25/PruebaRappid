package com.examen.pruebarappid.utilidades;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
/**
 * Created by choqu_000 on 31/01/2017.
 * Clase donde aramos el archivo
 */

public class FileUtils {

    //Metodo de cierre para lectura  de datos
    public static void close(Reader reader) { //Parametros de entrada de lectura de datos
        if (reader != null)
            try {
                reader.close();
            } catch (IOException e) {
            }
    }

    //Metodo para cerrar la escritura de datos
    public static void close(Writer writer) { //Pametros de entrada de escritura de datos
        if (writer != null)
            try {
                writer.close();
            } catch (IOException e) {
            }
    }
    //Metodo para cierre de la escritura del archivo
    public static void close(InputStream inputStream) { //parametros de entrada de datos
        if (inputStream != null)
            try {
                inputStream.close();
            } catch (IOException e) {
            }
    }
    //Metodo para el cierre de la representacion de la salida del archivo
    public static void close(OutputStream outputStream) { //parametros de entrada de datos
        if (outputStream != null)
            try {
                outputStream.close();
            } catch (IOException e) {
            }
    }
}
