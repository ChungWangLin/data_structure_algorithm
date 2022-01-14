package com.jones.structurealgoritm.util;

import com.jones.structurealgoritm.SelectSort;

import java.lang.reflect.Method;

public class SortingHelp {
    private SortingHelp(){}

    /**
     * 验证数组是否有序
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> boolean isSort(E[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) throws Exception{
        Class<?> aClass = Class.forName(sortName);
        Method sort = aClass.getMethod("sort", Comparable[].class);
        Long startTime = System.currentTimeMillis();
        sort.invoke(null, (Object) arr);
        Long endTime = System.currentTimeMillis();
        long time = endTime-startTime;

        if (!SortingHelp.isSort(arr)) {
            throw new RuntimeException(sortName+" failed!");
        }
        System.out.print(String.format("%s, 数据量:%d, 耗时:%.4fs\n",sortName.substring(sortName.lastIndexOf(".")+1), arr.length, time/1000.0));

    }
}
