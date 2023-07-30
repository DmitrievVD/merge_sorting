import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> in1 = ReadFile.readInt(new File("in1.txt"));
//        System.out.println(in1);
//
//        ArrayList<Integer> in2 = ReadFile.readInt(new File("in2.txt"));
//        System.out.println(in2);
//
//        ArrayList<Integer> in3 = ReadFile.readInt(new File("in3.txt"));
//        System.out.println(in3);
//
//        ArrayList<Integer> out = MergeSort.mergeSort(MergeSort.mergeSort(in1, in2), in3);
//        Collections.reverse(out);
//        System.out.println(out);

//        WriteFile.write(new File("out.txt"), out);


        ArrayList<String> st1 = ReadFile.readStr(new File("st1.txt"));
        System.out.println(st1);

        ArrayList<String> st2 = ReadFile.readStr(new File("st2.txt"));
        System.out.println(st2);

        ArrayList<String> out = MergeSortString.mergeSort(st1,st2);
        Collections.reverse(out);
        System.out.println(out);





    }
}
