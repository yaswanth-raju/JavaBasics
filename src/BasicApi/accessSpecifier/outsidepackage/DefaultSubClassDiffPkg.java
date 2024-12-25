package BasicApi.accessSpecifier.outsidepackage;

import BasicApi.accessSpecifier.classes.DefaultSubClassSamePkg;

public class DefaultSubClassDiffPkg extends DefaultSubClassSamePkg {
    public void accessProtectedAndPublic(){
        prtoctedStr="protected";
        publicStr="publicpeople";
//        defaultStr="ssdfds"; -->default cannot access inside child classes
    }
}
