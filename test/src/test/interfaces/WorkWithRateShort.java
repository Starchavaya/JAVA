package test.interfaces;

import test.models.Rate;
import test.models.RateShort;

import java.util.List;

public interface WorkWithRateShort {
    List<RateShort> getListRateShort(List<Rate> rates);
}
