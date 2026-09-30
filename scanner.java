import java.util.Scanner;

public class scanner {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Name : ");

    String name = scanner.nextLine();

    System.out.println("Your Name is : " + name);

    scanner.close();

  }
}