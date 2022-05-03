class delete{
    public static void main(String[] args) {
        String s="Hello World";
        StringBuffer sb;
        String str=" ";
        s=s+ " ";
        for(int $i=0;$i<s.length();$i++){
            char ch=s.charAt($i);
            if(Character.isWhitespace(ch)){
                sb= new StringBuffer(str);
                System.out.println(sb.reverse());
                str=" ";
            }
            else
            str=str + ch;
        }
    }
}