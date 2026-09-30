import java.util.Scanner;

class capayear {

     public static void main(String args[]) {

          Scanner scanner = new Scanner(System.in);

          System.out.println(" give me the year");

          int a = scanner.nextInt();

          int b = a % 4;

          if (b == 0) {

               System.out.println("The year " + a + " is : a capa year");

          } else {

               System.out.println("The year " + a + " is : a normal year");

               scanner.close();
          }
          return;
     }
}