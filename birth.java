import java.util.Scanner ;
   
    class birth {
   
    public static void main(String args[]) {
  
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("give me day");
            
            int a = scanner.nextInt();
            
            System.out.println("give me month");
            
            int b = scanner.nextInt();
            
            System.out.println("give me year");
            
            int c = scanner.nextInt();
            
            System.out.println("YOUR BIRTHDAY IS : "+a+b+c);
        }
  }
}