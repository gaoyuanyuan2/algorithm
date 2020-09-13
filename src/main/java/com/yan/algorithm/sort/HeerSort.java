package com.yan.algorithm.sort;

import java.util.Arrays;

//希尔排序 增量变小 越精确 和冒泡排序有点相似 他有个步长
public class HeerSort {
    public static void sort(Integer[] array) {
        int step = array.length / 2;
        while (true) {
            for (int i = 0; i < step; i++) {
                for (int j = i; j + step < array.length; j += step) {
                    if (array[j] > array[j + step]) {
                        int tem = array[j];
                        array[j] = array[j + step];
                        array[j + step] = tem;
                    }
                }
            }
            if (step == 1) {
                break;
            }
            step--;
        }

        Arrays.asList(array).forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        sort(new Integer[]{21, 1, 5, 88, 94, 8, 1, 4, -5, 3, 5, 6, 9, 6, 2});
    }
}
