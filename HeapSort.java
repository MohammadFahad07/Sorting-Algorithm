package com.nsu.cse373.spring2020.ID1712145;

public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] inputArray) {
        System.out.println("Executing HeapSort for the following input:");
        SortHelper.print(inputArray, inputArray.length);
        System.out.println("------------------------");

        heapSortInternal(inputArray);

        SortHelper.print(inputArray, inputArray.length);
        System.out.println("------------------------");
    }

    /*
     * You are allowed to change the function signature to whatever you want
     * but it must take generic type input to be able to sort any array
     * containing data that can be compared. Look at BubbleSort class for
     */
    private static <E extends Comparable<E>> void heapSortInternal(E[] inputArray) {

        int n = inputArray.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            Heapify(inputArray, n, i);

        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            Data temp = (Data) inputArray[0];
            inputArray[0] = inputArray[i];
            inputArray[i] = (E) temp;
            Heapify(inputArray, i, 0);
            SortHelper.print(inputArray, inputArray.length);
        }
    }

    private static <E extends Comparable<E>> void Heapify(E[] inputArray, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && inputArray[l].compareTo(inputArray[largest]) == 1) largest = l;

        if (r < n && inputArray[r].compareTo(inputArray[largest]) == 1) largest = r;

        if (largest != i) {
            Data swap = (Data) inputArray[i];
            inputArray[i] = inputArray[largest];
            inputArray[largest] = (E) swap;
            Heapify(inputArray, n, largest);
        }
    }


}