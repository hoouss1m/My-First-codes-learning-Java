import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number: ");
    int n = scanner.nextInt();
    int s = 1; // factorial result
    for (int i = 1; i <= n; i++) {
            s = s * i;
    }
    System.out.println("Factorial = " + s);
    scanner.close();
    }
}

/*import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter num : ");
        int n = input.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(" !"+ n + " = " + factorial);
    }
}
*/
