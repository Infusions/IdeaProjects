import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class readfile {

    private Scanner x;

    public void openFile(String s){
        try{
            x = new Scanner(new File("src/" + s + ".txt"));
        }
        catch(Exception e){
            System.out.println("Error: could not find file");
        }

    }

    public ArrayList<String> readFile(){

        ArrayList<String> wordList = new ArrayList<String>();

        while(x.hasNext()){
            String a = x.next();
            a = a.replace(".","");
            a = a.replace(",","");
            a = a.replace("!","");
            a = a.replace("?","");
            a = a.replace("\"","");
            wordList.add(a);
        }
        return wordList;
    }

    public void closeFile(){
        x.close();
    }

}
