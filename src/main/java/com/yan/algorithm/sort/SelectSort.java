package com.yan.algorithm.sort;

import java.util.Arrays;

public class SelectSort {
    //把最小的和第一位替换。每次比较少一次。
    public static void selectSort(Integer[] array) {
        int tem;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = 0; j < array.length; j++) {
                if(array[j]>min){
                    min = array[j];
                    tem = array[i];
                    array[i] = min;
                    array[j] = tem;
                }
            }
        }
        Arrays.asList(array).forEach(e-> System.out.println(e));
    }
    public static void main(String[] args) {
        selectSort(new Integer[]{21,1,5,88,94,8,1,4,5,3,5,6,9,6,2});
    }
}
