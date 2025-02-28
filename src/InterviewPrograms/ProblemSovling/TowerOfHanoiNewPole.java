package InterviewPrograms.ProblemSovling;

import java.util.Arrays;
import java.util.Stack;

public class TowerOfHanoiNewPole {
    public static void main(String[] args) {
        Integer[] pole1Array = new Integer[]{1, 2, 3, 10};
        Integer[] pole2Array = new Integer[]{6, 5, 4, 12};
        Integer[] pole3Array = new Integer[]{8, 7, 9, 11};

        Stack<Integer> pole1 = new Stack<>();
        Stack<Integer> pole2 = new Stack<>();
        Stack<Integer> pole3 = new Stack<>();
        Stack<Integer> pole4 = new Stack<>();

        // Initialize poles with given plates
        pole1.addAll(Arrays.asList(pole1Array));
        pole2.addAll(Arrays.asList(pole2Array));
        pole3.addAll(Arrays.asList(pole3Array));

        // Helper function to move plates from one pole to another maintaining order
        movePlates(pole1, pole4);
        movePlates(pole2, pole4);
        movePlates(pole3, pole4);

        // Print the contents of pole4
        System.out.println("Pole 4 contains: " + pole4);
    }

    private static void movePlates(Stack<Integer> source, Stack<Integer> destination) {
        Stack<Integer> temp = new Stack<>();

        // Move plates one by one ensuring larger plates are not on top of smaller plates
        while (!source.isEmpty()) {
            int plate = source.pop();

            while (!destination.isEmpty() && destination.peek() < plate) {
                temp.push(destination.pop());
            }

            destination.push(plate);

            while (!temp.isEmpty()) {
                destination.push(temp.pop());
            }
        }
    }
}
