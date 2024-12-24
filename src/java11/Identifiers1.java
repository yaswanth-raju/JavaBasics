package java11;

public class Identifiers1 {
    public static void main(String[] args) {
        loop1:
        for (int i=0;i<10;i++){
            for (int j=0;j<5;j++){
                System.out.println(i+"-"+j);
                if(i==5){
                    break loop1;
                }
            }
        }
    }
}
