import java.util.*;

public class binary_search {

  public static int binarySearch(int numbers[], int key) {
    int start = 0, end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numbers[mid] == key) {
        return mid;
      }
      if (numbers[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
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
    System.out.println("Enter the key : ");
    int key = sc.nextInt();
    int index = binarySearch(numbers, key);

    if (index == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("key is at index : " + index);
    }
    sc.close();
  }
}
