package com.javanaresh.ira;

import java.util.Scanner;

public class solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerinformations[] custom =new customerinformations[4];
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int a = scan.nextInt();
			String b= scan.nextLine();scan.nextLine();
			double c=scan.nextDouble();
			int d=scan.nextInt();
			String e=scan.nextLine();scan.nextLine();
			custom[i]=new customerinformations(a,b,c,d,e);
		}
		String Branchname=scan.nextLine();
	
		int avg=findAvgBillBranch(custom,Branchname);
		if(avg>0) {
			System.out.println(avg);
		}
		else {
				System.out.println("there are no customer");
			}
	
}
	    public static int findAvgBillBranch(customerinformations[] custom,String Branchname) {
	    	int sum=0,count=0,f=0;
	    	for(int i=0; i<4;i++) {
	    		if(Branchname.equalsIgnoreCase(custom[i].branchName)) {
	    			sum=(sum+(int)custom[i].billAmount);
	    			count++;
	    		}
	    	}
	    		if(count!=0) {
	    			f=sum/count;
	    			return f;
	    		}
	          else {
			return 0;
		}
	}
	   
	}

class customerinformations{
	int customerid;
	String customerName;
	double billAmount;
	int noofitems;
	String branchName;
	
	public customerinformations(int cid,String cusname,double billamount,int noofitems, String branchname ){
		this.customerid=cid;
		this.customerName=cusname;
		this.billAmount =billamount;
		this.noofitems=noofitems;
		this.branchName=branchname;
	}
}
