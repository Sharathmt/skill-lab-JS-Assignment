
import java.util.Scanner;

public class Armstrongnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(isArmstrong(num)){
            System.out.println(num +"is a armstrong number");
        }
        else{
            System.out.println(num +"is not a armstrong number");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num){
        int Originalnum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while(num>0){
            int digit = num%10;
            sum +=Math.pow(digit,numberOfDigits);
            num /= 10;
        }
        return sum == Originalnum;
    }
}
