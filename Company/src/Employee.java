public interface Employee extends Comparable<Employee> {

    double getMonthSalary();

    default int compareTo(Employee employee) {
        return Double.compare(getMonthSalary(), employee.getMonthSalary());
    }
}
