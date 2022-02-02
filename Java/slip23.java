import java.io.*;  
 class Player  
 {  
      String Name;  
      int TotalRuns, TimesNotOut, InningsPlayed,pcode;  
      float Avg;  
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
      void getData()  
      {  
           try  
           {  
                System.out.println("Enter Player Code: ");  
                pcode=Integer.parseInt(br.readLine());  
                System.out.println("Enter Player Name: ");  
                Name = br.readLine();  
                System.out.println("Enter Total Runs: ");  
                TotalRuns = Integer.parseInt(br.readLine());  
                System.out.println("Enter Times Not Out: ");  
                TimesNotOut = Integer.parseInt(br.readLine());  
                System.out.println("Enter Innings Played: ");  
                InningsPlayed = Integer.parseInt(br.readLine());  
           }  
           catch(Exception e)  
           {  
                System.out.println(e);  
           }  
      }  
      void putData()  
      {   
           System.out.println(pcode + "\t"+Name+"\t"+TotalRuns+"\t"+TimesNotOut+"\t"+InningsPlayed+"\t"+Avg);  
      }  
      void getAvg()  
      {  
           Avg= TotalRuns / (InningsPlayed - TimesNotOut);  
      }  
      static void getAvg(Player p[],int n)  
      {  
           for (int i=0;i<n;i++)  
           {  
                p[i].Avg=p[i].TotalRuns / (p[i].InningsPlayed - p[i].TimesNotOut);  
           }  
           for (int i=0;i<n;i++)  
           {  
                p[i].putData();  
           }  
      }  
 }  
 public class slip23
 {  
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
      public static void main(String args[])  
      {  
           try  
           {  
                System.out.println("Enter No.of Players: ");  
                int n = Integer.parseInt(br.readLine());  
                Player p[] = new Player[n];  
                for(int i=0; i<n; i++)  
                {  
                     p[i] = new Player();  
                     p[i].getData();  
                }  
                System.out.println("Player Code For Avg Calculation");  
                int m=Integer.parseInt(br.readLine());  
                for(int i=0; i<n; i++)  
                {  
                     if(p[i].pcode==m)   
                     {  
                          p[i].getAvg();  
                          p[i].putData();  
                     }  
                }  
                System.out.println("Average Of All The Players");  
                Player.getAvg(p,n);  
           }  
           catch(Exception e)  
           {  
                System.out.println(e);  
           }  
      }  
 } 