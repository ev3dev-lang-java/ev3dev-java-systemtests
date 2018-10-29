package ev3dev.sensors.ev3;

import ev3dev.sensors.Button;

public class ButtonExample {

    public static void main(final String[] args){

        System.out.println("Button example");

        Button.waitForAnyPress();

        System.out.println("Button pressed");
    }
}