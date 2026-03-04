public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    public boolean equals (Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    public int compareTo(Object other) {
        int result;
        // Kode implementasi di sini perlu ditambahkan
        return result;
    }
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