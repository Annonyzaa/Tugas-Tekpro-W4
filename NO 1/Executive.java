//********************************************************************
// Executive.java Author: Lewis/Loftus
//
// Represents an executive employee with bonus capability.
//********************************************************************
public class Executive extends Employee
{
    private double bonus;

    //-----------------------------------------------------------------
    // Sets up an executive using the specified information.
    //-----------------------------------------------------------------
    public Executive (String eName, String eAddress, String ePhone,
                      String socSecNumber, double sal)
    {
        super (eName, eAddress, ePhone, socSecNumber, sal);
        bonus = 0;
    }

    //-----------------------------------------------------------------
    // Awards a bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus (double bonusAmount)
    {
        bonus = bonusAmount;
    }

    //-----------------------------------------------------------------
    // Returns information about an executive.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nBonus: $" + String.format("%.2f", bonus);
        return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay for this executive.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
