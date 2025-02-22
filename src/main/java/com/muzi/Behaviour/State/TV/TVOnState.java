package com.muzi.Behaviour.State.TV;

/**
 * 只负责开启状态的行为
 * @author muzi
 * @createTime 2023-06-03
 */
public class TVOnState implements TVState{

    public void turnOn() {
        System.out.println("当前电视已经处于开启状态，无需开启");
    }
    public void turnOff() {
        System.out.println("正在关闭电视");
    }

    public void adjustVolume(int volume) {
        System.out.println("当前音量为："+volume);
    }

    public static void main(String[] args) {
      TV1 tv1 = new TV1();
        tv1.turnOn();
        tv1.adjustVolume(12);
        tv1.turnOff();
        tv1.adjustVolume(12);
    }
}
