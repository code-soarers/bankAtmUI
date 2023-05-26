package BankUI;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWrite {

    public void fileWrite(String data){
        Date date=new Date();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd(HH:mm)");
        String formattedDate=simpleDateFormat.format(date);

        String fileName=formattedDate +".txt";

        try{
            FileWriter fileWriter=new FileWriter(fileName);
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

