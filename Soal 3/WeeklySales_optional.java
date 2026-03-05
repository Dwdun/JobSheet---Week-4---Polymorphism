import java.util.Scanner;

public class WeeklySales_optional {
    public static void main(String[] args) {
        Salesperson[] salesstaff;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many sales person do you want to sort? ");
        size = scan.nextInt();

        salesstaff = new Salesperson[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter the firstname orang ke-" + (i+1));
            String firstname = scan.next();
            System.out.println("\nEnter the lastname orang ke-" + (i+1));
            String lastname = scan.next();
            System.out.println("\nEnter the total sales orang ke-" + (i+1));
            int totalsales = scan.nextInt();

            salesstaff[i] = new Salesperson(firstname, lastname, totalsales);
        }

        Sorting.selectionSort(salesstaff);
        System.out.println ("\nRanking of Sales for the Week (ascending) \n");
        for (Salesperson s : salesstaff) {
            System.out.println(s);
        }
        
        Sorting.insertionSort(salesstaff);
        System.out.println ("\nRanking of Sales for the Week (descending)\n");
        for (Salesperson s : salesstaff) {
            System.out.println(s);
        }
        
        scan.close();
    }
}