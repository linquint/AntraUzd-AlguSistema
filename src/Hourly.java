public class Hourly extends StaffMember {
    private int hoursWorked;
    private double rate = 11.01;

    public Hourly(String name, String surname, String phone) {
        super(name, surname, phone);
        hoursWorked = 0;
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    @Override
    public double pay() {
        int tmpHours = hoursWorked;
        hoursWorked = 0;
        return rate * tmpHours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
