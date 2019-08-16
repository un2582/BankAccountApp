package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//Read csv file and return as list
public class CSV {

    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((dataRow = reader.readLine()) != null){
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        }catch(FileNotFoundException e){

        }catch(IOException e){
            e.printStackTrace();
        }
        return data;
    }
}
