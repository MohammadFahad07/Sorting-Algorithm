package com.nsu.cse373.spring2020.ID1712145;

public class IterativeSelectionSort {
    public static <E extends Comparable<E>> void iterativeSelectionnSort(E[] inputArray) {
        System.out.println("Executing Iterative Selection Sort for the following input:");
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
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (inputArray[j].compareTo(inputArray[min_index]) == -1) {
                    min_index = j;
                }
            }

            Data temp = (Data) inputArray[min_index];
            inputArray[min_index] = inputArray[i];
            inputArray[i] = (E) temp;
            SortHelper.print(inputArray, inputArray.length);
        }
    }
}
