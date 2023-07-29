import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ReadFile {
    private static int flagErr = 0;
    public static ArrayList<Integer> readInt(File file){
        ArrayList<Integer> arrInt = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)){
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNext()){
                flagErr ++;
                arrInt.add(sc.nextInt());
            }
            flagErr = 0;
        } catch (IOException | InputMismatchException e){
            System.err.println("Исходный фаил не верный " + e);
            System.err.println("Производится частичная сортировка");
            readErr(file);
        }
        return arrInt;
    }

    public static ArrayList<Integer> readErr(File file){
        ArrayList<Integer> arrInt = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)){
            Scanner sc = new Scanner(fileReader);
            int i = 0;
            while (sc.hasNext()){
                i++;
                if (i == flagErr) break;
                arrInt.add(sc.nextInt());
            }
        } catch (IOException e){
            System.err.println(e);
        }
        return arrInt;
    }

    public static ArrayList<String> readStr(File file){
        ArrayList<String> arrStr = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)){
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNext()){
                String tmp = sc.nextLine();
                if (tmp.contains(" ")) throw new RuntimeException("В файле присутсвует пробел");
                arrStr.add(tmp);
            }
        } catch (IOException | RuntimeException e){
            System.err.println(e);
        }
        return arrStr;
    }

}
