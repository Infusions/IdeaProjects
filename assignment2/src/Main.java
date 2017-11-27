import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> inputWords;
        ArrayList<String> dictionaryWords;
        ArrayList<String> unknownWords = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        String filename;
        readfile input = new readfile();
        readfile dictionary = new readfile();

        System.out.print("Enter input filename to check: ");
        filename = scan.next();
        input.openFile(filename);
        inputWords = input.readFile();

        System.out.print("Enter dictionary filename to use: ");
        filename = scan.next();
        dictionary.openFile(filename);
        dictionaryWords = dictionary.readFile();

        for(String x : inputWords){
            boolean containsWord = false;
            for(String y : dictionaryWords){
                if(x.equalsIgnoreCase(y)) {
                    containsWord = true;
                    break;
                }
            }
            if(!containsWord){
                unknownWords.add(x);
            }
        }

        if(unknownWords.isEmpty()){
            System.out.print("No unknown words");
        } else {
            System.out.print("Unknown words: ");
            System.out.print(unknownWords);
        }
        input.closeFile();
        dictionary.closeFile();
    }

}
