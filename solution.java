package com.exam.todayira;
import java.util.*;
public class solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Theatre[] the=new Theatre[4];
		
		
		for(int i=0;i<the.length;i++) {
			int aa=sc.nextInt();sc.nextLine();
			String bb=sc.nextLine();
			int cc=sc.nextInt();sc.nextLine();
			int dd=sc.nextInt();sc.nextLine();
			String ee=sc.nextLine();
			
			the[i]=new Theatre(aa,bb,cc,dd,ee);
		}
		int input=sc.nextInt();sc.nextLine();
		String input1=sc.nextLine();
		int ki= gettheatrecapacity( the,  input);
		if(ki>0) {
			System.out.println(ki);
		}else {
			System.out.println("Theatre Number is incorrect");
		}
		
		Theatre si=secondlowesttheatrerating( the,  input1);
		if(si!=null) {
			System.out.println(si.theatrename);
			System.out.println(si.theatrerating);
		}else {
			System.out.println("No such Theatre");
		}
	}
	
	public static int gettheatrecapacity(Theatre[] the, int input) {
		int m=0;
		for(int i=0;i<the.length;i++) {
			if(the[i].theatrenumber==input) {
				m=the[i].theatrecapacity;
			}
		}if(m>0) {
			return m;
		}
		return 0;
	}
	public static Theatre secondlowesttheatrerating(Theatre[]the, String input1) {
		Theatre n=null;
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<the.length;i++) {
			if(the[i].theatretype.equalsIgnoreCase(input1)) {
				li.add(the[i].theatrerating);
			}
		}
		Collections.sort(li);
		if(li.size()>0) {
			for(int i=0;i<the.length;i++) {
				if(the[i].theatrerating==li.get(li.size()-2)) {
				n=the[i];	
				}
			}
		}if(n!=null) {
			return n;
		}
		
		return null;
	}

}
class Theatre {
	int theatrenumber;
	String  theatrename;
	int theatrecapacity;
	int theatrerating;
	String theatretype;
	
	Theatre(int number,String name,int capacity,int rating,String type){
		this.theatrenumber=number;
		this.theatrename=name;
		this.theatrecapacity=capacity;
		this.theatrerating=rating;
		this.theatretype=type;
		
	}
	
}
