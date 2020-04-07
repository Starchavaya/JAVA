package test.work;

import test.gson.JsonWorker;
import test.interfaces.WorkWithFile;
import test.models.RateShort;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWorker implements WorkWithFile {
    public void writeToFile(List<RateShort>rateShortList) {
        try(FileWriter writer = new FileWriter("rateShorts.json", false))
        {
            writer.write(new JsonWorker().getRateChort(rateShortList));
            writer.flush();
            System.out.println("Данные записаны успешно");
        }
        catch(IOException ex){
            System.out.println("Ошибка. Данные не записаны");
        }
    }
}
