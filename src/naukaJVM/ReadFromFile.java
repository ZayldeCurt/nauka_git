package naukaJVM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
        List<String> strings= readAllLines("C:\\Users\\pllsym\\IdeaProjects\\Hellow_word\\src\\naukaJVM\\mojplik.txt");

        String result = concatenationAllStringWithStringBuilder(strings);
        System.out.println(result);
    }

    public static List<String> readAllLines(String path){
        List<String> lines = new ArrayList<>();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(path));
            String line= null;

            while((line = reader.readLine())!= null){
                lines.add(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          if(reader!=null){
              try{
                  reader.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
          }
        }
        return lines;
    }

    public static String concatenationAllString(List<String> list){
        String result = "";
        for (String elem : list) {
            result =result + elem + "\n";
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return result;
    }

    public static String concatenationAllStringWithStringBuilder(List<String> list){
        StringBuilder builder = new StringBuilder();

        for(String elem : list){
            builder.append(elem).append("\n");
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
