package com.exam.write;
import java.util.*;
public class solutionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   moisturizer[] mi=new moisturizer[4];
   Scanner scan= new Scanner(System.in);
   for(int i=0;i<4;i++) {
	   int a=scan.nextInt();scan.nextLine();
	   String b=scan.nextLine();
	   int c= scan.nextInt();scan.nextLine();
	   String d=scan.nextLine();
	   mi[i]=new moisturizer(a,b,c,d);
   }
   
   moisturizer a=gethighestpricemoisturizer(mi);
   if(a!=null) {
	   System.out.println(a.moisturizerid);
	   System.out.println(a.branchname);
   }else {
	   System.out.println("not found");
   }
	}
 public static moisturizer gethighestpricemoisturizer(moisturizer[] mi) {
	 moisturizer k=null;
	 List<Integer> li=new ArrayList<Integer>();
	 for(moisturizer i:mi) {
		 li.add(i.price);
	 }
	  Collections.sort(li);
		int k1=li.get(1);
		if(k1%2==0&&k1>350) {
			for(int i=0;i<mi.length;i++) {
				if(mi[i].price==k1) {
					k=mi[i];
				}
			}
		}
	 
	 return k;
 }
}
class moisturizer{
	int moisturizerid;
	String moisturizername;
	int price;
	String branchname;
	moisturizer(int id,String name,int price,String bname){
		this.moisturizerid=id;
		this.moisturizername=name;
		this.price=price;
		this.branchname=bname;
	}
	
}
