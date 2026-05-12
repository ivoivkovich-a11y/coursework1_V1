public class EmployeeBook {
   static private Employee[] book = new Employee[10];
public boolean asdd(Employee asd) {
    if (asd == null) return false;
    for (int i = 0; i < book.length; i++) {
        if (book[i] == null) {
            book[i] = asd;
        }
    }
 //11
}

}
