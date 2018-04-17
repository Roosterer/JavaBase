package com.gk.排序;

/**
 * Created by gaokuo on 2018/4/16
 * Email gaokuo_ok@163.com
 */
public class DataForSort {

    /**
     * 待排序的数据，1~12
     */
    public final static int[] arr = {2,6,12,1,3,9,5,7,4,11,8,10};


    /**
     * 打印int数组内容
     * @param arr
     */
    public static void printArr(int[] arr){
        if(arr == null){
            System.out.println("数组为空");
        }else{
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }

}
