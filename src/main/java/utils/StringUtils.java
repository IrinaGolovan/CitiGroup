package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by oleksandr on 09.03.2018.
 */
public class StringUtils {

    public static String generateEmail(String email, String domain){
        DateFormat dateFormat = new SimpleDateFormat("MMMdd_HH:mm", Locale.US);
        Date date = new Date();
        return email + "_" + dateFormat.format(date).replace(":", "").toString() + domain;
    }

    public static float roundCurrencyCourse(float course){
         return Math.round(course * 100f)/100f;
    }
}
