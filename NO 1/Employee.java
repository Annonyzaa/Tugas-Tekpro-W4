//********************************************************************
// Employee.java Author: Lewis/Loftus
//
// Represents a regular employee with a fixed salary.
//********************************************************************
public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double salary;

    //-----------------------------------------------------------------
    // Sets up an employee using the specified information.
    //-----------------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone,
                     String socSecNumber, double sal)
    {
        super (eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        salary = sal;
    }

    //-----------------------------------------------------------------
    // Returns information about an employee.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        result += "\nSalary: $" + String.format("%.2f", salary);
        return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay for this employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return salary;
    }
}
