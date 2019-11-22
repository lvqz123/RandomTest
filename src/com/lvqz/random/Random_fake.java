package com.lvqz.random;

import java.util.Calendar;
import java.util.Random;

/**
 * @author: lvqz
 * @date: 2019/11/22
 * @time: 9:56
 *
 * 本次试验一下伪随机算法
 *
 */
public class Random_fake {

    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance(); //获取当前系统时间
        int i;
        Random rd = new Random(ca.get(Calendar.MINUTE)*ca.get(Calendar.SECOND));//将当前时间的分*秒作为种子
        i = rd.nextInt(500);
        System.out.println("获取到的随机数 = " + i);

    }

}
