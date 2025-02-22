package Basic_Java;

import java.util.Arrays;

public class Array_Sorting {

    public static void main (String[] args){

        int arr[] = {4,2,6,8,3,1,9};

        //bubble sort
        for(int i=0; i< arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){               //condition
                    int temp = arr[j];              //swap the values
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
        nextExample();
        SortArray();
        fruitsArray();
    }
    public static void printArray(int arr[]){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //Another Expample
    public static void nextExample(){

        int a[] = {5,3,7,9,1};

        for (int i=0 ; i< a.length-1 ; i++){
            for (int j= 0 ; j<a.length-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }

    //Sort An Array with Predefined functions
    public static void SortArray(){

        int arr[] = {8,5,4,9,6,5,54};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //Sort String of Array using SortPredefined
    public void stringArray(){

        String fruits[] = {"Banana", "Apple", "Cherry", "Mango"};

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println();
    }

    //String Array sorting
    public static void fruitsArray(){
        String fruits[] = {"Banana", "Apple", "Cherry", "Mango"};

        for (int i=0;i<fruits.length-1;i++){
            for (int j=0;j<fruits.length-i-1;j++){
                if (fruits[j].compareTo(fruits[j+1])>0){
                    String temp = fruits[j];
                    fruits[j]=fruits[j+1];
                    fruits[j+1]=temp;
                }
            }
        }
        for (int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+ " ");

        }
        System.out.println();

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
    }


}
