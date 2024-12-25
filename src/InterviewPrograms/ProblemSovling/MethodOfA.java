package InterviewPrograms.ProblemSovling;

public class MethodOfA {
    public static void main(String[] args) {
        B b= new B();
        b.methodA();
    }
}
class B{
    int methodA(){
        return  true? null:0;

    }
}