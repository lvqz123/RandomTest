package com.lvqz.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: lvqz
 * @date: 2019/11/22
 * @time: 10:25
 *
 * 测试一下Java自带的随机算法
 *
 */
public class Shuffle_fake {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
        System.out.println("strings = " + strings);
        Collections.shuffle(strings);
        System.out.println("strings = " + strings);
    }

}
