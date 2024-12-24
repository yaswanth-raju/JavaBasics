package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOpertations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);
        list.set(2,3);//set will work only if u have value there
        list.add(2,7);  //add only current index is +1 for last index

        list=list.stream().sorted((a,b)->{
            if(a>b)
                return 1;
//            else if(a<b)
                return -1;
//            else
//                return 0;
        }).skip(1).collect(Collectors.toList());
        System.out.println(list);
        //System.out.println(list);
////        list.remove(5);
//        list.remove(1);
//        boolean ij=list.remove(new Integer(5));
//        System.out.println(list);
    }
}
