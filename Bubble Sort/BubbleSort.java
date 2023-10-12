
public class BubbleSort {

  public static void bubbleSort(int[] array) {
    int arrLength = array.length;

    for (int i = 0; i < arrLength - 1; i++) {
      for (int j = 0; j < arrLength - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
    

  public static void main(String[] args) {
    
    int[] array = {
      5, 1, 11, 0, 2, 15, 4, 3, 9, 
    };
    
    bubbleSort(array);
    
    for (int num : array) {
            System.out.print(num + " ");
        }
  }

}
