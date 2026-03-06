//********************************************************************
// Commission.java Author: [Your Name]
//
// Represents a commissioned hourly employee.
//********************************************************************
public class Commission extends Hourly
{
    private double totalSales;
    private double commissionRate;

    //-----------------------------------------------------------------
    // Sets up a commissioned hourly employee using the specified information.
    //-----------------------------------------------------------------
    public Commission (String eName, String eAddress, String ePhone,
                       String socSecNumber, double hourlyRate, double commissionRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, hourlyRate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }

    //-----------------------------------------------------------------
    // Adds sales to the total sales for this employee.
    //-----------------------------------------------------------------
    public void addSales (double totalSales)
    {
        this.totalSales += totalSales;
    }

    //-----------------------------------------------------------------
    // Returns information about a commissioned hourly employee.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: $" + String.format("%.2f", totalSales);
        return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay for this commissioned hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }
}