import java.util.Objects;

public class Employee {
    //Объявление полей
    private String surname; //фамилия
    private String firstName; // имя
    private String middleName; // отчество
    private String department; //отдел
    private int salary; // зарплата
    private static int id = 0;
    //Конструктор
public Employee (String surname, String firstName, String middleName, String department, int salary) {
    this.surname = surname;
    this.firstName = firstName;
    this.middleName = middleName;
    this.department = department;
    this.salary = salary;
    id++;
}
//Геттеры
public int getId() {
    return  id;
}
public String getSurname() {
    return this.surname;
}
public String getFirstName() {
    return  this.firstName;
}
public String getMiddleName() {
    return this.middleName;
}
public String getDepartment() {
    return this.department;
}
public int getSalary() {
    return this.salary;
}
//Сеттеры
public void setDepartment(String department) {
    this.department = department;
}
public void setSalary(int salary) {
    this.salary = salary;
}
    //Реализовываю в классе Employee контракт equals
@Override
public boolean equals(Object o) {
   if (this == o) {
       return true;
   }
   if (o == null || this.getClass() != o.getClass()) {
       return false;
   }
   Employee salaries = (Employee) o;
   return Objects.equals(this.salary, salaries.salary);
   }
//Вывод данны х через стринг
@Override
public String toString() {
    return "id = " + getSalary() +
           ", Фамилия = " + getSurname() +
           ", Имя = " + getFirstName() +
           ", Отчество = " + getMiddleName() +
           ", отдел = " + getDepartment() +
           ", зарплата = " + getSalary();
}
public void printShortInfo() {
    System.out.println("Имя = " +getSurname()+ ", зарплата = " + getSalary());
}
//11






}
