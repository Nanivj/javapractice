package com.corejavapratice.ticketservices;

public class ShowTimeService {

	public static String name;
	public static int requiredseats;
	public static double price;   
	
	public ShowTimeService(){
		
	}
	public ShowTimeService(String n,int i,double p)
	{
		this.name =n;
		this.requiredseats =i;
		this.price = p;
	}
	 
public static double calcuatetotalbookingprice()
	{
		double totalprice =0d;
		System.out.println("calculate price for :"+name);
		totalprice = price*requiredseats;
		totalprice = calcuatetax(totalprice);
		return totalprice;

 }
    public static double calcuatetax(double totalprice) {
		double totalwithtax = 0d;
		double tax =( totalprice*10/100);
		System.out.println(" total tax amount is "+tax);
		totalwithtax = tax+totalprice;
		return totalwithtax;
		
	}
}
