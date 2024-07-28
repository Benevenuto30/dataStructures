package sortAlgorithms;

public class BubbleSortAscending {

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 13, 8, 2, 22, 10, 1, 5};
        int sizeOfArray = array.length;
        boolean swapped;

        for (int i = 0; i < sizeOfArray - 1; i++) {
            swapped = false;
            for (int j = 0; j < sizeOfArray - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int i = 0; i < sizeOfArray - 1; i++) {
            System.out.println(array[i]);
        }
    }
}