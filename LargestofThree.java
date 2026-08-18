import java.util.scanner;
class LargestThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number:");
    int a = sc.nextInt();
    System.out.print("Enter Second number:");
    int b = sc.nextInt();
    System.out.print("Enter Third number:");
    int c = sc.nextInt();
    int largest;
    if( a >= b && a >= c)
      largest = a;
    else if(b >= a && b >= c)
      largest = b;
    else
      largest = c;
    System.out.println("Largest number = " + largest);
  }
}
