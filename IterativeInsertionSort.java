package com.nsu.cse373.spring2020.ID1712145;

public class IterativeInsertionSort {
	  public static <E extends Comparable<E>> void iterativeInsertionSort(E[] inputArray){
	    System.out.println("Executing Iterative Insertion Sort for the following input:");
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");

	      //Call your internal sorting method here
	      sortInternal(inputArray, inputArray.length);

	    System.out.println("------------------------");
	  }
	  
	  /*
	   * You are allowed to change the function signature to whatever you want
	   * but it must take generic type input to be able to sort any array
	   * containing data that can be compared. Look at BubbleSort class for
	   */
	  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){
	    //
	    for(int i=1;i<size;++i)
	    {
	          Data key = (Data) inputArray[i];
	          int j = i-1;

	          while(j>=0 && inputArray[j].compareTo((E) key)==1)
	          {
	              inputArray[j + 1] = inputArray[j];
	              j = j - 1;
	          }
	          inputArray[j+1] = (E)key;
	          SortHelper.print(inputArray,inputArray.length);
	    }

	  }
	}
