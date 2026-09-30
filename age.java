import java.util.Scanner;

class age {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" give me your age");
    int a = scanner.nextInt();

    if (a <= 2) {
      System.out.println("BEBE");
    } else if (a >= 3 && a <= 12) {
      System.out.println("ENFANT");
    } else if (a >= 13 && a <= 17) {
      System.out.println("ADOLISENT");
    } else if (a >= 18 && a <= 69) {
      System.out.println("ADULT");
    } else {
      System.out.println("agèe");
    }
    scanner.close();
  }
}