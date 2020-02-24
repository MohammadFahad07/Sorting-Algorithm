package com.nsu.cse373.spring2020.ID1712145;

public class RecursiveInsertionSort {
    public static <E extends Comparable<E>> void recursiveInsertionSort(E[] inputArray) {
        System.out.println("Executing Recursive Insertion Sort for the following input:");
        SortHelper.print(inputArray, inputArray.length);
        System.out.println("------------------------");

        sortInternal(inputArray, inputArray.length);

        System.out.println("------------------------");
    }

    /*
     * You are allowed to change the function signature to whatever you want
     * but it must take generic type input to be able to sort any array
     * containing data that can be compared. Look at BubbleSort class for
     */
    private static <E extends Comparable<E>> void sortInternal(E[] inputArray
            , int size) {

        if (size <= 1) return;

        sortInternal(inputArray, size - 1);
        SortHelper.print(inputArray, inputArray.length);
        Data end = (Data) inputArray[size - 1];
        int i = size - 2;
        while (i >= 0 && inputArray[i].compareTo((E) end) == 1) {
            inputArray[i + 1] = inputArray[i];
            i--;
        }
        inputArray[i + 1] = (E) end;

    }
}

