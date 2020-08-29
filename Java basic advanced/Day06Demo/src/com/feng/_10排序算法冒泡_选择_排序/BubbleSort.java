package com.feng._10排序算法冒泡_选择_排序;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 目标：冒泡排序的讲解。

 冒泡排序的作用：
 可以用于对数组或者对集合的元素进行大小排序！！

 冒泡排序的核心算法思想:
 int[] arr = new int[] {55, 22, 99, 88};
 思想：每次从数组的第一个位置开始两两比较。把较大的元素与较小的元素进行层层交换。
 最终把当前最大的一个元素存入到数组当前的末尾。这就是冒泡思想。


 冒泡排序的核心点：每次两两比较找出当前最大值冒出到当前最后面即可！！

 冒泡排序的实现核心：
 1.确定总共需要冒几轮： 数组的长度-1.
 2.每轮两两比较几次。
 i(轮数)      次数         每轮次数的规律：数组长度-i-1 次
 0             3
 1             2
 2             1
 小结：
 冒泡排序的核心点：每次两两比较找出当前最大值冒出到当前最后面即可！！
 确定总共需要冒几轮： 数组的长度-1.
 每轮两两比较几次。数组长度-i-1 次
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {55, 22, 99, 88};
        // 1.定义一个循环控制总共需要冒泡几轮：数组的长度-1
        for(int i = 0 ;  i < arr.length - 1 ; i++ ){
            // i = 0   j = 0 1 2
            // i = 1   j = 0 1
            // i = 2   j = 0
            // 2.控制每轮比较几次。
            for(int j = 0 ; j < arr.length - i - 1 ; j++ ){
                // 如果当前元素大于后一个元素
                if(arr[j] > arr[j+1]){
                    // 交换位置。大的元素必须后移！
                    // 定义一个临时变量存储后一个元素
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("数组："+ Arrays.toString(arr));
    }
}

