package test.conn;

import java.net.HttpURLConnection;
import java.net.URL;

public class BankConnection{

    public HttpURLConnection getConn(String date) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL("https://www.nbrb.by/api/exrates/rates?ondate=" + date + "&periodicity=0").openConnection();
            conn.setRequestMethod("GET");
            conn.setUseCaches(false);
            conn.connect();
            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()) {
                return conn;
            } else {
                System.out.println("fail: " + conn.getResponseCode() + " ; " + conn.getResponseMessage() + ".");
                System.exit(0);
            }
        } catch (Throwable e) {
            System.out.println("Неуспешное соединение");
            System.exit(0);
        }
        return null;
    }
}
