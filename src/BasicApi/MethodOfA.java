package BasicApi;

public class MethodOfA {
    public static void main(String[] args) {
        Ba b= new Ba();
        b.methodA();
    }
}
class Ba{
    int methodA(){
        return  true? null:0;

    }
}