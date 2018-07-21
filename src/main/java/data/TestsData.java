package data;

import java.io.*;
import java.util.Properties;

public abstract class TestsData {
    private static String oneDollar;
    private static String twoDollars;

    static{
        try {
            File file = new File("D:\\CitiGroupProject\\src\\main\\resources\\config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties property = new Properties();
            property.load(fileInput);
            oneDollar = property.getProperty("oneDollar");
            twoDollars = property.getProperty("twoDollars");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getOneDollar() {
        return oneDollar;
    }

    public static String getTwoDollars() {
        return twoDollars;
    }
}
