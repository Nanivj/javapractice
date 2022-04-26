package com.exam.write;
import java.util.*;
public class solutions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Music[] m=new Music[4];
  Scanner sc = new Scanner(System.in);
  for(int i=0;i<4;i++) {
	  int a=sc.nextInt();sc.nextLine();
	  String b=sc.nextLine();
	  int c=sc.nextInt();sc.nextLine();
	  double d=sc.nextDouble();
	  m[i]=new Music(a,b,c,d);
  }
  int input1 =sc.nextInt();
	}
public static Music[] rchard(Music[] m,int input1) {
	List<Double> li=new ArrayList<Double>();
	for(Music i:m) {
		if(i.duration>input1) {
			li.add(i.duration);
		}
	}
	Collections.sort(li);
	Music[] m1 =new Music[li.size()] ;
		
	if(li.size()>0) {
		for(int j=0;j<li.size();j++) {
			for(int i=0;i<m.length;i++) {
				if(m[i].duration==li.get(j)) {
					m1[j]=m[i];
				}
			}
		}
	}
	if(m1!=null) {
		return m1;
	}
	return null;
}
}
class Music{
	int playlist;
	String type;
	int count;
	double duration;
	Music(int play,String type,int count,double duration){
		this.playlist=play;
		this.type=type;
		this.count=count;
		this.duration=duration;
	}
}
