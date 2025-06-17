class NPProblem {
    public static boolean verifySubset(int[] arr, int[] subset, int target) {
        int sum = 0;
        for (int num : subset)
            sum += num;
        if (sum != target)
            return false;
        for (int num : subset) {
            boolean found = false;
            for (int a : arr) {
                if (a == num) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
}