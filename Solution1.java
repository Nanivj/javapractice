package com.javanaresh.ira;
import java.util.*;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customerinformation[] custom =new Customerinformation[4];
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int a = scan.nextInt();scan.nextLine();
			String b= scan.nextLine();
			double c=scan.nextDouble();scan.nextLine();
			int d=scan.nextInt();scan.nextLine();
			String e=scan.nextLine();
			custom[i]=new Customerinformation(a,b,c,d,e);
		}
		String Branchname=scan.nextLine();
		double billamount=scan.nextDouble();scan.nextLine();
	    String lettername=scan.nextLine();
		int avg=findAvgBillBranch(custom,Branchname);
		if(avg>0) {
			System.out.println(avg);
		}
		else {
				System.out.println("there are no customer");
			}
		
		Customerinformation results= discountbybillamount(custom,billamount,lettername);
	    if(results!=null) {
	    	System.out.println(results.billAmount+""+results.customerName);
	    }else {
	    	System.out.println();
	    }
}
	    public static int findAvgBillBranch(Customerinformation[] custom,String Branchname) {
	    	int sum=0,count=0,f=0;
	    	for(int i=0; i<4;i++) {
	    		if(custom[i].branchName.equalsIgnoreCase(Branchname)) {
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
	   
	    public static Customerinformation discountbybillamount(Customerinformation[] custom,double billamount,String lettername) 
	    { 
	    	Customerinformation s=null;
	    
	    	String n,m;
	         double sum=0;
	     	for(int i=0;i<custom.length;i++) {
	     		n=custom[i].customerName.toLowerCase();
	     		char f1=n.charAt(0);
	     		m=lettername.toLowerCase();
	     		char f2=m.charAt(0);
	     		if(f1==f2) {
	     			if(custom[i].billAmount>=billamount) {
	     				sum=custom[i].billAmount-custom[i].billAmount*20/100 ;
	     			      custom[i].billAmount=sum;
	     				s=custom[i];
	     			}else {
	     				sum=custom[i].billAmount-custom[i].billAmount*10/100;
	     				
	                        custom[i].billAmount=sum;
	                        s=custom[i];
	     			}
	     		}
	     	}
	     	if(sum>0) {
	     	return s;
	     	}
	     	
	     	return null;
       }
}


class Customerinformation{
	
	int customerid;
	String customerName;
	double billAmount;
	int noofitems;
	String branchName;
	
	public Customerinformation(int cid,String cusname,double billamount,int noofitems, String branchname ){
		this.customerid=cid;
		this.customerName=cusname;
		this.billAmount =billamount;
		this.noofitems=noofitems;
		this.branchName=branchname;
	}
}

