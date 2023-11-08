package timeConverter;
import java.util.*;

public class timeConverter {
	
	static double minToHour(double min) {return min/60;}
	static double minToSec(double min) {return min*60;}
	
	static double hourToMin(double hour) {return hour*60;}
	static double hourToSec(double hour) {return hour*3600;}
	
	static double secToMin(double sec) {return sec/60;}
	static double secToHour(double sec) {return sec/3600;}
	
	public static void funcCallsTime(Scanner SC) {
		double time;
		System.out.print("Enter the time : ");
		time = SC.nextInt();
		System.out.println("\n"+time+" minutes = "+minToHour(time)+" hours");
		System.out.println(time+" minutes = "+minToSec(time)+" seconds");
		
		System.out.println("\n"+time+" hours = "+hourToMin(time)+" minutes");
		System.out.println(time+" hours = "+hourToSec(time)+" seconds");
		
		System.out.println("\n"+time+" seconds = "+secToMin(time)+" minutes");
		System.out.println(time+" seconds = "+secToHour(time)+" hours");
	}
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//funcCallsTime(scan);
	}

}
