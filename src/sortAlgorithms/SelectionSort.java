package sortAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[]{2, 7, 1, 9, 19, 14, 4};
        int arraySize = array.length;

        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < arraySize - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
