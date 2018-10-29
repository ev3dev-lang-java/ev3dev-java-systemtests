package ev3dev.actuators.ev3;

import ev3dev.actuators.LCD;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.robotics.Color;
import lejos.utility.Delay;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
public class LCDDrawIconsTest {

    public static GraphicsLCD lcd = LCD.getInstance();

    public static void main(final String[] args) {

        LOGGER.info("EV3 LCD Example");

        //clear();
        lcd.clear();
        //lcd.setColor(Color.BLACK);
        lcd.setColor(0, 0, 0);
        lcd.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 70));
        lcd.drawString("\u2665", 50, 50, 0);
        lcd.drawString("\u2661", 70, 70, 0);
        lcd.refresh();

        Delay.msDelay(5000);
    }

    public static void clear() {
        lcd.setColor(Color.WHITE);
        lcd.fillRect(0, 0, lcd.getWidth(), lcd.getHeight());
    }

}
