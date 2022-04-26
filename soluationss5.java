package com.javanaresh.ira;
import java.util.*;
public class soluationss5 {
public static void main(String[] args) {
	student[] s=new student[4];
	Scanner scan =new Scanner(System.in);
	for(int i=0;i<2;i++) {
		int a= scan.nextInt();scan.nextLine();
		String b= scan.nextLine();
		String c=scan.nextLine();
		double d=scan.nextDouble();scan.nextLine();
		boolean e=scan.nextBoolean();
		s[i]=new student(a,b,c,d,e);
	}
	int v=findcountofdayscholarstudent(s);
	if(v>0) {
		System.out.println(v);
	}else {
		System.out.println("sorry");
	}
}
public static int findcountofdayscholarstudent(student[]s) {
	int count=0;
	for(int i=0;i<2;i++) {
		if(s[i].dayscholar==true) {
			if(s[i].score>80) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}
	}
	return 0;
}
}
class student{
	int rollnumber;
	String name;
	String branch;
	double score;
	boolean dayscholar;
	 
	student(int roll,String name,String branch,double score,boolean dayscholar){
		this.rollnumber=roll;
		this.name=name;
		this.branch=branch;
		this.score=score;
		this.dayscholar=dayscholar;
		}
}
