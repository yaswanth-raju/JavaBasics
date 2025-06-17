package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements  {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"cherry", "date", "blueberry", "fig"};


        List<String> list1 = Arrays.asList(array1);
        List<String> list2 = Arrays.asList(array2);

        // Find common elements using streams
        Set<String> commonElements = list1.stream()
                                          .filter(list2::contains)
                                          .collect(Collectors.toSet());

        // Print common elements
        System.out.println("Common elements: " + commonElements);
    }
}
