package BasicApi;

public class VariableQuestions1 {
    String var1="0";
    VariableQuestions1(){
        System.out.println("init");
        var1="2";
    }
    VariableQuestions1 questions1=new VariableQuestions1();

    public static void main(String[] args) {
        VariableQuestions1 questions=new VariableQuestions1();
        System.out.println(questions.questions1.var1);

        Integer var1=100;
        Integer var2=100;
        Integer var3=500;
        Integer var4=500;
        System.out.println(var1==var2);
        System.out.println(var3==var4);
    }
}
