package com.javanaresh.ira;
import java.util.*;

public class solution2 {
public static void main(String[] args) {
	Bank[] banks=new Bank[4];
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<4;i++) {
		int a=scan.nextInt();scan.nextLine();
		String b=scan.nextLine();
		int c=scan.nextInt();scan.nextLine();
		String d=scan.nextLine();
		banks[i]=new Bank(a,b,c,d);
	}
	String City=scan.nextLine();
	int avg =findavgnumberofcustomerbycity(banks,City);
	if(avg>0) {
		System.out.println("hello"+avg);
	}else {
		System.out.println("nooooo");
	}
	Bank sec=getsecondlowest(banks);
	if(sec!=null) {
		System.out.println(sec.bankid);
		System.out.println(sec.bankname);
		System.out.println(sec.numberofcustomers);
		System.out.println(sec.city);
	}else {
		System.out.println("not found");
	}
}
public static int findavgnumberofcustomerbycity(Bank[] banks,String City) {
	int count=0,f=0,sum=0;
	for(int i=0;i<4;i++) {
		if(banks[i].city.equalsIgnoreCase(City)) {
			sum=sum+banks[i].numberofcustomers;
		    count++;
		}
	}
		if(count>0) {
			f=sum/count;
			return f;
		}
	    return 0;
     }
public static Bank getsecondlowest(Bank[] banks) {
	Bank n=null;
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<banks.length;i++) {
		li.get(banks[i].numberofcustomers);
	}
	Collections.sort(li);
	int x=li.get(1);
	if(x%2==0) {
		for(int i=0;i<4;i++) {
			if(banks[i].numberofcustomers==x) {
				n=banks[i];
			}
		}
	}if(n!=null) {
		return n;
	}
	return null;
}
}
class Bank{
	int bankid;
	String bankname;
	int numberofcustomers;
	String city;
	Bank(int bnakid,String bankname,int noofcustomers,String city){
		this.bankid=bankid;
		this.bankname=bankname;
		this.numberofcustomers= noofcustomers;
		this.city=city;
	}
}
