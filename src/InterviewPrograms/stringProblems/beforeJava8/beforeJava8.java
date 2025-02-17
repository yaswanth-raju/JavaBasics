package InterviewPrograms.stringProblems.beforeJava8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import java.util.Arrays;

class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"cherry", "date", "elderberry", "fig"};

        // Merge both arrays
        String[] mergedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(String[]::new);

        // Find common elements
        Set<String> commonElements = findCommonElements(mergedArray);

        // Print common elements
        System.out.println("Common elements: " + commonElements);
    }

    public static Set<String> findCommonElements(String[] array) {
        Set<String> elements = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        // Identify duplicates
        for (String str : array) {
            if (!elements.add(str)) {
                duplicates.add(str);
            }
        }

        return duplicates;
    }
}

