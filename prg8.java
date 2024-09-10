import java.util.Scanner;
import java.io.*;

class student {
  String name;
  int roll;
  int marks[] = new int[3];
  int total;
  float p;
  String grade;

  student() {
    name = null;
    roll = 0;
    marks[0] = marks[1] = marks[2] = 0;
  }

  student(int roll, String name, int marks[]) {
    this.name = name;
    this.roll = roll;
    for (int i = 0; i < marks.length; i++)
      this.marks[i] = marks[i];
  }

  void calc() {
    total = 0;
    for (int i = 0; i < marks.length; i++) {
      total += marks[i];
    }
    p = total * 100.0f / 300.0f;
    grade = p >= 90 ? "A" : p >= 70 ? "B" : p >= 45 ? "C" : "F";
  }

  void show() {
    System.out.println(roll + "\t" + name + "\t" + marks[0] + "\t" + marks[1] + "\t" + marks[2] + "\t" + total + "\t"
        + p + "\t" + grade);
  }
}

public class prg8 {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("stu.txt");
    Scanner in = new Scanner(f);
    student arr[] = new student[10];
    String s = in.nextLine();
    int i = 0;
    while (in.hasNext()) {
      s = in.nextLine();
      String x[] = s.split(",");
      int r = Integer.parseInt(x[0]);
      int m[] = new int[3];
      m[0] = Integer.parseInt(x[2]);
      m[1] = Integer.parseInt(x[3]);
      m[2] = Integer.parseInt(x[4]);
      arr[i] = new student(r, x[1], m);
      arr[i].calc();
      i++;
    }
    for (student s1 : arr) {
      s1.show();
    }
    in.close();
  }
}
