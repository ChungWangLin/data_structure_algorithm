package com.jones.structurealgoritm;

import com.jones.structurealgoritm.util.ArrayGenerator;
import com.jones.structurealgoritm.util.SortingHelp;

public class SelectSort {
    private SelectSort(){};

    // 双重循环时间复杂度 O(n^2)
    public static <E extends Comparable<E>> void sort(E[] arr) {
        E temp;
        for (int i=0; i< arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    temp=arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] dataSize = {10000,50000};
        for (int j : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(j, j);
            SortingHelp.sortTest(SelectSort.class.getName(), arr);
        }

    }
}
