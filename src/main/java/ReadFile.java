import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Integer> readFile(File file){
        ArrayList<Integer> arrInt = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)){
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNext()){
                arrInt.add(sc.nextInt());
            }
        } catch (IOException e){
            System.err.println(e);
        }
        return arrInt;
    }
}
