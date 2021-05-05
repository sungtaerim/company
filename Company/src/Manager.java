import java.util.Random;

public class Manager implements  Employee {

    private double salesCount;
    private Company company;

    Manager(Company company) {
        this.company = company;
        salesCount = 115000 + new Random().nextInt() % (145000 - 115000);
    }

    public double getSalesCount() {
        return salesCount;
    }

    @Override
    public double getMonthSalary() {
        return company.getFixedSalary() + salesCount * 0.05;
    }
}
