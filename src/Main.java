

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();
        employee.addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 200));
        employee.addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 200));

        employee.printAllEmployees();
        employee.printAverageSalary();
        employee.printTaxes("PROPORTIONAL");
        employee.printTaxes("PROGRESSIVE");
        employee.indexSalary(1, 10);
        employee.findDepartmentAndSalary(1, 100);
        employee.findEmployeesSalary(100, 2);
    }
}

