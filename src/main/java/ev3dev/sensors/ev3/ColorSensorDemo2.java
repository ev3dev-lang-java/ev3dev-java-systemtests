package ev3dev.sensors.ev3;

import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;

public class ColorSensorDemo2 {

	//Robot Configuration
	private static EV3ColorSensor color1 = new EV3ColorSensor(SensorPort.S1);
	
	//Configuration
	private static int HALF_SECOND = 500;
    private static SampleProvider sp;

    public static void main(String[] args) {

		for(int i = 0; i <= 10; i++) {
            sp = color1.getRedMode();
            int sampleSize = sp.sampleSize();
            float[] sample = new float[sampleSize];
            sp.fetchSample(sample, 0);

            sp = color1.getColorIDMode();
            sampleSize = sp.sampleSize();
            sample = new float[sampleSize];
            sp.fetchSample(sample, 0);

            sp = color1.getAmbientMode();
            sampleSize = sp.sampleSize();
            sample = new float[sampleSize];
            sp.fetchSample(sample, 0);

            sp = color1.getRGBMode();
            sampleSize = sp.sampleSize();
            sample = new float[sampleSize];
            sp.fetchSample(sample, 0);
		}

        //Reset mode
        sp = color1.getRedMode();
        int sampleSize = sp.sampleSize();
        float[] sample = new float[sampleSize];
        sp.fetchSample(sample, 0);

	}

}
