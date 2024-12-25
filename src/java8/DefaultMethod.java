package java8;

public class DefaultMethod {
    public static void main(String[] args) {
        DefaultInterface.statFun();
         DefaultInterface obj = ()->{
              System.out.println("override method");
              return  "override";
         };
        obj.defaultFun();
        obj.defaultFun2();
        obj.nonStatFun();

        OverClass childObj = new OverClass();
        childObj.statFun();
        childObj.defaultFun();
        childObj.nonStatFun();
        childObj.defaultFun2();
    }
}
class OverClass implements DefaultInterface{
//    @Override     --not possible ,it is static function
    public void statFun() {
        System.out.println("overclass void statFun");
    }
    @Override
    public String nonStatFun() {
        System.out.println("overclass void nonStatFun");
        return "in nonstatic child class";
    }
    @Override
    public  void defaultFun(){
        System.out.println("overclass void defaultFun");
    }
}

@FunctionalInterface
 interface DefaultInterface extends  DefaultInterfaceSuper{
//    @Override
//    default void defaultFun(){
//        System.out.println("default fun1");
//    }
    default void defaultFun2(){System.out.println("default fun2");}
    static void statFun(){
        System.out.println("static fun1");
    }
    String nonStatFun();
}
interface  DefaultInterfaceSuper{
    default void defaultFun(){
        System.out.println("super interface default fun1");
    }
}