import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {
    public static int findSmallestIndex(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int smallestIndex = findSmallestIndex(arr);
            newArr.add(arr.remove(smallestIndex));
        }
        return newArr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(1000) + 1;
            myList.add(num);
        }

        System.out.println("Original list: " + myList);
        List<Integer> sortedList = selectionSort(new ArrayList<>(myList));
        System.out.println("Sorted list: " + sortedList);
    }
}
