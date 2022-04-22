/*Q.8b Write a program to accept 'n' no's through the command line and store all the prime no's and perfect no's into the different
arrays and display both the arrays*/
import java.util.*;
import java.util.Scanner.*;
class PrimePerfect
{
	public static void main(String args[])
	{
		int num[];
		int n,i,j,sum;
		//ArrayList<Integer> od=new ArrayList<Integer>();
		ArrayList<Integer> per=new ArrayList<Integer>();
		ArrayList<Integer> pri=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		n=Integer.parseInt(args[0]);
		num=new int[n];
		
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		//odd nos
		/*for(i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
		for(i=0;i<n;i++)
		{
			if(num[i]%2!=0)
			{
				od.add(num[i]);
			}
		}
		*/
		//prime nos
		int m;
		for(i=0;i<n;i++)
		{
			m=num[i];
			
			for(j=2;j<m;j++)
			{
				if(m%j==0)
					break;
			}
			if(j==m)
			{
				pri.add(m);
				
			}
		}
		// perfect nos
		for(i=0;i<n;i++)
		{
			j=1;
			sum=0;
			
			while(j<num[i])
			{
				if(num[i]%j==0)
				{
					sum=sum+j;
				}
				j++;
			}
			if(sum==num[i])
				per.add(num[i]);
		}
		/*
		for(i=0;i,od.size();i++)
		{
			System.out.println("Odd nos are "+og.get(i));
			
		}
		*/
		for(i=0;i<per.size();i++)
		{
			System.out.println("Perfect nos are "+per.get(i));
		}
		for(i=0;i<pri.size();i++)
		{
			System.out.println("Prime nos are "+pri.get(i));
		}
		
	}
}