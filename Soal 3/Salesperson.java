public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    //constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //bisa untuk searching
    public boolean equals(Object other) {
        //equals dari objek string, method built in
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }
    
    //override method comparable (built in)
    public int compareTo(Object other) {
        int result;
        //downcasting object other to salesperson
        if (totalSales > (((Salesperson) other).getSales())) {
            result = 1;
        } else if (totalSales < (((Salesperson) other).getSales())) {
            result = -1;
        } else {
            result = lastName.compareTo(((Salesperson) other).getLastName());

            if (result == 0) {
                result = firstName.compareTo(((Salesperson) other).getLastName());
            }
        }
        return result;
    }
    //getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSales() {
        return totalSales;
    }
}