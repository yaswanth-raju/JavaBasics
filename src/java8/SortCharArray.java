package java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortCharArray {
    public static void main(String[] args) {
       Character[] arr = new Character[] {10,32,6,3,8,2,'5'};
        System.out.println("ascending order");
        Arrays.stream(arr).map(ch->ch.hashCode()).sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("reverse order");
        Arrays.stream(arr).map(ch->ch.hashCode()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
