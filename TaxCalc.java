package comcast.test;

import java.util.Arrays;

import java.util.Scanner;

public class TaxCalc  {

	
	
	String[] basicArray = { "Food","Clothes", "shoes", "Pantry", "Cleaning"};
	int totalpriceInCents; 
	
	//String choice = "y";
	
	public  int totalPriceCalculation(String itemName, double price) {
		double taxAdd = 0;
		double totalprice = 0;
		//double priceInCents = convertToCents(price);
		boolean found = false;
		for (String elem : basicArray){
			if (itemName.equals(elem))
				found = true;
			    break;
		}
		
		if (found || price <= 100)
		{
			
			taxAdd = price *  0.01;
			totalprice = price + taxAdd ;
			totalpriceInCents = (int)convertToCents(totalprice);
			
		}
		
		
		else 
			
		{
			taxAdd = price *  0.09;
			totalprice = price + taxAdd ;
			totalpriceInCents = (int)convertToCents(totalprice);
			
		
		}
		return totalpriceInCents;
	}
	
	public double convertToCents(double value)
	
	{
	   double TotalValue = (value * 100 );
		System.out.println("Total value"+ TotalValue );
		
		return TotalValue;
		
	}	
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TaxCalc tc = new TaxCalc();
	    System.out.println("Welcome to calculate total price of an item with Tax Added---This Program considers all the item under $100 as necessary");
	    
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the item name:  ");
		String item = sc.next();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the price:  ");
		double price = sc1.nextDouble();
		
		System.out.println("Total Price of an Item in cents: "+ tc.totalPriceCalculation(item,price));
        	
	
	}

}
