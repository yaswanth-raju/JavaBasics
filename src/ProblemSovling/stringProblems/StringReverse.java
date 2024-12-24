package ProblemSovling.stringProblems;

public class StringReverse {
    public static void main(String[] args) {
        String str="rajakumas";
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        System.out.println(str2);
    }
}
