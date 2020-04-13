package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {


        List<String> allData = Files.readAllLines(Paths.get("C:\\Users\\Bars\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\employeeData.txt"));
        
        for(String eachLine : allData){
            System.out.println("eachLine = " + eachLine);

        }


        Map<Integer,String> idNamePair = new HashMap<>();



        
        
        
    }
}
