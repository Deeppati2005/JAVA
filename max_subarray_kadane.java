public class max_subarray_kadane {
  public static void kadanes(int numbers[]) {
    int sum = 0;
    int max = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
      if (sum > max) {
        max = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    System.err.println("Max Sum : " + max);
  }

  public static void main(String[] args) {
    // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int numbers[] = { -2, -1 };
    kadanes(numbers);
  }
}