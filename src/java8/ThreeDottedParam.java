package java8;

public class ThreeDottedParam {
    public static void main(String[] args) {
        new ThreeDottedParam().passOptionalParam();
        new ThreeDottedParam().passOptionalParam("raja","Two","Kumar");
        new ThreeDottedParam().passOptionalParam(new String[]{"raja", "Two", "Kumar"});
    }
    void passOptionalParam(String ... param){   // allow zero to multiple arguments to be passed when the function is called
        System.out.println("No of params recived :"+ param.length);
    }
}
