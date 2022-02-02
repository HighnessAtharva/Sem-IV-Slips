import java.util.*;
class slip5
{
      static int cnt;
      int roll;
      String nm; 
       slip5()
      {}
       slip5(int rno,String name)
      {
            roll=rno;
            nm=name;
            cnt++;
            System.out.println("objects created="+cnt);
      }


      public String toString()
      {
            return "Roll No: "+roll+" Student Name: "+nm+"\n";

      }
     
      public static void main(String a[])
      {
            int n,i,rno;
            String name;
            System.out.println("enter no of students");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            slip5 ob[]=new  slip5[n];
            for(i=0;i<n;i++)
            {
                  System.out.println("enter roll no");
                  rno=s.nextInt();
                  System.out.println("enter name");
                  name=s.next();
                  ob[i] = new  slip5(rno,name);
            }


            System.out.println("Students are : ");
            for(i=0;i<n;i++)
            {
                  System.out.println(ob[i]);
            }
      }
}