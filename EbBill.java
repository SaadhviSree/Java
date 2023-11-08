package main;
import java.util.*;
 
public class EbBill {
	int type;
	double connum;
	String name;
	double prev;
	double curr;
	double Total;
	
	static double DomesticBillCalc(double prev,double curr) {
		double units = curr-prev;
		double amount = 0;
		if (units<=100) amount = units*1;
		else if (units>100 && units<=200) amount = 100*1 + (units-100)*2.50;
		else if (units>200 && units<=500) amount = 100*1 + 100*2.50 + (units-200)*4;
		else if (units>500) amount = 100*1 + 100*2.50 + 300*4 + (units-500)*6;
		else System.out.println("Error!");
		return amount;
	}
	
	static double CommercialBillCalc(double prev,double curr) {
		double units = curr-prev;
		double amount = 0;
		if (units<=100) amount = units*1;
		else if (units>100 && units<=200) amount = 100*2 + (units-100)*4.50;
		else if (units>200 && units<=500) amount = 100*2 + 100*4.50 + (units-200)*6;
		else if (units>500) amount = 100*2 + 100*4.50 + 300*6 + (units-500)*7;
		else System.out.println("Error!");
		return amount;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EbBill BillObj = new EbBill();
		System.out.println("Choose type of connection : ");
		System.out.println("1) Domestic");
		System.out.println("2) Commercial");
		System.out.print("Enter choice : ");
		BillObj.type = sc.nextInt();
		System.out.print("Enter Consumer number : ");
		BillObj.connum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Consumer Name : ");
		BillObj.name = sc.nextLine();
		System.out.print("Enter previous month reading : ");
		BillObj.prev = sc.nextInt();
		System.out.print("Enter current month reading : ");
		BillObj.curr = sc.nextInt();
		sc.close();
		
		if (BillObj.type == 1) BillObj.Total = DomesticBillCalc(BillObj.prev,BillObj.curr);
		else if (BillObj.type == 2) BillObj.Total = CommercialBillCalc(BillObj.prev,BillObj.curr);
		System.out.println("------------------------------");
		System.out.println("            EB BILL           ");
		System.out.println("------------------------------");
		if (BillObj.type == 1) 	System.out.println("   Connection type : Domestic");
		else System.out.println("   Connection type : Commercial");
		System.out.println("   Consumer Number : " + BillObj.connum);
		System.out.println("     Consumer Name : " + BillObj.name);
		System.out.println("Prev Month Reading : " + BillObj.prev);
		System.out.println("Curr Month Reading : " + BillObj.curr);
		System.out.println("    Units Consumed : " + (BillObj.curr-BillObj.prev));
		System.out.println("       Bill to pay : " + BillObj.Total);
		System.out.println("------------------------------");
	}
}
