package com.gk.排序;

import org.junit.Test;

/**
 * Created by gaokuo on 2018/4/19
 * Email gaokuo_ok@163.com
 */
public class InsertionSort {

    /**
     * 插入排序：顾名思义，插入排序就像是打扑克一样不停的拿牌并排序。
     * 假设前n-1个元素都是排好序的，拿第n个元素和第n-1比较，如果第n个元素大则直接插入数组最后，排序完成
     * 如果第n个元素小，则交换n和n-1元素位置。依次类推拿n-1和n-2位置元素比较，直到完成排序。
     */
    @Test
    public void sort(){
        int[] arr = DataForSort.arr;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j -1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
        DataForSort.printArr(arr);
    }


}
