package com.javanaresh.pratice;

import java.util.Scanner;

public class sloutionsxm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newspaper[] news=new newspaper[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int a=sc.nextInt(); sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			sc.nextLine();
			int price=sc.nextInt();
			sc.nextLine();
			news[i]=new newspaper(a,b,c,price);
			
		}

	}

}
class newspaper{
	int regno;
	String name;
	int publicationyear;
	int price;
newspaper(int no,String name,int year,int price ){
	this.regno=no;
	this.name=name;
	this.publicationyear=year;
	this.price=price;
}
}