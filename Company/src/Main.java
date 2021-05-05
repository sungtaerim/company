import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(20000);

        ArrayList<Employee> managerList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            managerList.add(new Manager(company));
        }

        ArrayList<Employee> operatorList = new ArrayList<>();
        for (int i = 0 ; i < 180; i++) {
            operatorList.add(new Operator(company));
        }

        ArrayList<Employee> topManagerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topManagerList.add(new TopManager(company));
        }

        company.hireAll(managerList);
        company.hireAll(operatorList);
        company.hireAll(topManagerList);

        getSalaryStaff(company);

        System.out.println("\nСотрудников до увольнения: " + company.getEmployeeArrayList().size());

        List<Employee> employeeList = company.getEmployeeArrayList();
        for (int i = 0; i < 200; i++) {
            company.fire(employeeList.get(i));
        }

        System.out.println("Сотрудников после увольнения: " + company.getEmployeeArrayList().size());

        getSalaryStaff(company);
    }

    private static void getSalaryStaff(Company company) {
        System.out.println("15 самых высоких зарплат: ");
        for (Employee employee : company.getTopSalaryStaff(15)){
            System.out.println(employee.getMonthSalary());
        }

        System.out.println("\n30 самых низких зарплат: ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee.getMonthSalary());
        }
    }
}
