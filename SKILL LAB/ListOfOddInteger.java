public class ListOfOddInteger {
    public static void main(String[] args) {
        int[] oddnumber = new int[10];

        for(int i =0;i<oddnumber.length;i++){
            oddnumber[i]=2*i+1;
        }

        System.out.println("Array of odd numbers: ");
        for(int num : oddnumber){
            System.out.println(num+ " ");
        }
    }
    
}
