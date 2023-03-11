import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoInHomeInput {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
				
		// Elevator call
		Elevator myElevator = new Elevator(id);
		
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		
		hallLamp.on();
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
}
