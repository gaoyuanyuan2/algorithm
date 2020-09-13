package com.yan.algorithm.sort;

import java.util.Arrays;

//冒泡排序 没一轮把最大往后移
public class BubbleSort {
    public static void selectSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;
                }
            }
        }
        Arrays.asList(array).forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        selectSort(new Integer[]{21, 1, 5, 88, 94, 8, 1, 4, -5, 3, 5, 6, 9, 6, 2});
    }
}
