package ev3dev.sensors;

import ev3dev.hardware.EV3DevPlatforms;
import lejos.utility.Delay;

public class BatteryDemo extends EV3DevPlatforms {

	public static void main(String[] args) {

		BatteryDemo example = new BatteryDemo();

        final Battery battery = Battery.getInstance();

		for(int x = 0; x < 20; x++){
			System.out.println("Battery Voltage: " + battery.getVoltage());

			Delay.msDelay(1000);
		}
	}

}
