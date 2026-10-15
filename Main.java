public class Main{
public static void main(String[] args) {
    Company company = new Company();

    Employee emp1 = new Employee("Alice", 3000, 1);
    Employee emp2 = new Employee("Bob", 4000, 1);
    Employee emp3 = new Employee("Charlie", 3500, 2);

    // Give Alice 2 processed tasks
    emp1.processTask();
    emp1.processTask();

    // Give Bob 3 processed tasks
    emp2.processTask();
    emp2.processTask();
    emp2.processTask();

    // Give Charlie 3 processed tasks
    emp3.processTask();
    emp3.processTask();
    emp3.processTask();

    // Add employees to the company
    company.addEmployee(emp1, 100);
    company.addEmployee(emp2,200);
    company.addEmployee(emp3,3300);

    System.out.println("Before the raise:");
    System.out.println(emp1);
    System.out.println(emp2);
    System.out.println(emp3);

    System.out.println("\nAfter the raise:");
    company.raiseSalary(20);
}
}