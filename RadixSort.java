class RadixSort {

public static void main(String[] args) {
    //Initializing array
    int arr[] = {3, 5, 2, 1, 9, 0, 4,6,8,7};
    System.out.print("Initial Array : ");
    printArray(arr);
    radixsort(arr);
}
public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    System.out.println();
}
//Sorting in non decreasing order
public static void radixsort(int arr[]) {
    //Finding maximum number to count the number of digits
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++)
        max = Math.max(max, arr[i]);

    int p = 1;
    int pass = 1;

    while(max / p > 0) {
        arr = countingSort(arr, arr.length, p);
        System.out.print("After pass " + pass + "  : ");
        //Printing array after pass
        printArray(arr);
        pass++;
        p *= 10;
    }
}
public static int[] countingSort(int arr[], int N, int p) {
    int output[] = new int[N];
    int count[] = new int[10]; //keeping count if digits <=9

    for(int i = 0; i < N; i++)
        count[(arr[i] / p) % 10]++;

    //Applying counting sort so now the array contains actual position of the digits
    for(int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    //staring from N-1 helps to keep digits in order
    for(int i = N - 1; i >= 0; i--) {
        output[count[(arr[i] / p) % 10] - 1] = arr[i];
        count[(arr[i] / p) % 10]--;
    }

    return output;
}
}
