package main;
import currencyConverter.*;
import distanceConverter.*;
import timeConverter.*;
import java.util.*;

public class converter {
	public static void main(String[] args) {
		System.out.println("Choose the converter : ");
		System.out.println("1) Currency Converter");
		System.out.println("2) Distance Converter");
		System.out.println("3) Time Converter");
		System.out.print("Enter your choice : ");
		Scanner SC = new Scanner(System.in);
		int choice;
		choice = SC.nextInt();
		if (choice==1)currencyConverter.funcCallsCurrency(SC);
		else if (choice==2)distanceConverter.funcCallsDistance(SC);
		else if (choice==3)timeConverter.funcCallsTime(SC);
		SC.close();
	}

}
