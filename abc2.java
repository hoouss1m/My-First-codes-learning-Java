
import java.util.Scanner;

class abc2 {

    public static void main(String args[]) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" give me anumber ");
            int a = scanner.nextInt();

            System.out.println(" give me anumber ");
            int b = scanner.nextInt();

            System.out.println(" give me anumber ");
            int c = scanner.nextInt();

            int d = (b * b) - 4 * a * c;
            System.out.println("here's your result" + d);

            if (d > 0) {
                System.out.println("true");

            }
        }

    }
}
