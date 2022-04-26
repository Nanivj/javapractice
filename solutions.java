package com.exam.write;
import java.util.Scanner;

import java.util.Arrays;


public class solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank[] banks=  new Bank[4];

	      Scanner sc=new Scanner(System.in);



	        for (int i = 0; i <4 ; i++) {

	             int a=sc.nextInt();

	             String b=sc.nextLine();sc.nextLine();

	             int c=sc.nextInt();

	             String d=sc.nextLine();sc.nextLine();

	            banks[i] =new Bank(a,b,c,d);



	        }

	        String input1=sc.nextLine();

	       int ans1 =findAvgNumberOfCustomersByCity(banks,input1);

	       if(ans1>0)

	       {

	           System.out.println(ans1);

	       }

	       else

	       {

	           System.out.println("Bank Found");

	       }



	        Bank ans2=getSecondLowestNumberOfCustomersBank(banks);

	         if(ans2==null)

	         {

	             System.out.println("Bank not Found");

	         }

	         else

	         {

	             System.out.println(ans2.bankId);

	             System.out.println(ans2.bankName);

	             System.out.println(ans2.noOfCustomers);

	             System.out.println(ans2.city);

	         }





	    }



	   public static int findAvgNumberOfCustomersByCity(Bank[] banks,String input1)

	    {

	       int count=0;

	        int sum=0;



	        for (int i = 0; i <4 ; i++) {

	            if(banks[i].city.equalsIgnoreCase(input1))

	            {

	                count+=1;

	                sum=sum+banks[i].noOfCustomers;

	            }

	        }

	       if(count!=0)

	       {

	           return sum/count;

	       }





	        return 0;

	    }



	  public  static Bank  getSecondLowestNumberOfCustomersBank(Bank[] banks){

	        int[] temp=new int[4];

	      for (int i = 0; i < 4; i++) {

	          temp[i]=banks[i].noOfCustomers;

	      }



	      Arrays.sort(temp);

	    int x= temp[1];

	     if(x%2==0)

	     {

	         for (int i = 0; i <4 ; i++) {

	             if(banks[i].noOfCustomers==x)

	             {

	                 return banks[i];

	             }

	         }

	     }



	         return null;

	    }





	}



	class  Bank{

	 int bankId;

	 String bankName;

	 int noOfCustomers;

	 String city;



	    public Bank(int bankId, String bankName, int noOfCustomers, String city) {

	        this.bankId = bankId;

	        this.bankName = bankName;

	        this.noOfCustomers = noOfCustomers;

	        this.city = city;
	}

}
