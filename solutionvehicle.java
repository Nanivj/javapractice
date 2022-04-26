package com.exam.iramock;
import java.util.*;
public class solutionvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    vehicle[] vh=new vehicle[4];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<vh.length;i++) {
    	int a=sc.nextInt();sc.nextLine();
    	String b=sc.nextLine();
    	double c=sc.nextDouble();sc.nextLine();
    	vh[i]=new vehicle(a,b,c);
    }
    String input=sc.nextLine();
    vehicle v=findvehicleminprice(vh);
    if(v!=null) {
    	System.out.println(v.name);
    	System.out.println(v.number);
    	System.out.println(v.price);
    }
    else {
    	System.out.println("not found");
    }
    vehicle n=searchvehicle(vh,input);
    if(n!=null) {
    	System.out.println(n.number);
    	System.out.println(n.name);
    	System.out.println(n.price);
    }else {
    	System.out.println("not found");
    }
	}
	public static vehicle findvehicleminprice(vehicle[] vh) {
		vehicle m=null;
		List<Double> li=new ArrayList<>();
		for(int i=0;i<vh.length;i++) {
			li.add(vh[i].price);
		}
		Collections.sort(li);
		if(li.size()>0) {
			for(int i=0;i<vh.length;i++) {
				if(vh[i].price==li.get(0)) {
					m=vh[i];
				}
			}
		}if(m!=null) {
			return m;
		}
		return null;
	}
 
	public static vehicle searchvehicle(vehicle[] vh,String input) {
		vehicle m=null;
		for(int i=0;i<vh.length;i++) {
			if(vh[i].name.equalsIgnoreCase(input)) {
				m=vh[i];
			}
		}if(m!=null) {
			return m;
		}
		return null;
	}
}
class vehicle{
	int number;
	String name;
	double price;
	vehicle(int no,String name,double price){
		this.number=no;
		this.name=name;
		this.price=price;
		
	}
}