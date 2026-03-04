public class Commission extends Hourly{
    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double comrate){
        super(eName,eAddress,ePhone,socSecNumber,rate);
        commissionRate = comrate;
        totalSales = 0.0;
    }

    public void addSales(double totsale){
        totalSales = totsale;
    }

    @Override
    public double pay(){
        double payment = super.pay() + (totalSales*commissionRate);
        totalSales = 0.0;
        return payment;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales : " + totalSales;
        return result;
    }


}
