import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (!password.equals("java123")) {
                System.out.println("Wrong password");
            }

        } while (!password.equals("java123"));

        System.out.println("Welcome back boss");
    }
}