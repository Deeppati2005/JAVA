public class max_subarray_bruteForce {
  public static void printSubarrays(int numbers[]) {
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        currentSum = 0;
        for (int k = start; k <= end; k++) {
          currentSum += numbers[k];
        }
        if (currentSum > maxSum) {
          maxSum = currentSum;
        }
      }
    }
    System.out.println("Max sum : " + maxSum);
  }

  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    printSubarrays(numbers);
  }
}
