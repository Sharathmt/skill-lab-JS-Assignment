
import java.util.Scanner;

public class SimpleInterestCalculater{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount(p): ");
        double p = scanner.nextDouble();

        System.out.println("enter the rate of interest(R) in percentage:");
        double R = scanner.nextDouble();

        System.out.println("enter the time(t) in years: ");
        double T = scanner.nextDouble();

        double simpleinterest =(p*R*T)/100;

        System.out.println("The simple interest is:  %.2f\n"+simpleinterest);

    }
}