package com.javanaresh.ira;
import java.util.*;
public class solutions4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     newspaper[] news=new newspaper[4];
     Scanner scan =new Scanner(System.in);
     for(int i=0;i<4;i++) {
    	 int a= scan.nextInt();
    	 String b=scan.nextLine();scan.nextLine();
    	 int c=scan.nextInt();
    	 int d=scan.nextInt();
    	 news[i]=new newspaper(a,b,c,d);
     }
     int year =scan.nextInt();scan.nextLine();
     String Nam =scan.nextLine();
     int Price= findtotalpricebypublicationyear(news,year);
     if(Price>0) {
    	 System.out.println("happy"+Price);
     }
     else {
    	 System.out.println("soory this not found");
     }
     newspaper range = searchNewspaperbyname(news,Nam);
     if(range==null) {
     System.out.println("not found");
	}else {
		System.out.println("reno "+range.regno);
		System.out.println("name "+range.name);
		System.out.println("year "+range.publication);
		System.out.println("price "+range.price);
	}
	}
   public static int findtotalpricebypublicationyear(newspaper[] news,int year) {
	   int sum=0,count=0;
	   for(int i=0;i<4;i++) {
		   if(year==news[i].publication) {
			   sum=sum+news[i].price;
			   count++;
		   }
		   
	   }
	   if(count>0) {
			  return sum; 
	   }
	   return 0;
   }
   static newspaper searchNewspaperbyname(newspaper[] news,String Nam) {
	   
	   for(int i=0;i<4;i++) {
		   if(Nam.equalsIgnoreCase(news[i].name)) {
			   return news[i];
		   }
	   }
	   return null;
   }
}
class newspaper{
	int regno;
	String name;
	int publication;
	int price;
	newspaper(int reg,String name,int publicationyear,int price){
		this.regno=regno;
		this.name=name;
		this.publication=publicationyear;
		this.price=price;
	}
}