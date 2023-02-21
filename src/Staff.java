public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[64];
    }

    public void addStaffMember(StaffMember staff) {
        int index = 0;
        while (staffList[index] != null) {
            index++;
        }
        staffList[index] = staff;
    }

    public double payDay() {
        double totalPay = 0;
        int i = 0;
        StaffMember staffMember;

        System.out.println("Išmokėti atlyginimai:");
        while ((staffMember = staffList[i]) != null) {
            double payment = staffMember.pay();
            totalPay += payment;
            System.out.printf("\n%s\nSumokėta: %.2f\n", staffMember, payment);
            i++;
        }
        return totalPay;
    }
}
