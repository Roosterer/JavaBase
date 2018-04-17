package com.gk.排序;

import org.junit.Test;

/**
 * Created by gaokuo on 2018/4/17
 * Email gaokuo_ok@163.com
 */
public class SelectionSort {

    /**
     * 选择排序：取arr[i]与后面的元素挨个比较，遇到比arr[i]小的元素则调换位置，一次遍历结束arr[i]是i~n中最小的元素
     * 重复此步骤
     */
    @Test
    public void sort(){
        int[] arr = DataForSort.arr;
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;   //默认i位置元素是最小的
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){ //如果j位置元素小于minIndex，则重新给minIndex赋值为j
                    minIndex = j;
                }
            }
            //循环结束，获取到的minIndex是从i到数组末尾最小元素的下标
            if(minIndex != i){  //如果i不是最小元素的小标，则替换i和minIndex的值
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        DataForSort.printArr(arr);
    }
}
