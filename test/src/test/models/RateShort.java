package test.models;

import java.util.Date;
import java.util.Objects;

public class RateShort implements Comparable<RateShort> {
    private Date date;
    private String short_name;
    private String full_name;
    private double rate;

    public RateShort(Date date, String short_name, String full_name, double rate) {
        this.date = date;
        this.short_name = short_name;
        this.full_name = full_name;
        this.rate = rate;
    }

    public RateShort(Rate rateC) {
        this.date = rateC.getDate();
        this.short_name = rateC.getCur_Abbreviation();
        this.full_name = rateC.getCur_Name();
        this.rate = rateC.getCur_OfficialRate();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateShort rateShort = (RateShort) o;
        return Objects.equals(date, rateShort.date) &&
                Objects.equals(short_name, rateShort.short_name) &&
                Objects.equals(full_name, rateShort.full_name) &&
                Objects.equals(rate, rateShort.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, short_name, full_name, rate);
    }

    @Override
    public String toString() {
        return "RateShort{" +
                "date=" + date +
                ", short_name='" + short_name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(RateShort o) {
        double compare = o.getRate();
        if (compare > this.getRate()) {
            return 1;
        } else if (compare == this.getRate()) {
            return 0;
        } else
            return -1;

    }
}
