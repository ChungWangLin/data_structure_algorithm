package com.jones.structurealgoritm.util;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator(){}

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return  arr;
    }

    /**
     * 生成一个长度为n, 大小0-bound的数组
     * @param n 长度
     * @param bound 最大值
     * @return 数组
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for (int i=0; i<n; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return  arr;
    }
}
