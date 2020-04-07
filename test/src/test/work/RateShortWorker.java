package test.work;


import test.conn.BankConnection;
import test.gson.JsonWorker;
import test.interfaces.WorkWithRateShort;
import test.models.Rate;
import test.models.RateShort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RateShortWorker implements WorkWithRateShort {

    public List<RateShort> getListRateShort(List<Rate> rates) {
        List<RateShort> rateShortList = new ArrayList<>();
        for (Rate rate : rates) {
            if ((rate.getCur_Abbreviation().equals("USD")) || (rate.getCur_Abbreviation().equals("RUB")) || (rate.getCur_Abbreviation().equals("EUR"))) {
                rateShortList.add(new RateShort(rate));
            }
        }
        Collections.sort(rateShortList);
        return rateShortList;
    }
}
