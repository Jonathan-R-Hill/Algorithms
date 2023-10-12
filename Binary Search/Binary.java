public class Binary {

    public static int search(int[] array, int number) {

        int low = 0;
        int high = array.length - 1;
        String guessToX = "";

        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = array[mid];

            if (guess == number) {
                return mid;
            } else if (guess > number) {
                high = mid - 1;
                guessToX = "Too high";
            } else {
                low = mid + 1;
                guessToX = "Too low";
            }
            System.out.println("Current guess is " + guess + " and is " + guessToX);
        }
        return -1; // Return -1 if the number is not found in the array
    }

    public static void main(String[] args) {
        int[] myList = new int[10100];
        for (int i = 0; i <= 10100; i++) {
            myList[i] = i;
        }

        int result = search(myList, 44);
        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
