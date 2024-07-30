package CrackYourPlacementDay10;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    // Method to find the minimum difference between the maximum and minimum values of any m elements in the sorted list
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // Sort the array
        Collections.sort(a);

        // Initialize min to a large value
        long min = Long.MAX_VALUE;

        // Traverse the sorted list and find the minimum difference
        for (int i = 0; i <= n - m; i++) {
            // Calculate the difference between the maximum and minimum values in the subarray
            long diff = a.get(i + m - 1) - a.get(i);
            // Update min if a smaller difference is found
            min = Math.min(min, diff);
        }

        return min;
    }

    // Main method for testing
    public static void main(String[] args) {
        ChocolateDistributionProblem solution = new ChocolateDistributionProblem();

        // Example input
        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(13);
        a.add(7);
        a.add(5);
        a.add(13);
        a.add(12);

        int n = a.size();
        int m = 4;

        long result = solution.findMinDiff(a, n, m);
        System.out.println(result); // Output should be 2
    }
}
