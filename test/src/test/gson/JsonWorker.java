package test.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import test.models.Rate;
import test.models.RateShort;

import java.util.List;

public class JsonWorker {
    public List<Rate> getRate(String json) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create();
        return gson.fromJson(json, new TypeToken<List<Rate>>() {
        }.getType());
    }

    public String getRateChort(List<RateShort> shortList) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create();
        return gson.toJson(shortList);
    }
}
