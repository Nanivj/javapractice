package com.exam.iramock;
import java.util.*;
public class solutiontoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     toy[] to=new toy[5];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<to.length;i++) {
    	 int a=sc.nextInt();sc.nextLine();
    	 String b=sc.nextLine();
    	 String c=sc.nextLine();
    	 double d=sc.nextDouble(); sc.nextLine();
    	 double e=sc.nextDouble(); sc.nextLine();
    	to[i]=new toy(a,b,c,d,e);
     }
     String input1=sc.nextLine();
     String input2 =sc.nextLine();
     int v= counttoywithcategory(to,input1);
     if(v>0) {
    	 System.out.println(v);
     }else {
    	 System.out.println("not found");
     }
     toy s=toyleastprice(to,input2);
     if(s!=null) {
    	 System.out.println(s.toyid);
    	 System.out.println(s.toyname);
    	 System.out.println(s.price);
     }else {
    	 System.out.println("noyyy found");
     }

	}
	public static int counttoywithcategory(toy[] to,String input1) {
		int count=0;
		for(int i=0;i<to.length;i++) {
			if(to[i].category.equalsIgnoreCase(input1)) {
				count++;
			}
		}if(count>0) {
			return count;
		}
		return 0;
	}
	public static toy toyleastprice(toy[] to,String input2) {
		toy m=null;
		double discount=0,total=0;
	  List<Double> li=new ArrayList<>();
		for(int i=0;i<to.length;i++) {
			if(to[i].category.equalsIgnoreCase(input2)) {
				discount=to[i].discount*to[i].price/100;
				total=to[i].price-discount;
				to[i].price=total;
				li.add(to[i].price);
			}
		}
		Collections.sort(li);
		if(li.size()>0) {
			for(int i=0;i<to.length;i++) {
				if(to[i].price==li.get(0)) {
					m=to[i];
				}
			}
		}if(m!=null) {
			return m;
		}
		
		return null;
	}

}
class toy{
	int toyid;
	String toyname;
	String category;
	double price;
	double discount;
	toy(int id,String name, String category,double price,double discount){
		this.toyid=id;
		this.toyname=name;
		this.category=category;
		this.price=price;
		this.discount=discount;
		
	}
}