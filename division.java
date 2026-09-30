import java.util.Scanner ;
class division {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter number : ");
        
        int a = scanner.nextInt();
    
       for (int i=1 ; i<=a ; i++){
        if ( a%i==0){
        System.out.println(i);
       }
    scanner.close();
  }
}
}