public class Employee extends StaffMember {
    protected int atlyginimas;
    protected String socDraudimoNr;

    public Employee(String name, String surname, String phone, int atlyginimas, String socDraudimoNr) {
        super(name, surname, phone);
        this.atlyginimas = atlyginimas;
        this.socDraudimoNr = socDraudimoNr;
    }

    @Override
    public double pay() {
        return atlyginimas;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Phone: " + phone + ", Soc. Draudimo Nr. " + socDraudimoNr;
    }
}
