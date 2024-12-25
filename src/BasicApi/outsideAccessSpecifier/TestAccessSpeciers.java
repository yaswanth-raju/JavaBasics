package BasicApi.outsideAccessSpecifier;

//import BasicApi.accessSpecifier.classes.DefaultClass1; // is not public in 'BasicApi.accessSpecifier.classes'. Cannot be accessed from outside package
import BasicApi.accessSpecifier.classes.DefaultSubClassSamePkg;
import BasicApi.accessSpecifier.classes.ProtectedClass1;
import BasicApi.accessSpecifier.classes.PublicClass1;
import BasicApi.accessSpecifier.outsidepackage.DefaultSubClassDiffPkg;
import BasicApi.accessSpecifier.outsidepackage.ProtectedSubClass1;

public class TestAccessSpeciers  {
    public static void main(String[] args) {
        PublicClass1 publicClass1 = new PublicClass1();
//        publicClass1.protectedMethod(); //'protectedMethod()' has protected access in 'BasicApi.accessSpecifier.classes.PublicClass1'
        publicClass1.publicMethod();

        ProtectedClass1 protectedClass1 = new ProtectedClass1();
        /*
        Summary: Protected classes can loaded to out side package but protected properties not accessable
        through its child class it can acessable
        * */
        ProtectedSubClass1 protectedSubClass1 = new ProtectedSubClass1();
        protectedSubClass1.accessProtectedMethods();    //Access protected methods out side package

        DefaultSubClassSamePkg defaultsubClassSamePkg =new DefaultSubClassSamePkg(); //is not public in 'BasicApi.accessSpecifier.classes'. Cannot be accessed from outside package
        defaultsubClassSamePkg.accessDefaultClassVars();
        String publicStr = defaultsubClassSamePkg.publicStr;

        DefaultSubClassDiffPkg defaultSubClassDiffPkg=new DefaultSubClassDiffPkg();
        defaultSubClassDiffPkg.accessProtectedAndPublic();
         publicStr = defaultSubClassDiffPkg.publicStr;



    }
}
