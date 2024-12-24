package BasicApi;

import java.util.Objects;

public class OopsPractice1 {
    static int number;
    int nonstatnumber;
    public static void main(String[] args) {
        OopsPractice1 practice1=new OopsPractice1();
        System.out.println(practice1.number);
        practice1.number=22;
        OopsPractice1 practice2=new OopsPractice1();
//        System.out.println(practice2.number);
        System.gc();
        System.out.println(practice2);
    }
    void fun(){

        nonstatnumber=22;
    }
}
