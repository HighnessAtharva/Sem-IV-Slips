class Slip26 {
    public static void main(String arg[]) {
        int num[] = new int[10]; // used to store all the command line arguments
        int pr[] = new int[10]; // used to store all the prime nos
        int per[] = new int[10]; // used to store all the perfect nos
        int flag = 0, i, j, c1 = 0, c2 = 0, sum = 0;
        for (i = 0; i < arg.length; i++) {
            num[i] = Integer.parseInt(arg[i]);
        }
        System.out.println("Prime Number are-");
        for (i = 0; i < arg.length; i++) {
            flag = 0;
            for (j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                pr[c1] = num[i];
                System.out.println(pr[c1++]);
            }
        }
        System.out.println("Perfect Number are-");
        for (i = 0; i < arg.length; i++) {
            sum = 0;
            for (j = 1; j < num[i] - 1; j++) {
                if (num[i] % j == 0) {
                    sum = sum + j;
                }
            }
            if (num[i] == sum) {
                per[c2] = num[i];
                System.out.println(per[c2++]);
            }
        }
    }
}