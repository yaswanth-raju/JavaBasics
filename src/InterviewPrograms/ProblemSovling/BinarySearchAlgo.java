package InterviewPrograms.ProblemSovling;

import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        String[] array = {"Aarav", "Bhavana", "Chirag", "Deepika", "Esha",
                "Farhan", "Geeta", "Harish", "Ishaan", "Juhi", "Kiran", "Lakshmi",
                "Manish", "Nikita", "Omkar", "Pooja", "Rajesh", "Sneha", "Tarun", "Vidya"};

        // Sort the array
        Arrays.sort(array);

        // Define the target to search
        String target = "Rajesh";

        // Perform the binary search
        int index = binarySearch(array, target);

        // Output the result
        if (index != -1) {
            System.out.println("The target \"" + target + "\" is found at index " + index + " in the sorted array.");
        } else {
            System.out.println("The target \"" + target + "\" is not found in the array.");
        }
    }

    public static int binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = target.compareTo(array[mid]);

            // Check if target is present at mid
            if (result == 0) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (result > 0) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }
}
