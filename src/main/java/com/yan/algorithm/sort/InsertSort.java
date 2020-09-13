package com.yan.algorithm.sort;

import java.util.Arrays;

public class InsertSort {
    //每次和前面排序好了的比较，大于就后移，然后插入。
    public static void insertSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int tem = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {//从标为1的位置开始比较，第一个跳过
                if (tem < array[j]) {
                    array[j + 1] = array[j];//全部排序好的数组后移动
                } else {
                    break;
                }
            }
            array[j + 1] = tem;//当前比较数据前移
        }
        Arrays.asList(array).forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        insertSort(new Integer[]{21, 1, 5, 88, 94, 8, 1, 4, 5, 3, 5, 6, 9, 6, 2});
    }
}
