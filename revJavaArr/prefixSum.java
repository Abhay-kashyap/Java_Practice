public class PrefixSum {
    public static void maxSubArr(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Calculate prefix array
        prefix[0] = numbers[0]; // Initialize the first element
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Calculate the maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) { // Ensure `j` starts from `i`
                int end = j;

                // Calculate current subarray sum using prefix sums
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                // Update maxSum
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArr(numbers);
    }
}
