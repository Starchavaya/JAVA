package test;


import test.models.RateShort;
import test.work.RateShortWorker;
import test.work.FileWorker;
import test.work.RateWorker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date myDate=null;
        while (myDate==null) {
            System.out.println("Введите дату в формате yyyy-MM-dd");
            Scanner sc = new Scanner(System.in);
            String sDate = sc.nextLine();
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            myFormat.setLenient(false);
            try {
                myDate = myFormat.parse(sDate);
                System.out.println("Формат даты верный, запрос отправлен");
                sc.close();
                String date=myFormat.format(myDate);
                RateWorker rateWork=new RateWorker(date);
                rateWork.start();
                rateWork.join();
                List<RateShort> rateShortList = new RateShortWorker().getListRateShort(rateWork.getRateList());
                new FileWorker().writeToFile(rateShortList);
            } catch (Exception e) {
                System.out.println("Дата введена некорректно!");
            }
        }
    }
}