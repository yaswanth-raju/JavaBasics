package java8.LamdaExpressions;

public class DefaultMethod {
    public static void main(String[] args) {
//        DefaultInterface.statFun();
//         DefaultInterface obj = ()->{
//              System.out.println("override method");
//              return  "override";
//         };
//        obj.fun2();
        OverClass obj = new OverClass();
        obj.statFun();
    }
}
class OverClass implements DefaultInterface{
//    @Override
    public void statFun() {
        System.out.println("overclass void statFun");
    }
    @Override
    public String fun2() {
        return "classo ver";
    }
}

@FunctionalInterface
 interface DefaultInterface{
    default void fun1(){
        System.out.println("default fun1");
    }
    static void statFun(){
        System.out.println("static fun1");
    }
    String fun2();
}