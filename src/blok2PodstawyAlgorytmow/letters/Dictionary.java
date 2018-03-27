package blok2PodstawyAlgorytmow.letters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private final List<String> words = new ArrayList<>();

    public Dictionary() throws FileNotFoundException {
//        Scanner scan = new Scanner(getClass().getClassLoader().getResourceAsStream("slowa.txt"));
//        Scanner scan = new Scanner("C:\\Users\\pllsym\\IdeaProjects\\Hellow_word\\src\\blok2PodstawyAlgorytmow\\resources\\slowa.txt");
        File text = new File("C:\\Users\\pllsym\\slowa.txt");

        //Creating Scanner instnace to read File in Java
        Scanner scan = new Scanner(text);

//        //Reading each line of file using Scanner class
//        int lineNumber = 1;
//        while(scnr.hasNextLine()){
//            String line = scnr.nextLine();
//            System.out.println("line " + lineNumber + " :" + line);
//            lineNumber++;
//        }

        while (scan.hasNextLine()) {
            words.add(scan.nextLine());
        }
    }

    public List<String> getWords() {
        return words;
    }
}
