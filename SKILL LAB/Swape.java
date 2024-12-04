
import java.util.Scanner;

public class Swape {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int n1 = scanner.nextInt();

        System.out.println("enter the second number");
        int n2 = scanner.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("the number in n1 after swape: "+n1);
        System.out.println("the number in n2 after swape: "+n2);
    }
    
}
