import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 9 };
        int[] subset = { 1, 9 };
        int target = 10;
        // P Problem
        System.out.println("=== P Problem ===");
        System.out.println("Sum of Array: " + PProblem.sumArray(arr));
        // NP Problem
        System.out.println("\n=== NP Problem ===");
        boolean valid = NPProblem.verifySubset(arr, subset, target);
        System.out.println("Is subset valid? " + valid);
        // NP-Complete Problem
        System.out.println("\n=== NP-Complete Problem ===");
        List<Integer> result = new ArrayList<>();
        if (NPCompleteProblem.subsetSum(arr, target, result, 0)) {
            System.out.println("Subset Found: " + result);
        } else {
            System.out.println("No Subset Found");
        }
    }
}
