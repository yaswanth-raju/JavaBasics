package InterviewPrograms.ProblemSovling;
import java.util.Arrays;
import java.util.Collections;

public class CakeCandleProblem {
    public static void main(String[] args) {
        Integer[] arr = {9, 5, 2, 1, 3, 4, 6, 8, 7};
        int K = 1;

        // Find the tallest candle (max height)
        int maxHeight = Collections.max(Arrays.asList(arr));

        // Count the number of tallest candles
        long count = Arrays.stream(arr).filter(candle -> candle == maxHeight).count();

        // Output the result
        System.out.println("The tallest candle has a height of " + maxHeight + " and appears " + count + " times.");
    }
}