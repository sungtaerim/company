import java.util.*;

public class Company {

    private List<Employee> employeeArrayList = new ArrayList<>();
    private final double fixedSalary;

    public Company(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public List<Employee> getEmployeeArrayList() {
        return new ArrayList<>(employeeArrayList);
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public double getIncome() {
        double income = 0;
        for (Employee employee : employeeArrayList) {
            if (employee instanceof Manager) {
                income += ((Manager) employee).getSalesCount();
            }
        }
        return income;
    }

    public void hire(Employee employee) {
        employeeArrayList.add(employee);
    }

    public void fire(Employee employee) {
        employeeArrayList.remove(employee);
    }

    public void hireAll(ArrayList<Employee> employee) {
        employeeArrayList.addAll(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employeeArrayList);
        Collections.reverse(employeeArrayList);
        return employeeArrayList.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employeeArrayList);
        return employeeArrayList.subList(0, count);
    }

}
