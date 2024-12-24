package collections.list;

import java.util.Stack;
import java.util.stream.Collectors;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(35);
        stack.addElement(44);
        System.out.println(">>"+stack);
        stack.stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}
