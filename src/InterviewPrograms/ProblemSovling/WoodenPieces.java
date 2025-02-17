package InterviewPrograms.ProblemSovling;

public class WoodenPieces {
    public static void main(String[] args) {
        maximumSide(13,11);
    }

    private static void maximumSide(int wood1, int wood2) {
        int total=wood1+wood2;
        int expectedMaxSide=total/4;
//        System.out.println(expectedMaxSide);
        for(int i=expectedMaxSide;i>0;i--){
            if(wood1/expectedMaxSide+wood2/expectedMaxSide==4) {
                System.out.println(expectedMaxSide);
                break;
            }else {
                expectedMaxSide--;
            }
        }
    }
}
