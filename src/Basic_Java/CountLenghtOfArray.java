package Basic_Java;

public class CountLenghtOfArray {

    public static void main(String [] args){

        CountArrayLength();

    }
    public static void CountArrayLength(){

        //Count using arr.length method
       int arr[] = {4,2,6,7,8};
       int count = 0;
       for (int i=0;i< arr.length;i++){
           count++;
       }
       String NofArray = String.valueOf(count);
       System.out.println("Array Length = "+NofArray);
    }

    public static void arrayLength() {

        int arr[] = {8, 5, 6, 4, 8, 7, 9};
        int count = 0;
    }
}