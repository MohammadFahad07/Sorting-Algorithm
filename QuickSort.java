package com.nsu.cse373.spring2020.ID1712145;

public class QuickSort {
	  public static <E extends Comparable<E>> void quickSort(E[] inputArray){
	    System.out.println("Executing QuickSort for the following input:");
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	    quickSort(inputArray, 0, inputArray.length-1);
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	  }
	  
	  /*
	   * You are allowed to change the function signature to whatever you want
	   * but it must take generic type input to be able to sort any array
	   * containing data that can be compared. Look at BubbleSort class for
	   */  
	  public static<E extends Comparable<E>> void quickSort(E[] inputArray, int low, int high){
	      if (low < high)
	      {
	          SortHelper.print(inputArray,inputArray.length);
	          int part_index = (int) part(inputArray, low, high);
	          quickSort(inputArray, low, part_index-1);
	          quickSort(inputArray, part_index+1, high);
	      }
	  }

	    public static<E extends Comparable<E>>int part(E[]  inputArray,int low, int high)
	  {
	      Data pivot = (Data) inputArray[high];
	      int i = low-1;

	      for(int j=low;j<high;j++)
	      {
	          if(inputArray[j].compareTo((E) pivot)==-1)
	          {
	              i++;
	              Data temp = (Data) inputArray[i];
	              inputArray[i] = inputArray[j];
	              inputArray[j]  = (E) temp;
	          }
	      }

	      Data temp = (Data) inputArray[i+1];
	      inputArray[i+1] = inputArray[high];
	      inputArray[high] = (E) temp;
	      return i+1;
	  }
	}