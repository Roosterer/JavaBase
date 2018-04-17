package com.gk.排序;
import org.junit.Test;

/**
 * Created by gaokuo on 2018/4/16
 * Email gaokuo_ok@163.com
 */
public class BubbleSort {


    /**
     * 冒泡排序：每次比较相邻两个数的大小，符合条件互换位置
     */
    @Test
    public void sort1(){
        int[] arr = DataForSort.arr;
        int temp;   //临时变量
        for (int i = 0; i < arr.length-1; i++) {    //外层循环length-1次
            for (int j = arr.length-1; j > i ; j--) {   //内层循环从后向前两两比较，每轮都能将最小的数换到位置i
                if(arr[j] < arr[j-1]){  //相邻的后一个数比前一个小，互换位置
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        DataForSort.printArr(arr);
    }

    /**
     * 冒泡排序优化版：内层循环循环完一轮后，没有互换的情况发生，说明两两比较中后一个总是大于前一个，顺序已经排好。
     * 出现这种情况则跳出循环。代码设置flag标志，判断这种情况。
     */
    @Test
    public void sort2(){
        int[] arr = DataForSort.arr;
        int temp;
        boolean flag;   //标志位
        for (int i = 0; i < arr.length-1; i++) {
            flag = true;
            for (int j = arr.length-1; j > i ; j--) {
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = false;   //发生排序
                }
            }
            if(flag){   //未发生排序，跳出循环
                break;
            }
        }
        DataForSort.printArr(arr);
    }


}
