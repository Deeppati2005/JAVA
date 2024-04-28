import java.util.*;

public class array_largest {
  public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }
    return largest;
  }

  public static int getSmallest(int numbers[]) {
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < smallest) {
        smallest = numbers[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int numbers[] = { -2, -3, -4, -1 };

    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    System.out.print("Enter the nos : ");
    int numbers[] = new int[size];
    for (int i = 0; i < size; i++) {
    numbers[i] = sc.nextInt();
    }
    int largest = getLargest(numbers);
    int smallest = getSmallest(numbers);
    System.out.println("Largest value is : " + largest);
    System.out.println("Smalest value is : " + smallest);
    sc.close();
  }
}
