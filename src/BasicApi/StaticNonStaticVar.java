package BasicApi;

public class StaticNonStaticVar {
    static int number;
    int nonstatnumber;
    public static void main(String[] args) {
        StaticNonStaticVar practice1=new StaticNonStaticVar();
        System.out.println(practice1.number);
        practice1.number=22;
        StaticNonStaticVar practice2=new StaticNonStaticVar();
//        System.out.println(practice2.number);
        System.gc();
        System.out.println(practice2);
    }
    void fun(){

        nonstatnumber=22;
    }
}
