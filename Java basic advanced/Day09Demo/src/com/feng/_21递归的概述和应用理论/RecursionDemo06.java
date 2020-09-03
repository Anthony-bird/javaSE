package com.feng._21递归的概述和应用理论;

/**
 目标：n的阶乘。

 n!= 1*2*3*4*5*6*...*(n-1)*n。
 f(n) = 1*2*3*4*5*6*...*(n-1)*n
 f(n) = f(n-1)*n

 流程：
 f(5) = f(4) * 5 ;  = 1*2*3*4*5
 f(4) = f(3) * 4 ;  = 1*2*3*4
 f(3) = f(2) * 3 ;  = 1*2*3
 f(2) = f(1) * 2 ;  = 1*2
 f(1) = 1

 递归的核心三要素：
 （1）递归的终点接： f(1) = 1
 （2）递归的公式   f(n) = f(n-1)*n
 （3）递归的方向必须走向终结点
 ---------------------------------------------------------
 以上理论只能针对于规律化递归，如果是非规律化是不能套用以上公式的！
 非规律化递归的问题：文件搜索，啤酒问题。
 非规律化就看你的水平了！自己看着办！！

 非规律化递归：啤酒问题：（作业）
 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
 ，问10元可以喝多少瓶，剩余多少盖子和瓶子！！  15 3 1
 */
public class RecursionDemo06 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if(n == 1){
            return 1 ;
        }else{
            return f(n-1)*n;
        }
    }
}
