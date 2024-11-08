package com.muzi.Behaviour.State.TV;

/**
 * 只负责关闭状态的行为
 * @author it楠老师
 * @createTime 2023-06-03
 */
public class TVOffState implements com.muzi.Behaviour.State.TV.TVState {

    public void turnOn() {
        System.out.println("正在开启电视");
    }


    public void turnOff() {
        System.out.println("电视已经是关闭状态。");
    }


    public void adjustVolume(int volume) {
        System.out.println("关闭状态，不能调节音量");
    }
}
