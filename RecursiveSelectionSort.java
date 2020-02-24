package com.nsu.cse373.spring2020.ID1712145;

public class RecursiveSelectionSort {
    public static <E extends Comparable<E>> void recursiveSelectionSort(E[] inputArray) {
        System.out.println("Executing Recursive Selection Sort for the following input:");
        SortHelper.print(inputArray, inputArray.length);
        System.out.println("------------------------");

        sortInternal(inputArray, inputArray.length, 0);

        System.out.println("------------------------");
    }

    /*
     * You are allowed to change the function signature to whatever you want
     * but it must take generic type input to be able to sort any array
     * containing data that can be compared. Look at BubbleSort class for
     */


    private static <E extends Comparable<E>> void sortInternal(E[] inputArray
            , int size, int index) {
        if (index == size) return;
        int k = minIndex((Data[]) inputArray, index, size - 1);
        if (k != index) {
            Data temp = (Data) inputArray[k];
            inputArray[k] = inputArray[index];
            inputArray[index] = (E) temp;
        }
        SortHelper.print(inputArray, inputArray.length);
        sortInternal(inputArray, size, index + 1);

    }

    //for comparing index
    static int minIndex(Data a[], int i, int j) {
        if (i == j) return i;
        int k = minIndex(a, i + 1, j);
        return (a[i].compareTo(a[k]) == -1) ? i : k;
    }

}