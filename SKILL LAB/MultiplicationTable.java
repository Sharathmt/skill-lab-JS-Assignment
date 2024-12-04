import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to generate its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of "+ num +":");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d =%d\n",num,i,num*i);
        }

        scanner.close();

    }
    
}
