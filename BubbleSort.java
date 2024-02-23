//Luis Miranda
//Chpt2 PA
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {93, 52, 72, 42, 3, 63, 100, 19, 61, 44, 21, 98, 6, 41, 78, 5, 51, 60, 67, 11}; //initialize array
        bubbleSort(arr);
        System.out.print("\nSorted array is: ");
        printArray(arr);
    }
    //bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
