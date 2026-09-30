
import java.util.Scanner;

class algo {

    public static void main(String arg[]) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("give me n");

            int n = scanner.nextInt();

            int s = n * (n + 1) / 2;

            System.out.println("result is" + s);
        }

    }

}
