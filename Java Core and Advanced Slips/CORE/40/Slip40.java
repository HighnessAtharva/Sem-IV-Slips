// WAP in java to accept a string from the user and display each word of the string in reverse order. Ex - "Hello World" is displayed as “olleH dlroW
class Slip40 {
    static String makeReverse(String str) {
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String[] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for (int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" ");
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(makeReverse(str));
    }
}