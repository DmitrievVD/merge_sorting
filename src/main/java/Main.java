import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> in1 = ReadFile.readFile(new File("in1.txt"));
        System.out.println(in1);

        ArrayList<Integer> in2 = ReadFile.readFile(new File("in2.txt"));
        System.out.println(in2);

        ArrayList<Integer> in3 = ReadFile.readFile(new File("in3.txt"));
        System.out.println(in3);

        System.out.println(MergeSort.mergeSort(MergeSort.mergeSort(in1, in2), in3));
    }
}
