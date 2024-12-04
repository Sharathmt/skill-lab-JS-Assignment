
import java.util.Scanner;

 class FibonacciSeries {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number to genrate its fibonac series");
        int num = scanner.nextInt();

        Fibonacci(num);//calling funcation

        scanner.close();
    }

    //called funcation
    public static void  Fibonacci(int n){
        int n1 = 0, n2 =1; //n1 is the first variable, n2 is next variable

        System.out.println("Fibonacci series is: ");
        //loop to print n fibonacci series number
        for(int i=0;i<n;i++){
            System.out.println(n1+" ");

            int n3 = n1 +  n2; // n3 is the next variable
            n1 = n2; //value of n1 is update to n2
            n2 = n3; // value of n2  is update to n1
        }
    }
}
