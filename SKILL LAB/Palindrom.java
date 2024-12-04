
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string");
        String str = scanner.nextLine();

        if(isPalindrome(str)){
            System.out.println("\""+str+"\"is a palindrome");

        }else{
            System.out.println("\""+str+"\"is not a palindrome");
        }
        
    }
    public static boolean isPalindrome(String s){
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();

        int left = 0;
        int right = cleaned.length()-1;
        
        while (left<right) {
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }

            left++;
            right--;
            
        }
    }
}
