import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scanner.nextInt();

        int result = Sumofdigits(num);
        System.out.println("the sum of digits of "+num+"is:"+result);


        scanner.close();

    }
    public static int Sumofdigits(int num) {
        int sum = 0;

        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
    
}
