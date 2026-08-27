import java.util.Scanner;
public class StudentResultAnalyzer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter student name:");
    int name = sc.nextline();
    System.out.print("Enter marks in Subject 1:");
    int marks1 = sc.nextInt();
    System.out.print("Enter marks in Subject 2:");
    int marks2 = sc.nextInt();
    System.out.print("Enter marks in Subject 3:");
    int marks3 = sc.nextInt();
    int total = mark1 + mark2 + mark3;
    double average = (double) total / 3;
    boolean passed = mark1 >= 40 && mark2 >= 40 && mark3 >= 40;
    System.out.println("\n-----Student Result-----"); 
    System.out.println("Name: " + name); 
    System.out.println("Total Marks ": + total); 
    System.out.println("Average:" + average); 
    if (passed) {
      System.out.println("Result: PASS");
      if (average >= 75) {
      System.out.println("Distinction: YES");
      } else {
      System.out.println("Distinction: NO");
      }
      if (average >= 90) {
      System.out.println("Special Award:YES");
      } else {
      System.out.println("Special Award:NO");
      }
      } else {
      System.out.println("Result: FAIL"); 
      System.out.println("Distinction: NO"); 
      System.out.println("Special Award: NO");
     }
     sc.close();
  }
}
      
      
