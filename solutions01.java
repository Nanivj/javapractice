package com.exam.irapractice;
import java.util.*;
public class solutions01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Moisturizer[] mi =new Moisturizer[4];
    Scanner sc=new Scanner(System.in);
    	for(int i=0;i<4;i++) {
    		int a= sc.nextInt();sc.nextLine();
    		String b=sc.nextLine();
    		int c=sc.nextInt();sc.nextLine();
    		String d=sc.nextLine();
    		mi[i]=new Moisturizer(a,b,c,d);
    }
    String input1=sc.nextLine();
    Moisturizer k=gethighestpricemoisurizer(mi,input1);
    if(k!=null) {
    	
    	System.out.println(k.moisturizerId);
    	System.out.println(k.moisturizerName);
    	System.out.println(k.price);
    }else {
    	System.out.println("not found");
    }
    Moisturizer v= secondlow(mi);
    if(v!=null) {
    	System.out.println(v.price);
    	System.out.println(v.moisturizerName);
    }else {
    	System.out.println("not found");
    }
	}
  public static Moisturizer gethighestpricemoisurizer(Moisturizer[] mi,String input1) {
	  Moisturizer n=null;
	  List<Integer> li =new ArrayList<>();
	  for(int i=0;i<4;i++) {
		  if(mi[i].branchname.equalsIgnoreCase(input1)) {
			  li.add(mi[i].price);
		  }
	  }
		  Collections.sort(li,Collections.reverseOrder());
		 
		  if(li.size()>0) {
			 
				  for(int j=0;j<mi.length;j++) {
					  if(mi[j].price==li.get(li.size()-li.size())) {
						  n=mi[j];
					  }
				  }
			  }
		  if(n!=null) {
			  return n;
		  }
	  return null;
  }
  public static Moisturizer secondlow(Moisturizer [] mi) {
	  Moisturizer s=null;
	  int temp[]=new int[4];
	  for(int i=0;i<4;i++) {
		  temp[i]=mi[i].price;
	  }
	  Arrays.sort(temp);
	  int x= temp[1];
	  if(x%2==0) {
		  for(int i=0;i<mi.length;i++) {
			  if(mi[i].price==x) {
				  s=mi[i];
			  }
		  }
	  }if(s!=null) {
		  return s;
	  }
	  return null;
  }
}
class Moisturizer{
	int moisturizerId;
	String moisturizerName;
	int price;
	String branchname;
	Moisturizer(int id,String name,int price,String bname){
		this.moisturizerId=id;
		this.moisturizerName=name;
		this.price=price;
		this.branchname=bname;
	}
}
