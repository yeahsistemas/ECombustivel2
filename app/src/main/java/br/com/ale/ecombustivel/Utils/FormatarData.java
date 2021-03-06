package br.com.ale.ecombustivel.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by emerson on 07/01/17.
 */

public class FormatarData {
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    static DateFormat dfHora = new SimpleDateFormat("HH:mm");


    public static SimpleDateFormat getFormato() {
        return formato;
    }

    public static SimpleDateFormat getFormatoHora() {
        return formatoHora;
    }


    public static DateFormat getDf() {
        return df;
    }

    public static void setDf(DateFormat df) {
        FormatarData.df = df;
    }

    public static DateFormat getDfHora() {
        return dfHora;
    }
}
