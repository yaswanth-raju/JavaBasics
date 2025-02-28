package InterviewPrograms.ProblemSovling;
/*
* OUTPUT:
* The missing number is: 2
* */
public class MissingNaturalNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1}; // Example array
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = (n * (n + 1)) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
