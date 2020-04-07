package test.work;

import test.conn.BankConnection;
import test.gson.JsonWorker;
import test.interfaces.WorkWithRate;
import test.models.Rate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class RateWorker extends Thread implements WorkWithRate {

    private List<Rate> rateList = new ArrayList<>();
    public RateWorker(String name) {
        super(name);
    }

    public List<Rate> getRateList() {
        return rateList;
    }

    public void run() {
        try {
            HttpURLConnection conn = new BankConnection().getConn(Thread.currentThread().getName());
            StringBuilder sb = new StringBuilder();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
                JsonWorker jsonWorker = new JsonWorker();
                rateList = jsonWorker.getRate(sb.toString());
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
