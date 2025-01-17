public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(grossSales); 
        setCommissionRate(commissionRate); 
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s %s%nSocial Security Number: %s%nGross Sales: %.2f%nCommission Rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}