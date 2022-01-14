package com.jones.structurealgoritm;

import com.jones.structurealgoritm.util.ArrayGenerator;
import com.jones.structurealgoritm.util.SortingHelp;

public class InsertSort {
    private InsertSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        E temp;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
               if (arr[j].compareTo(arr[i])<0) {
                 temp = arr[j];
                 while (j>i) {
                     arr[j]=arr[j-1];
                     j--;
                 }
                 arr[i]=temp;
               }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] dataSize = {10000,100000};
        for (int j : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(j, 3000000);
            SortingHelp.sortTest(InsertSort.class.getName(), arr);
        }

    }
}
