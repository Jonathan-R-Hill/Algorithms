import java.util.ArrayList;
import java.util.List;

public class Qsort {

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        } else {
            int pivot = arr.get(0);

            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();

            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) <= pivot) {
                    less.add(arr.get(i));
                } else {
                    greater.add(arr.get(i));
                }
            }

            List<Integer> sortedLess = quickSort(less);
            List<Integer> sortedGreater = quickSort(greater);

            List<Integer> sortedArray = new ArrayList<>();
            sortedArray.addAll(sortedLess);
            sortedArray.add(pivot);
            sortedArray.addAll(sortedGreater);

            return sortedArray;
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        List<Integer> sortedList = quickSort(myList);

        System.out.println(sortedList);
    }


}


