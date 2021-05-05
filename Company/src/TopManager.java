public class TopManager implements  Employee {

    private Company company;

    TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        double monthSalary = company.getFixedSalary() + 30000;
        if (company.getIncome() > 10000000) {
            return monthSalary * 1.5;
        }
        else {
            return monthSalary;
        }

    }
}
