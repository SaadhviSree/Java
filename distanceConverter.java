package distanceConverter;
import java.util.*;

public class distanceConverter {

	static double kmToMeter(double km) {return km*1000;}
	static double kmToMile(double km) {return km*0.621371;}
	
	static double meterToKm(double meter) {return meter*0.001;}
	static double meterToMile(double meter ) {return meter*0.000621;}
	
	static double mileToMeter(double mile) {return mile*1609.34;}
	static double mileToKm(double mile) {return mile*1.60934;}
	
	public static void funcCallsDistance(Scanner SC) {
		double distance;
		System.out.print("Enter the distance : ");
		distance = SC.nextInt();
		System.out.println("\n"+distance+" Kilometer = "+kmToMeter(distance)+" Meter");
		System.out.println(distance+" Kilometer = "+kmToMile(distance)+" Mile");
		
		System.out.println("\n"+distance+" Meter = "+meterToKm(distance)+" Kilometer");
		System.out.println(distance+" Meter = "+meterToMile(distance)+" Mile");
		
		System.out.println("\n"+distance+" Mile = "+mileToMeter(distance)+" Meter");
		System.out.println(distance+" Mile = "+mileToKm(distance)+" Kilometer");
	}
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//funcCallsDistance(scan);
	}

}
