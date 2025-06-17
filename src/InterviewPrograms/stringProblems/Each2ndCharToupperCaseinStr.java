package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Each2ndCharToupperCaseinStr {
    public static void main(String[] args) {
        solveWithJava8();
//        solveWithOutJava8();    //OUTPUT:: hI yAswanth hOw aRe yOu ?
    }

    private static void solveWithOutJava8() {
        String str="hi yaswanth how are you ?";
        StringBuilder builder = new StringBuilder(str);
        int subindex=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                subindex=0;
            }
            if(subindex==2){
                builder.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            subindex++;
        }
        System.out.println("build str= "+builder.toString());
    }

    private static void solveWithJava8() {

        String str="hi yaswanth how are you ?";
        String retStr = Arrays.stream(str.split(" ")).map(obj -> {
            String str2="";
            if (obj.length() >= 2) {
                str2=obj.replace(String.valueOf(obj.charAt(1)), String.valueOf(obj.charAt(1)).toUpperCase());
            }else{
                str2=obj;
            }
            return str2;
        }).collect(Collectors.joining(" "));
        System.out.println(retStr);
    }
}
