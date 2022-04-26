package com.exam.irapractice;
import java.util.*;
public class solutioncontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Contest[] co=new Contest[4];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<co.length;i++) {
    	int a=sc.nextInt();sc.nextLine();
    	String b=sc.nextLine();
    	String c=sc.nextLine();
    	int d= sc.nextInt();sc.nextLine();
    	String e=sc.nextLine();
    	co[i]=new Contest(a,b,c,d,e);
    }
    String input1=sc.nextLine();
    String input2=sc.nextLine();
    int k=findtotalpoins(co,input1);
    if(k>0) {
    	System.out.println(k);
    }else {
    	System.out.println("not found");
    }
    Contest v=secondheight(co,input2);
    if(v!=null) {
    	System.out.println(v.points);
    }else {
    	System.out.println("not found");
    }
	}
	public static int findtotalpoins(Contest[] co,String input1) {
		int total=0;
		for(int i=0;i<co.length;i++) {
			if(co[i].contestwinner.equalsIgnoreCase(input1)) {
				total=total+co[i].points;
			}
		}if(total>0) {
			return total;
		}
		return 0;
	}
	public static Contest secondheight(Contest[] co,String input2) {
		Contest n=null;
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<co.length;i++) {
			if(co[i].category.equalsIgnoreCase(input2)) {
				li.add(co[i].points);
			}
		}
		Collections.sort(li);
		if(li.size()>0) {
			for(int i=0;i<co.length;i++) {
				if(co[i].points==li.get(li.size()-2)) {
					n=co[i];
				}
			}
		}if(n!=null) {
			return n;
		}
				
		return null;
		
	}

}
class Contest{
	int contestid;
	String contestname;
	String contestwinner;
	int points;
	String category;
	Contest(int id,String name,String winner,int points,String category){
		this.contestid=id;
		this.contestname=name;
		this.contestwinner=winner;
		this.points=points;
		this.category=category;
		
	}
}
