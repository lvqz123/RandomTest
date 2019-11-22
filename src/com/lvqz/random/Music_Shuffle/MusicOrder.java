package com.lvqz.random.Music_Shuffle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: lvqz
 * @date: 2019/11/22
 * @time: 11:37
 */
public class MusicOrder {

    //歌单
    List<String> order =  new ArrayList<>(Arrays.asList("NO1.孤芳自赏","NO2.大田后生仔","NO3.世间美好与你环环相扣","NO4.刺青","NO5.野狼DIsco"));

    //当前播放下标
    private int currentPlayIndex = 0;

    //下一首音乐下标
    private int nextIndex = 0;

    //上一首音乐下标
    private int preIndex = 0;

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public int getCurrentPlayIndex() {
        return currentPlayIndex;
    }

    public void setCurrentPlayIndex(int currentPlayIndex) {
        this.currentPlayIndex = currentPlayIndex;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }

    public int getPreIndex() {
        return preIndex;
    }

    public void setPreIndex(int preIndex) {
        this.preIndex = preIndex;
    }
}
