
public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    // Вывести всех сотрудников
    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    // Средняя зарплата
    public double printAverageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee element : employees) {
            if (element == null) break;
            sum += element.getSalary();
            count++;
        }
         return count == 0 ? 0 : (double) sum / count;
//        if (count != 0) {
//            return (double) sum / count;
//        } else return false;
    }
    // Зарплата с налогами
    public void printTaxes(String type) {
        for (Employee e : employees) {
            if (e == null) break;

            int salary = e.getSalary();
            double tax;

            switch (type) {
                case "PROPORTIONAL":
                    tax = salary * 0.13;
                    break;

                case "PROGRESSIVE":
                    if (salary <= 150) {
                        tax = salary * 0.13;
                    } else if (salary <= 350) {
                        tax = salary * 0.17;
                    } else {
                        tax = salary * 0.21;
                    }
                    break;

                default:
                    System.out.println("Неизвестный налог");
                    return;
            }

            System.out.println(e.getSurname() + ": tax = " + tax);
        }
    }

    public void indexSalary(int department, int percent) {
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            if (e.getDepartment() != department) {
                continue;
            }
            int newSalary = e.getSalary() + (e.getSalary() * percent / 100);
            e.setSalary(newSalary);
        }
    }

    public void findDepartmentAndSalary(int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e == null) break;

            if (e.getDepartment() == department && e.getSalary() > salary) {
                System.out.println("Index: " + i);
                e.printShortInfo();
                break;
            }
        }
    }

    public void findEmployeesSalary(int wage, int employeeNumber) {
        int count = 0;
        int i = 0;

        while (i < employees.length && count < employeeNumber) {
            Employee e = employees[i];
            if (e == null) break;

            if (e.getSalary() < wage) {
                e.printShortInfo();
                count++;
            }
            i++;
        }
    }


    // Добавить сотрудника
    public boolean addEmployee (Employee employee) {
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }
}
//11


