package java11;

public class VarDataType {
    public static void main(String[] args) {
//        byte shortvar=126;
//        Integer str=128;
//        shortvar=str.byteValue();
//        System.out.println(str == shortvar);
//        System.out.println(((Object)str).getClass().getName()+" = "+str+" "+shortvar);

        repeatCount();

    }

    static  void repeatCount() {
        String s = "aaabbaacccc";
        char currChar = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        int currCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (currChar == s.charAt(i)) {
                currCount++;
            }
            else if(i==s.length()-1){
                sb.append(currChar + "" + currCount);
            }
            else {
                sb.append(currChar + "" + currCount);
                currChar = s.charAt(i);
                currCount=1;
            }
        }
        System.out.println(sb.toString());
    }
}
