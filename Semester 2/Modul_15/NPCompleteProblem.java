import java.util.List;

class NPCompleteProblem {
    public static boolean subsetSum(int[] arr, int target, List<Integer> result, int index) {
        if (target == 0)
            return true;
        if (index == arr.length || target < 0)
            return false;
        result.add(arr[index]);
        if (subsetSum(arr, target - arr[index], result, index + 1))
            return true;
        result.remove(result.size() - 1);
        return subsetSum(arr, target, result, index + 1);
    }
}