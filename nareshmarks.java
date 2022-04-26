package com.javanaresh.loved;
import java.util.*;
public class nareshmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int temp[] =new int[n];
       Map<Integer,Integer> m=new HashMap<>();
       int arr[]=new int[n]; 
       int arr1[]=new int[n];
     for(int i=0;i<n;i++) {
    	 int a=sc.nextInt();sc.nextLine();
    	 arr[i]=a;
     }
        for(int i=0,j=1;i<n;i++,j++) {
        	
        	arr1[i]=j;
        m.put(arr[i], arr1[i]);
         }
        TreeMap<Integer,Integer> tm= new TreeMap<>(m);
        Map demp = tm.descendingMap();
       
        Iterator itr=demp.keySet().iterator();    
        while(itr.hasNext()) {
        	int key=(int)itr.next();  

        	System.out.println(m.get(key));
        }
	
	
}
}