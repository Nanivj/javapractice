package com.corejavapratice.itsshowtime;

import java.util.Scanner;

import com.corejavapratice.ticketservices.ShowTimeService;

public class myshowtime extends ShowTimeService {
	static final String[] moviesList = {"A. Spiderman 9:00AM","B. Iran man 10:00Am", "c. Money Heist 1:00PM","D. Power of positive thinking 5:00PM"}; 
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	
		double totalprice = 0d;
        System.out.println("WELCOME TO MYSHOWTIME");
        System.out.println("choose the one the movies present in the list: ");
        for(int i=0; i<=moviesList.length-1; i++) {
        	System.out.println(moviesList[i]);
        }
        System.out.println("please enter the alphabet of your respective movie choice here : ");
        Scanner scan =new Scanner(System.in);
        char choice = scan.next().charAt(0);
        System.out.println("please enter number of seats for booking :");
        int i = scan.nextInt();
        if(choice == 'A') {
        	name ="Spider man";
        	price = 100d;
        	System.out.println("price per ticket is :"+100);
             requiredseats = i;
        	totalprice = calcuatetotalbookingprice();
        }else if(choice == 'B') {
           name ="Iran man";
        	price = 150d;
        	requiredseats =i;
        	System.out.println("price per ticket is :"+150);
        	totalprice =calcuatetotalbookingprice();
        }else if(choice == 'C') {
        	System.out.println("price per ticket is :"+155);
        	name ="Money Heist";
        	price = 155d;
        	requiredseats = i;
            totalprice = calcuatetotalbookingprice();
       }else if(choice == 'D') {
        	name ="Power of positive thinking";
        	price = 100d;
            requiredseats = i;
             System.out.println("price per ticket is :"+100);
             totalprice = calcuatetotalbookingprice();
        }else {
        	System.out.println("dear coustmer your enter key is invalid");

        }
        System.out.println("the totalprice is: "+totalprice);
	}
	
	 
}


