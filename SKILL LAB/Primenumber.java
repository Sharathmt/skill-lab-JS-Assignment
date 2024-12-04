import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("the given number is prime number"+num);
        }
        else{
            System.out.println("the given number is not a prime number"+num);
        }
    }
    
}
