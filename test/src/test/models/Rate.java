package test.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Objects;

public class Rate {
    @SerializedName("Cur_ID")
    private int cur_ID;
    @SerializedName("Date")
    private Date date;
    @SerializedName("Cur_Abbreviation")
    private String cur_Abbreviation;
    @SerializedName("Cur_Scale")
    private int cur_Scale; //количество единиц иностранной валюты
    @SerializedName("Cur_Name")
    private String cur_Name; //наименование валюты на русском языке во множественном, либо в единственном числе, в зависимости от количества единиц
    @SerializedName("Cur_OfficialRate")
    private double cur_OfficialRate; // курс

    public Rate() {
    }

    public Rate(int cur_ID, Date date, String cur_Abbreviation, int cur_Scale, String cur_Name, double cur_OfficialRate) {
        this.cur_ID = cur_ID;
        this.date = date;
        this.cur_Abbreviation = cur_Abbreviation;
        this.cur_Scale = cur_Scale;
        this.cur_Name = cur_Name;
        this.cur_OfficialRate = cur_OfficialRate;
    }

    public int getCur_ID() {
        return cur_ID;
    }

    public void setCur_ID(int cur_ID) {
        this.cur_ID = cur_ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCur_Abbreviation() {
        return cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        this.cur_Abbreviation = cur_Abbreviation;
    }

    public int getCur_Scale() {
        return cur_Scale;
    }

    public void setCur_Scale(int cur_Scale) {
        this.cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        this.cur_Name = cur_Name;
    }

    public double getCur_OfficialRate() {
        return cur_OfficialRate;
    }

    public void setCur_OfficialRate(double cur_OfficialRate) {
        this.cur_OfficialRate = cur_OfficialRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rate rate = (Rate) o;
        return cur_ID == rate.cur_ID &&
                cur_Scale == rate.cur_Scale &&
                Objects.equals(date, rate.date) &&
                Objects.equals(cur_Abbreviation, rate.cur_Abbreviation) &&
                Objects.equals(cur_Name, rate.cur_Name) &&
                Objects.equals(cur_OfficialRate, rate.cur_OfficialRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cur_ID, date, cur_Abbreviation, cur_Scale, cur_Name, cur_OfficialRate);
    }

    @Override
    public String toString() {
        return "Rate{" +
                "cur_ID='" + cur_ID + '\'' +
                ", date='" + date + '\'' +
                ", cur_Abbreviation='" + cur_Abbreviation + '\'' +
                ", cur_Scale='" + cur_Scale + '\'' +
                ", cur_Name='" + cur_Name + '\'' +
                ", cur_OfficialRate='" + cur_OfficialRate + '\'' +
                '}';
    }
}