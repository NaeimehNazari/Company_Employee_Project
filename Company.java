import java.util.Set;
import java.util.LinkedHashSet; //a set that does not allow duplicates and keeps the original insertion order.

    public class Company {
        private Set<Employee> allEmployees;

    public Company (){
            allEmployees = new LinkedHashSet<Employee>();
        }


    public void addEmployee(Employee emp, int salary){
            emp.getSalary();
            allEmployees.add(emp);
        }

        

    public Employee findLeastBusy(int depId) {
        Employee employeeObj = null;
        int minTasksCounter = Integer.MAX_VALUE;

        for (Employee employee : allEmployees) {
            if (employee.getDepartmentId() == depId) {
                if (employee.getAssignedTasksNum() < minTasksCounter) {
                    minTasksCounter = employee.getAssignedTasksNum();
                    employeeObj = employee;
                }
            }
        }

        return employeeObj;
        }



    public void assignTask(String task, int depId){
        
        Employee employeeObj =  findLeastBusy(depId); //Since you're already inside Company, you can call the method directly
        employeeObj.addTask(task);
        //getAssignedTasksNum() returns the current size of the list, and addTask(task) automatically increases that size when it adds a task.
        }




    public void raiseSalary(int percentage) {
        int maxTasksCounter = 0;

        // First loop: find the highest number of processed tasks
        for (Employee employee : allEmployees) {
            if (employee.getTotalProcessed() > maxTasksCounter) {
                maxTasksCounter = employee.getTotalProcessed();
            }
        }

        // Second loop: handle every employee tied for the highest
        for (Employee employee : allEmployees) {
            if (employee.getTotalProcessed() == maxTasksCounter) {
                int newSalary = (int) Math.round(employee.getSalary() * (1 + percentage / 100.0));

                employee.setSalary(newSalary);
                System.out.println(employee);
            }
        }
        }
    }

