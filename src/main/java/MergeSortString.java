import java.util.ArrayList;

public class MergeSortString {
    public static ArrayList<String> mergeSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<String> result = new ArrayList<>();

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
}
