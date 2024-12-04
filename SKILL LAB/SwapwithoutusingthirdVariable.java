import java.util.Scanner;
public class SwapwithoutusingthirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int n1 = scanner.nextInt();

        System.out.println("enter the Second number");
        int n2 = scanner.nextInt();

        //swap without third variable

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("After Swapping");
        System.out.println("first number"+n1);
        System.out.println("Second number"+n2);

        scanner.close();

    }
    
}
