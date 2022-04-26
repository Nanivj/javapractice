package com.iraexam.practice;
import java.util.*;
public class solutionagencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  travel[] tr=new travel[4];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<tr.length;i++) {
	  int a =sc.nextInt();sc.nextLine();
	  String b=sc.nextLine();
	  String c=sc.nextLine();
	  int d=sc.nextInt();sc.nextLine();
	  boolean e=sc.nextBoolean();
	  tr[i]=new travel(a,b,c,d,e);			  
			  
  }
  int input =sc.nextInt();sc.nextLine();
  
  String input1=sc.nextLine();
  int v=findhighprice(tr);
  if(v>0) {
	  System.out.println(v);
  }else {
	  System.out.println("not");
  }
  travel m=agency(tr,input,input1);
  if(m!=null) {
	  System.out.println(m.agencename);
	  System.out.println(m.price);
  }else {
	  System.out.println("no");
  }
  
	}
public static int findhighprice(travel[] tr) {

	int n=0;
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<tr.length;i++) {
		li.add(tr[i].price);
	}
	Collections.sort(li);
	if(li.size()>0) {
		for(int i=0;i<4;i++) {
			if(tr[i].price==li.get(li.size()-1)) {
				n=li.get(li.size()-1);
			}
		}
	}if(n>0) {
		return n;
	}
	return 0;
}
public static travel agency(travel[] tr, int input,String input1) {
	travel m=null;
	for(int i=0;i<4;i++) {
		if(tr[i].regno==input && tr[i].pakagetype.equalsIgnoreCase(input1)&&tr[i].fightfacility==true) {
			m=tr[i];
		}
	}if(m!=null) {
		return m;
	}
	return null;
}
}
class travel{
	int regno;
	String agencename;
	String pakagetype;
	int price;
	boolean fightfacility;
	travel(int no,String name,String type,int price,boolean fight){
		this.regno=no;
		this.agencename=name;
		this.pakagetype=type;
		this.price=price;
		this.fightfacility=fight;
	}
}