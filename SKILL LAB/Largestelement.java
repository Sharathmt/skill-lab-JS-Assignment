
import java.util.Scanner;

public class Largestelement {
    public static int findLargest(int[] array){
        int largest = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scanner.nextInt();


        int[] array =new int[size];

        System.out.println("enter "+size+"elements:");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int largest = findLargest(array);//method to find largest element

        System.out.println("The largest element in array is "+largest);

        scanner.close();
    }

        
    }

