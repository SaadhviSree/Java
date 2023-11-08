package currencyConverter;
import java.util.*;

public class currencyConverter {
	
	static double inrToUsd(double inr) {return inr*0.012;}
	static double inrToEuro(double inr) {return inr*0.011;}
	static double inrToYen(double inr) {return inr*1.72;}
	
	static double usdToInr(double usd) {return usd*82.03;}
	static double usdToEuro(double usd) {return usd*0.90;}
	static double usdToYen(double usd) {return usd*141.41;}
	
	static double euroToInr(double euro) {return euro*91.26;}	
	static double euroToUsd(double euro) {return euro*1.11;}
	static double euroToYen(double euro) {return euro*157.31;}
	
	static double yenToInr(double yen) {return yen*0.58;}
	static double yenToUsd(double yen) {return yen*0.0071;}
	static double yenToEuro(double yen) {return yen*0.0064;}
	
	public static void funcCallsCurrency(Scanner SC) {
		double amount;
		System.out.print("Enter the amount : ");
		amount = SC.nextInt();
		System.out.println("\nINR "+amount+" = USD "+inrToUsd(amount));
		System.out.println("INR "+amount+" = EURO "+inrToEuro(amount));
		System.out.println("INR "+amount+" = YEN "+inrToYen(amount));
		
		System.out.println("\nUSD "+amount+" = INR "+usdToInr(amount));
		System.out.println("USD "+amount+" = EURO "+usdToEuro(amount));
		System.out.println("USD "+amount+" = YEN "+usdToYen(amount));
		
		System.out.println("\nEURO "+amount+" = INR "+euroToInr(amount));
		System.out.println("EURO "+amount+" = USD "+euroToUsd(amount));
		System.out.println("EURO "+amount+" = YEN "+euroToYen(amount));
		
		System.out.println("\nYEN "+amount+" = INR "+yenToInr(amount));
		System.out.println("YEN "+amount+" = USD "+yenToUsd(amount));
		System.out.println("YEN "+amount+" = EURO "+yenToEuro(amount));
	}
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//funcCallsCurrency(scan);
	}

}
