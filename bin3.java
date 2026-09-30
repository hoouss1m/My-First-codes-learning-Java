import java.util.Scanner;

public class bin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // إدخال الرقم
        System.out.println("Enter a number (you can use DEC, HEX with 0x, or BIN with 0b):");
        String input = scanner.nextLine().trim();

        // إدخال نوع الإدخال (اختياري إذا استخدمت 0x أو 0b)
        System.out.println("Specify input type (bin / oct / hex / dec) or press Enter to auto-detect:");
        String inputType = scanner.nextLine().trim().toLowerCase();

        int number = 0;

        try {
            // كشف النظام تلقائيًا إذا لم يحدد المستخدم
            if (inputType.isEmpty()) {
                if (input.startsWith("0x") || input.startsWith("0X")) {
                    inputType = "hex";
                    input = input.substring(2);
                } else if (input.startsWith("0b") || input.startsWith("0B")) {
                    inputType = "bin";
                    input = input.substring(2);
                } else {
                    inputType = "dec";
                }
            }

            // تحويل الإدخال إلى DEC داخلي
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
                case "dec":
                    number = Integer.parseInt(input);
                    break;
                default:
                    System.out.println("Invalid input type!");
                    scanner.close();
                    return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the specified format!");
            scanner.close();
            return;
        }

        // عرض كل الصيغ الأربع مباشرة
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Decimal: " + number);

        scanner.close();
    }
}
