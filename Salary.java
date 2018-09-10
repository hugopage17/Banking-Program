public class Salary {

    public int perDay;
    public int daysPerYear;
    public int hourlyRate;
    public int years;

    public Salary(int perDay, int daysPerYear, int hourlyRate, int years)
    {
        this.perDay = perDay;
        this.daysPerYear = daysPerYear;
        this.hourlyRate = hourlyRate;
        this.years = years;
    }

    public void Convert()
    {
        int salary = (this.perDay*this.daysPerYear) * this.hourlyRate;
        System.out.println("Annual Salary: " + salary);
    }

    public void PayBracket()
    {
        int salary = (this.perDay*this.daysPerYear) * this.hourlyRate;
        for(int i=1; i<=this.years; i++)
        {
            salary += (salary*0.1);
            System.out.println("Salary after " + i + " years: " + salary);
        }
    }
}
