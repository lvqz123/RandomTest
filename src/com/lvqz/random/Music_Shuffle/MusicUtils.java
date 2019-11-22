package com.lvqz.random.Music_Shuffle;

import java.util.Collections;
import java.util.List;

/**
 * @author: lvqz
 * @date: 2019/11/22
 * @time: 11:46
 */
public class MusicUtils {

    public static MusicOrder musicOrder = new MusicOrder();

    public static void  startMusic(String name){
        List<String> orders = musicOrder.getOrder();

        if(name !=null && name.length()>0){

            int index = orders.indexOf(name);
            orders.remove(index);
            //使用洗牌算法将当前歌曲顺序打乱
            Collections.shuffle(orders);
            //将当前播放的音乐放在第一位
            orders.add(0,name);
        }else{
            //洗牌算法打乱全部顺序
            Collections.shuffle(orders);
            name = orders.get(0);
        }

        //下标清零
        musicOrder.setCurrentPlayIndex(0);
        musicOrder.setNextIndex(0);
        musicOrder.setPreIndex(0);
        System.out.println("洗牌之后的歌曲顺序："+ orders);

        playMusic(name);
    }

    public static void nextMusic(){
        int currentPlayIndex = musicOrder.getCurrentPlayIndex()+1;
        //当当前下标和集合长度相同，说明已经放完歌单超出了集合的下标长度，将当前下标归零
        if(currentPlayIndex == musicOrder.getOrder().size()){
            currentPlayIndex -=musicOrder.getOrder().size();
        }
        //当前下标大于下一首下标时，更新下一首下标为当前下标
        if(currentPlayIndex > musicOrder.getNextIndex()){
            musicOrder.setNextIndex(currentPlayIndex);
        }

        //当当前下标等于上一首下标时（即=0），歌单放完，洗牌重新随机
        if(currentPlayIndex == musicOrder.getPreIndex()){
            startMusic("");
        }else{
            musicOrder.setCurrentPlayIndex(currentPlayIndex);
            playMusic(musicOrder.getOrder().get(currentPlayIndex));
        }
    }

    public static void preMusic(){
        int currentPlayIndex = musicOrder.getCurrentPlayIndex()-1;
        //当当前下标和集合长度相同，说明已经放完歌单超出了集合的下标长度，将当前下标归零
        if(currentPlayIndex < 0){
            currentPlayIndex +=musicOrder.getOrder().size();
        }
        //当前下标小于上一首下标时，更新上一首下标为当前下标
        if(currentPlayIndex < musicOrder.getPreIndex()){
            musicOrder.setPreIndex(currentPlayIndex);
        }

        //当当前下标等于下一首下标时（即已经播放过一轮），歌单放完，洗牌重新随机
        if(currentPlayIndex == musicOrder.getNextIndex()){
            startMusic("");
        }else{
            musicOrder.setCurrentPlayIndex(currentPlayIndex);
            playMusic(musicOrder.getOrder().get(currentPlayIndex));
        }
    }




    public static void playMusic(String name){
        System.out.println("播放："+ name);
    }



}
