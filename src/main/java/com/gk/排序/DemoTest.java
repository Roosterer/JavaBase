package com.gk.排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class DemoTest {


    @Test
    public void test() {

        int[] arr = DataForSort.arr;
        Arrays.sort(arr);
        DataForSort.printArr(arr);

    }


}
