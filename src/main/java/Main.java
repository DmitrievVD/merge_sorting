import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Main {
    static byte firstArgs = 2; // 2ка это первые аргуметы пример: -s out.txt, дальше идут файлы
    static byte flag = 0; // счетчик необязательного флага

    public static void main(String[] args) throws IOException {

        if (Arrays.asList(args).contains("-a") || Arrays.asList(args).contains("-d")){
            flag++;
            firstArgs++;
        }

        if (Objects.equals(args[0], "-s")) {
            int countFile = args.length - firstArgs;
            ArrayList<File> files = new ArrayList<>();
            for (int i = firstArgs; i < args.length; i++) {
                files.add(new File(args[i + flag]));
            }
            ArrayList<ArrayList<String>> arreys = new ArrayList<>();
            for (int i = 0; i < files.size(); i++) {
                arreys.add(ReadFile.readStr(files.get(i)));
            }
            ArrayList<String> result = new ArrayList<>(arreys.get(0));
            for (int i = 0; i < arreys.size() - 1; i++) {
                result = MergeSortString.mergeSort(result, arreys.get(i + 1));
            }
            if (flag == 1){
                if (Objects.equals(args[0 + flag], "-a")) WriteFile.write(new File(args[1 + flag]), result);
                else if (Objects.equals(args[0 + flag], "-d")) {
                    Collections.reverse(result);
                    WriteFile.write(new File(args[1 + flag]), result);
                }
            } else WriteFile.write(new File(args[1 + flag]), result);
        }
        if (Objects.equals(args[0], "-i")) {
            int countFile = args.length - firstArgs;
            ArrayList<File> files = new ArrayList<>();
            for (int i = firstArgs; i < args.length; i++) {
                files.add(new File(args[i]));
            }
            ArrayList<ArrayList<Integer>> arreys = new ArrayList<>();
            for (int i = 0; i < files.size(); i++) {
                arreys.add(ReadFile.readInt(files.get(i)));
            }
            ArrayList<Integer> result = new ArrayList<>(arreys.get(0));
            for (int i = 1; i < arreys.size() - 1; i++) {
                result = MergeSortInt.mergeSort(result, arreys.get(i + 1));
            }
            if (flag == 1){
                if (Objects.equals(args[0 + flag], "-a")) WriteFile.write(new File(args[1 + flag]), result);
                else if (Objects.equals(args[0 + flag], "-d")) {
                    Collections.reverse(result);
                    WriteFile.write(new File(args[1 + flag]), result);
                }
            } else WriteFile.write(new File(args[1 + flag]), result);

        }







    }
}
