import java.util.Scanner;

public class bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.println("Enter a number (can be binary, octal, or hexadecimal):");
        String input = scanner.nextLine().trim();

        // Input type of the number
        System.out.println("What type is the input number? (bin / oct / hex):");
        String inputType = scanner.nextLine().trim().toLowerCase();

        // Input desired output type
        System.out.println("Which format do you want to convert to? (bin / oct / hex / dec):");
        String outputType = scanner.nextLine().trim().toLowerCase();

        int number = 0;

        // Convert input to decimal integer
        try {
            switch (inputType) {
                case "bin":
                    number = Integer.parseInt(input, 2);
                    break;
                case "oct":
                    number = Integer.parseInt(input, 8);
                    break;
                case "hex":
                    number = Integer.parseInt(input, 16);
                    break;
                default:
                    System.out.println("Invalid input type!");
                    return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the specified format!");
            return;
        }

        // Convert to desired output format
        String result = "";
        switch (outputType) {
            case "bin":
                result = Integer.toBinaryString(number);
                break;
            case "oct":
                result = Integer.toOctalString(number);
                break;
            case "hex":
                result = Integer.toHexString(number).toUpperCase();
                break;
            case "dec":
                result = Integer.toString(number);
                break;
            default:
                System.out.println("Invalid output format!");
                return;
        }

        System.out.println("Result: " + result);
    }
}