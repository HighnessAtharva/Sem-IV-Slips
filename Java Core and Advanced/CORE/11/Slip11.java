// Write a java program to accept Employee name from the user and check whether it is valid or not. If it is not valid then throw user defined Exception Name is Invalid otherwise display it.

import java.io.*;

class InvalidNameException extends Exception {
}

class Slip11 {
    String nm;

    Slip11(String nm) {
        this.nm = nm;
    }

    void display() {
        System.out.println("Name = " + nm);
    }

    public static void main(String a[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name = br.readLine();
        try {
            int len = name.length();
            int flag = 0;
            for (int i = 0; i < len; i++) {
                char ch = name.charAt(i);
                if (Character.isLowerCase(ch) ||
                        Character.isUpperCase(ch)) {
                    flag = 1;
                } else {
                    flag = -1;
                    break;
                }
            }
            if (flag == -1) {
                throw new InvalidNameException();
            } else {
                Slip11 s = new Slip11(name);
                s.display();
            }
        } catch (InvalidNameException e) {
            System.out.println("Name is invalid");
        }
    }
}