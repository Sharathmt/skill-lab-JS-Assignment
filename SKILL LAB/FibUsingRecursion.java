import java.util.Scanner;

public class FibUsingRecursion {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void printFibonacci( int Terms){
        System.out.println("fibonacci series is: ");

        for (int i=0;i<Terms;i++){
            System.out.println(fibonacci(i)+ " ");

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int Terms = scanner.nextInt();

        // calling funcation
        printFibonacci(Terms);

        scanner.close();
    }
}