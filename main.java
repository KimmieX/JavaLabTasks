 public class Main {
    public static void main(String[]args){
        CommissionEmployee employee = new CommissionEmployee("Kimberly", "Hatsu", "123456789", 10000.00, 0.5);
        System.out.println(employee);

        employee.setGrossSales(15000.00);
        employee.setCommissionRate(0.6);
        
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);

        System.out.printf("%nEarnings: $%.2f%n", employee.earnings());

        try {
            employee.setGrossSales(-5000.00);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException: %s%n", e.getMessage());
        }

        try {
            employee.setCommissionRate(1.5);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException: %s%n", e.getMessage());
        }
    }
}