public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String surname, String phone, int atlyginimas, String socDraudimoNr) {
        super(name, surname, phone, atlyginimas, socDraudimoNr);
        bonus = 0;
    }

    public void awardBonus(double bonus) {
        this.bonus += bonus;
    }

    @Override
    public double pay() {
        double tmpBonus = bonus;
        bonus = 0;
        return atlyginimas + tmpBonus;
    }
}
