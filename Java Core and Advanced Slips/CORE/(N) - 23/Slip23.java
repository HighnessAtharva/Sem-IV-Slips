// Write a java program to accept the details of n Cricket Players from user(Player code,name,runs,innings-played and number of times not out).The program should contain following menus:-Display average runs of a single player.-Display average runs of all players.(Use array of objects,Method overloading and static keyword)

import java.io.*;

class Player {
    String name;
    int TotalRuns, TimesNotOut, InningsPlayed;
    float avg;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getData() {
        try {
            System.out.println("Enter player name:");
            name = br.readLine();
            System.out.println("Enter Total Runs:");
            TotalRuns = Integer.parseInt(br.readLine());
            System.out.println("Enter times Not Out:");
            TimesNotOut = Integer.parseInt(br.readLine());
            System.out.println("Enter the Innings Played:");
            InningsPlayed = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void putdata() {
        System.out.println(name + "\t\t" + TotalRuns + "\t\t" + TimesNotOut + "\t\t" + InningsPlayed + "\t\t" + avg);
    }

    float getAvg() {
        avg = (TotalRuns / (InningsPlayed - TimesNotOut + 1));
        return avg;
    }
}

public class Slip23 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) {
        try {
            System.out.println("Enter the Number of Players:");
            int n = Integer.parseInt(br.readLine());
            Player p[] = new Player[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Player();
                p[i].getData();
            }
            sortPlayer(p);
            System.out.println(
                    "Name" + "\t" + "TotalRuns" + "\t" + "TimesNotOut" + "\t" + "InningsPlayed" + "\t" + "Average");
            for (int i = 0; i < n; i++) {
                p[i].putdata();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void sortPlayer(Player p[]) {
        int n = p.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].getAvg() < p[j].getAvg()) {
                    Player t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                }
            }
        }
    }
}
