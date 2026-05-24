

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EmployeeBook employee = new EmployeeBook();
    employee.addEmployee(new Employee("Иванов","Иван", "Иванович", 1,200));
    employee.addEmployee(new Employee("Иванов","Иван", "Иванович", 1,200));

    employee.printAllEmployees();
    employee.printAverageSalary();
    employee.printTaxes("PROPORTIONAL");
    employee.printTaxes("PROGRESSIVE");
    employee.indexSalary(1,10);
    employee.findDepartmentAndSalary(1,100);
    employee.findEmployeesSalary(100,2);
}
//11

