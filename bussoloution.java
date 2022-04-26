package com.exam.iramock;
import java.util.*;
public class bussoloution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     bus[] bu=new bus[4];
     Scanner sc =new Scanner(System.in);
     for(int i=0;i<bu.length;i++) {
    	 int a=sc.nextInt();sc.nextLine();
    	 String b=sc.nextLine();
    	 int c=sc.nextInt(); sc.nextLine();
    	 int d=sc.nextInt();sc.nextLine();
    	 bu[i]=new bus(a,b,c,d);
     }
     int input1 =sc.nextInt();sc.nextLine();
     int input2=sc.nextInt();
     int count=countpassengers(bu,input1);
     if(count>0) {
    	 System.out.println(count);
     }
     else {
    	 System.out.println("not found");
     }
     bus b=searchbus(bu,input2);
     if(b!=null) {
    	 System.out.println(b.passengercount);
    	 System.out.println(b.travelsname);
    	 System.out.println(b.busstop);
     }else {
    	 System.out.println("not found");
     }
     }


   public static int countpassengers(bus[] bu,int input1) {
	   int count=0;
	   for(int i=0;i<bu.length;i++) {
		   if(bu[i].busstop>input1) {
			   count=count+bu[i].passengercount;
		   }
	   }
		if(count>0) {
			return count;
		}
	   return 0;
   }
   public static bus searchbus(bus[] bu,int input2) {
	   bus m=null;
	   List<Integer> li=new ArrayList<>();
	   for(int i=0;i<bu.length;i++) {
		   if(bu[i].passengercount>input2) {
			   li.add(bu[i].passengercount);
		   }
	   }
	   Collections.sort(li,Collections.reverseOrder());
	   if(li.size()>0) {
		   for(int i=0;i<bu.length;i++) {
			   if(bu[i].passengercount==li.get(1)) {
				   m=bu[i];
			   }
		   }
	   }if(m!=null) {
		   return m;
	   }
	   return null;
   }
}
class bus{
	int busno;
	String travelsname;
	int passengercount;
	int busstop;
	bus(int no,String name,int count,int busstop){
		this.busno=no;
		this.travelsname=name;
		this.passengercount=count;
		this.busstop=busstop;
	}
}