
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String Str = scanner.nextLine();

        int Vcount =0;

        Str = Str.toLowerCase();

        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                Vcount++;
            }
        }


        System.out.println("Number of vowels in given string are: " +Vcount );


    }
    
}
