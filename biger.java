import java.util.Scanner;

public class biger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer A: ");
        int A = scanner.nextInt();

        System.out.print("Entrer B: ");
        int B = scanner.nextInt();

        System.out.print("Entrer C: ");
        int C = scanner.nextInt();

        int Max = A;

        if (B >= Max) {
            Max = B;
        }

        if (C >= Max) {
            Max = C;
        }

        System.out.println("Le Max est " + Max);

        scanner.close();
    }
}
