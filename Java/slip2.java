import java.io.*;

class Slip2 {
    public static void main(String a[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many cities");
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter city name ");
            s[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[j].compareTo(s[i]) < 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Cities in Descending order : ");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}