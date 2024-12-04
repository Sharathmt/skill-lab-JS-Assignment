
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string");
        String str = scanner.nextLine();

        String RStr =" ";

        for(int i = str.length()-1;i>=0;i--)
        {
            RStr += str.charAt(i);
        }

        System.out.println("Reversed String : "+RStr);

        scanner.close();
    }
    
}
