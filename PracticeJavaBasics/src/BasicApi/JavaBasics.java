package BasicApi;

import java.util.ArrayList;
import java.util.List;

public class JavaBasics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.set(1,3);//set will work only if u have value there
        list.add(2,5);  //add only current index is +1 for last index
        System.out.println(list);
//        list.remove(5);
        boolean ij=list.remove(new Integer(1));
        System.out.println(list);
    }
}
