import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //wrapper int agar bisa menggunakan method
        Integer[] intList; 
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();

        intList = new Integer[size];
        System.out.println("\nEnter the numbers...");
        
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }
            
        Sorting.selectionSort(intList);
        
        System.out.println ("\nYour numbers in sorted Ascending order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
            System.out.println();
        }
        
        Sorting.insertionSort(intList);
        System.out.println ("\nYour numbers in sorted Descending order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
            System.out.println();
        }

        scan.close();
    }
}