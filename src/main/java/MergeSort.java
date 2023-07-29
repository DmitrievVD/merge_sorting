import java.util.*;
public class MergeSort {
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();


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

}