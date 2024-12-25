package BasicApi.accessSpecifier.outsidepackage;

import BasicApi.accessSpecifier.classes.ProtectedClass1;

public class ProtectedSubClass1 extends ProtectedClass1 {
    public void accessProtectedMethods(){
        protectedField="updated";
        protectedMethod();
    }
}
