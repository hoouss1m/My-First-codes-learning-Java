
import java.util.Scanner;

class azero {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give me number");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("nigative");
        } else {
            System.out.println("zero");
        }
        scanner.close();
    }
}
