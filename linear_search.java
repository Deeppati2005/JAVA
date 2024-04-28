import java.util.*;

public class linear_search {
  public static int linearSearch(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 10;

    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt();

    int numbers[] = new int[n];

    System.out.print("Enter the elements : ");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.print("Enter the key : ");
    int key = sc.nextInt();
    int index = linearSearch(numbers, key);

    if (index == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("key is at index : " + index);
    }
    sc.close();
  }
}
