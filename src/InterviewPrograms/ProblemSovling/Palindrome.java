package InterviewPrograms.ProblemSovling;

public class Palindrome {
    public static void main(String[] args) {
        String str="civic";
        int len=str.length();
        boolean flag=false;
        for (int j=0;j<len/2;j++){
            if(str.charAt(j)==str.charAt(len-j-1)){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("palindrome"
            );
        }else {
            System.out.println("not palindrome");
        }
    }
}
