package com.lvqz.random.Music_Shuffle;

import java.util.Scanner;

/**
 * @author: lvqz
 * @date: 2019/11/22
 * @time: 15:09
 */
public class MusicTest {

    public static void main(String[] args) {
        //开始播放
        MusicUtils.startMusic("");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            if ("1".equals(sc.next())){
                MusicUtils.preMusic();
            }else{
                MusicUtils.nextMusic();
            }
        }

    }

}
