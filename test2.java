public class test2 {
  public static void maxSubArray(int[] nums) {
    int sum = 0;
    int max = nums[0];

    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
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
    int num[] = { -1, -2 };
    maxSubArray(num);
  }
}