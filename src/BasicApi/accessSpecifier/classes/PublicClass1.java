package BasicApi.accessSpecifier.classes;

public class PublicClass1 {
    public String publicField = "Accessible Anywhere";

    public void publicMethod() {
        System.out.println("This method is public and accessible from anywhere.");
    }

    protected String protectedField = "Accessible in Subclasses and Same Package";

    protected void protectedMethod() {
        System.out.println("This method is protected and accessible within the same package and subclasses.");
    }
}