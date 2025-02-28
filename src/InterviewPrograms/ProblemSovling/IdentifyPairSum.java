package InterviewPrograms.ProblemSovling;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
/*OUTPUT:
Pair found: (1, -1)
Pair found: (2, -2)
Pair found: (3, -3)
* */
public class IdentifyPairSum {
    public static void main(String[] args) {
        int[] arr = IntStream.of(-1, -2, -3, 0, 1, 2, 3).toArray();
        int targetSum = 0; // Define the target sum

        // Find pairs that sum to the target value
        findPairsWithSum(arr, targetSum);
    }

    public static void findPairsWithSum(int[] arr, int targetSum) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
}
