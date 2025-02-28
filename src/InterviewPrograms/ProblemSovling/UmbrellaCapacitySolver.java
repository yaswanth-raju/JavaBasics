package InterviewPrograms.ProblemSovling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
Problem:::
I have number of people waiting for umberilla
people = integer n
bunch of umberillas with different size each has capacity to hold some people
fit items (in this case, people) into bins (umbrella capacities) without exceeding the bin limits.

Solution:::
How to do code:
->Sort the Array: Start by sorting the array of umbrellas based on their capacities in descending order.
This will help you try to fit larger groups of people first.

->Recursive Function: Implement a recursive function to explore all possible combinations of umbrellas.
This function will try to allocate people to each umbrella and keep track of combinations that exactly match the required number of people.

->Track the Minimum Combination:Keep track of the combinations that exactly match the required number of people and select the one with the fewest umbrellas.
* */
/**
 * Start
 *  |
 *  |---> Initialize variables
 *         - Remaining people (noOfPeople)
 *         - List of umbrellas (sorted in descending order)
 *         - Current combination (empty list)
 *         - Minimum combination (null)
 *  |
 *  |---> Call recursive function findUmbrellaCombinations
 *         |
 *         |---> Base cases:
 *         |     - If remaining people is 0:
 *         |           - Check and update minimum combination
 *         |           - Return minimum combination
 *         |     - If remaining people is negative or no more umbrellas left:
 *         |           - Return minimum combination
 *         |
 *         |---> Recursive cases:
 *         |     - Include the current umbrella:
 *         |           - Update remaining people (subtract current umbrella capacity)
 *         |           - Call findUmbrellaCombinations with updated variables
 *         |     - Exclude the current umbrella:
 *         |           - Call findUmbrellaCombinations with updated variables
 *         |
 *         |---> Compare and return:
 *         |     - Compare the combinations with and without the current umbrella
 *         |     - Return the combination with fewer umbrellas
 *         |
 * End
 * **/
public class UmbrellaCapacitySolver {

    // Recursive function to find the minimum combination of umbrellas
    static List<Integer> findUmbrellaCombinations(int remainingPeople, List<Integer> umbrellas, List<Integer> currentCombination, List<Integer> minimumCombination) {
        // Base case: if remaining people is 0, check if this combination has fewer umbrellas
        if (remainingPeople == 0) {
            if (minimumCombination == null || currentCombination.size() < minimumCombination.size()) {
                return new ArrayList<>(currentCombination);
            }
            return minimumCombination;
        }

        // Base case: if remaining people is negative or no more umbrellas left, return minCombination
        if (remainingPeople < 0 || umbrellas.isEmpty()) {
            return minimumCombination;
        }

        // Try including the current umbrella
        List<Integer> withCurrentUmbrella = findUmbrellaCombinations(remainingPeople - umbrellas.get(0),
                umbrellas.stream().skip(1).collect(Collectors.toList()),
                new ArrayList<>(currentCombination) {{
                    add(umbrellas.get(0));
                }},
                minimumCombination);

        // Try excluding the current umbrella
        List<Integer> withoutCurrentUmbrella = findUmbrellaCombinations(remainingPeople,
                umbrellas.stream().skip(1).collect(Collectors.toList()),
                new ArrayList<>(currentCombination),
                minimumCombination);

        // Return the combination with fewer umbrellas
        if (withCurrentUmbrella == null) {
            return withoutCurrentUmbrella;
        }
        if (withoutCurrentUmbrella == null) {
            return withCurrentUmbrella;
        }
        return withCurrentUmbrella.size() < withoutCurrentUmbrella.size() ? withCurrentUmbrella : withoutCurrentUmbrella;
    }

    public static void main(String[] args) {
        int noOfPeople = 10;
        List<Integer> umbrellas = Arrays.asList(3, 5, 4, 1, 2);

        // Sort the umbrellas in descending order using streams
        List<Integer> sortedUmbrellas = umbrellas.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        List<Integer> finalList = findUmbrellaCombinations(noOfPeople, sortedUmbrellas, new ArrayList<>(), null);
        System.out.println("Final list: " + finalList);
    }
}