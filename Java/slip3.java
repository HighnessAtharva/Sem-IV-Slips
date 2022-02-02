import java.util.*;
import java.io.*;

public class slip3
{
    public static void main(String args[])throws Exception
    {
        int n,sal=0;
        String name="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Hashtable  h = new Hashtable();
       
        System.out.println("\nEnter number of  Employee : ");
        n = Integer.parseInt(br.readLine());
       
        System.out.println("\nEnter name and Salary : ");
        for(int i = 1; i <= n; i++)
        {
            name = br.readLine();
            sal=Integer.parseInt(br.readLine());
            h.put(name,sal);
        }

       Enumeration v = h.elements();   //sal
       Enumeration k = h.keys();          //name
       while(k.hasMoreElements())
       {
     System.out.println(k.nextElement()+"   "+v.nextElement());
       }
      int max = 0;String str="";
      k = h.keys();
      v = h.elements();
       while(v.hasMoreElements())
       {
     //System.out.println(v.nextElements());
     sal=(Integer)v.nextElement();
     name = (String)k.nextElement();
     if(sal>max)
     {
           max = sal;
           str = name;
     }

       }
       System.out.println(str +" has maximum salary is "+max);

  }
}

