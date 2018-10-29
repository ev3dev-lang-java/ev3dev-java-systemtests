package ev3dev.actuators.ev3;

import ev3dev.actuators.LCD;
import ev3dev.utils.JarResource;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;
import lombok.extern.slf4j.Slf4j;

import java.awt.image.BufferedImage;
import java.io.IOException;

@Slf4j
public class LCDDrawImagesTest {

    public static GraphicsLCD lcd = LCD.getInstance();

    public static void main(final String[] args) throws IOException {

        LOGGER.info("EV3 LCD Example");

        clear();

        BufferedImage cross  = JarResource.loadImage("cross.gif");
        BufferedImage nought = JarResource.loadImage("nought.gif");

        //lcd.setColor(Color.BLACK);
        lcd.setColor(0,0,0);
        //LCD.drawImage(img, new AffineTransform(1f, 0f, 0f, 1f, 0, 0), null);
        //LCD.drawImage(image, 40,40, null);
        lcd.drawImage(cross,40,40,0);
        //LCD.drawImage(img, 0,0, Color.WHITE, null);
        lcd.drawImage(nought, 0,0,0);

        lcd.refresh();

        Delay.msDelay(5000);

    }


    public static void clear() {
        //lcd.setColor(Color.WHITE);
        lcd.setColor(255, 255, 255);
        lcd.fillRect(0, 0, lcd.getWidth(), lcd.getHeight());
    }

}
