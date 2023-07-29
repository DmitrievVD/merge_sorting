import java.util.*;
public class MergeSortInt {
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();

        if (!(isSorted(list1))) {
            System.err.println("Содержимое исходных файлов не позволяет произвести сортировку слиянием, производится частичная сортировка");
            System.err.println("Нарушен порядок сортировки),");
            list1 = partialSorted(list1);
        }
        if (!(isSorted(list2))) {
            System.err.println("Содержимое исходных файлов не позволяет произвести сортировку слиянием, производится частичная сортировка");
            System.err.println("Нарушен порядок сортировки),");
            list2 = partialSorted(list2);
        }


        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            if (list1.get(i) < list2.get(j)){
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()){
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()){
            result.add(list2.get(j));
            j++;
        }

        return result;
    }


    private static boolean isSorted(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1))
                return false;
        }
        return true;
    }

    private static ArrayList<Integer> partialSorted(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();

        int flag = 0;

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1)) flag = i+1;
        }
        for (int i = flag; i < array.size(); i++) {
            result.add(array.get(i));
        }

        return result;
    }

    
}