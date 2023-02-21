public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Employee e1 = new Employee("Doris", "Humphries", "868256095", 1200, "SD4923499");
        Employee e2 = new Employee("Leona", "Fowler", "863681716", 1400, "SD2246179");
        Trainee t1 = new Trainee("Aaron", "Allison", "861798740");
        Executive ex1 = new Executive("Shirley", "McCaulley", "861402756", 2800, "SD3700369");
        Hourly h1 = new Hourly("Alvin", "Walter", "861029650");
        Hourly h2 = new Hourly("William", "Kirk", "868926479");

        staff.addStaffMember(e1);
        staff.addStaffMember(e2);
        staff.addStaffMember(t1);
        staff.addStaffMember(ex1);
        staff.addStaffMember(h1);
        staff.addStaffMember(h2);

        ex1.awardBonus(150);
        h1.addHours(10);
        h2.addHours(20);

        double total = staff.payDay();
        System.out.println("Iš viso išmokėta: " + total);
    }
}