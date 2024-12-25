package BasicApi.accessSpecifier.classes;

public class ProtectedClass1 {

    protected String protectedField = "Accessible in Subclasses and Same Package";

    protected void protectedMethod() {
        System.out.println("This method is protected and accessible within the same package and subclasses.");
    }
}
