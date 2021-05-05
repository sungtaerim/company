public class Operator implements  Employee {

    private Company company;

    Operator(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return company.getFixedSalary();
    }
}
