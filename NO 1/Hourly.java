//********************************************************************
// Hourly.java Author: Lewis/Loftus
//
// Represents an hourly employee.
//********************************************************************
public class Hourly extends Employee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    // Sets up an hourly employee using the specified information.
    //-----------------------------------------------------------------
    public Hourly (String eName, String eAddress, String ePhone,
                   String socSecNumber, double hourlyRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, hourlyRate);
        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // Adds hours to the count for this employee.
    //-----------------------------------------------------------------
    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // Returns information about an hourly employee.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nHours Worked: " + hoursWorked;
        return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = salary * hoursWorked;
        hoursWorked = 0;
        return payment;
    }
}
