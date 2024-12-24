package BasicApi;

import java.util.Objects;

public class StringImmutable {
    public static void main(String[] args) {
        String str="abcd".substring(0,3);   //hash code entries in pool ,heap memory
//
        String str2="abc";

//        String str=new String("abc");
//        String str2=new String("abc");
        System.out.println(System.identityHashCode(str)+"=="+System.identityHashCode(str2));

        String idhash = Integer.toHexString(System.identityHashCode(str));
        System.out.println("current hash code str >> "+idhash);

        str="def";
        idhash = Integer.toHexString(System.identityHashCode(str));
        System.out.println("updated hash code str >> "+idhash);
//
//        idhash = Integer.toHexString(System.identityHashCode("abc"));
//        System.out.println("hash code of >>abc= "+idhash);
//
//        String str1=new String("abc");
        String str1="abc";
        String idhash2 = Integer.toHexString(System.identityHashCode(str1));
        System.out.println(idhash2);


    }
}
