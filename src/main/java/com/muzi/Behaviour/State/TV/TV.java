package com.muzi.Behaviour.State.TV;
/** 遥控器，电视开关及音量调节的能力
 *
 */

public class TV {
    private boolean isOn;
    private int volume;

    public TV() {
        isOn=false;
        volume=0;
    }
    public void turnOn() {
        // 如果是开启状态
        if (isOn) {
            System.out.println("TV is already on.");
            // 否则打开电视
        } else {
            isOn = true;
            System.out.println("Turning on the TV.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Turning off the TV.");
        } else {
            System.out.println("TV is already off.");
        }
    }

    public void adjustVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println("Adjusting volume to: " + volume);
        } else {
            System.out.println("Cannot adjust volume, TV is off.");
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();

        tv.turnOn();
        tv.adjustVolume(10);
        tv.turnOff();
    }
}
