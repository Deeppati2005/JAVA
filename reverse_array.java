import java.util.*;

public class reverse_array {

  public static void revArray(int numbers[]) {
    int first = 0, last = numbers.length - 1;
    while (first < last) {
      int temp = numbers[last];
      numbers[last] = numbers[first];
      numbers[first] = temp;

      first++;
      last--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();

    int numbers[] = new int[n];
    System.out.println("Enter the nos : ");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
    }
    revArray(numbers);
    System.out.print("Reverse array : ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    sc.close();
  }
}