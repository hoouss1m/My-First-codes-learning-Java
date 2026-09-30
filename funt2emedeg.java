import java.util.Scanner;

class fun2emedeg {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(" give me a");

    int a = scanner.nextInt();

    System.out.println(" give me b");

    int b = scanner.nextInt();

    System.out.println(" give me c");

    int c = scanner.nextInt();

    int d = (b * b) - 4 * a * c;

    System.out.println("your delta is : " + d);
    double X1 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
    if (d > 0)

      System.out.println("result of X1 is : " + X1);

    scanner.close();
  }
}
