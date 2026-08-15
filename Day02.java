import java.util.Scanner;
class Student {
  String name;
  int age;
  int rollNo;
  int marks;
  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name:");
    name = sc.nextLine();
    System.out.print("Enter Age:");
    age = sc.nextInt();
    System.out.print("Enter RollNo:");
    rollNo = sc.nextInt();
    System.out.print("Enter Marks:");
    marks = sc.nextInt();
  }
  void display() {
    System.out.println("-----Student Details-----");
    System.out.println("Name: " + name);
    system.out.println("Age: " + age);
    system.out.println("Roll No: " + rollNo);
    system.out.println("Marks: " + marks);
  }
}
public class Day02 {
  public static void main(String[] args) {
    Student s = new Student();
    s.input();
    s.display();
  }
}
