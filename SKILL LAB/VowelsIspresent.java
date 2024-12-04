import java.util.Scanner;


class VowelsIspresent {
    public static boolean containsVowel(String Str){

        Str = Str.toLowerCase();

        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return true; //return true if vowels is present in string
                 }
        }
            return false; //return false if vowels is not present in string
        }



public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String Str = scanner.nextLine();


            if(containsVowel(Str)){
                System.out.println("vowels are present in string ");
        }
        else{
            System.out.println("vowels are not present in  string ");
        }
        scanner.close();


    }
    
}

    

