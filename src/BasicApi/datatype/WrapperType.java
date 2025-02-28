package BasicApi.datatype;

public class WrapperType {
    public static void main(String[] args) {
        Integer a=1;
        int b =1;
        Integer c= new Integer(1);  //it will refer to new memory

        System.out.println(System.identityHashCode(a)+" == "+System.identityHashCode(b));
        System.out.println("a = "+a+" b = "+b+" c="+c);
//        c=1;
        String result = (a.equals(c)) ? "matched": "not matched";
        System.out.println("result: "+result);
    }
}
