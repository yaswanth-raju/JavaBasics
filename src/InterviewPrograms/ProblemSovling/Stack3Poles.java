package InterviewPrograms.ProblemSovling;

import java.util.Arrays;
import java.util.Stack;

public class Stack3Poles {
    public static void main(String[] args) {
        Integer[] pole1=new Integer[]{1,2,3,10};
        Integer[] pole2=new Integer[]{6,5,4,12};
        Integer[] pole3=new Integer[]{8,7,9,11};
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        Stack<Integer> stack3=new Stack<>();

        stack1.addAll(Arrays.asList(pole1));
        stack2.addAll(Arrays.asList(pole2));
        stack3.addAll(Arrays.asList(pole3));


        System.out.println(stack1.peek()+" - "+stack2.peek()+" - "+stack3.peek());
    }
}
