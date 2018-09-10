public class Savings {

    int weeks;
    int finalValue;

    public Savings(int weeks, int finalValue){
        this.weeks = weeks;
        this.finalValue = finalValue;
    }

    public void Multiply()
    {
        for(int i=1; i<=this.weeks; i++)
        {
            System.out.println("Week " + i + ": " + i*this.finalValue);
        }
    }
}
