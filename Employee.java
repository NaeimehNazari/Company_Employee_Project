import java.util.List;
import java.util.ArrayList;


public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks; //inja typesh List, baghe jaha ArrayList
    private int totalProcessed;

    public Employee(String name, int salary, int departmentId){
        this.name=name;
        this.salary=salary;
        this.departmentId=departmentId;
        totalProcessed=0;
        assignedTasks = new ArrayList<String>(); //avvalesh var nemikhad!
    }

    public int getTotalProcessed() {
        return totalProcessed;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public int getAssignedTasksNum() {
       return assignedTasks.size();
    }
    
    public void setSalary(int newSalary) {
        salary = newSalary; // sets the value of salary to newSalary. 
    }
    public void processTask() {
        if (assignedTasks.size() > 0)
        {
        String t = assignedTasks.get(0);
        System.out.println("processing task " + t);
        assignedTasks.remove(t);
        totalProcessed++;
        }
        else{
            System.out.println("no tasks to process");
        }
    }
    public String toString(){
        return ("name: " + name + ", department Id: " + departmentId + ", salary: " + salary);
    }
    public void addTask(String newTask){
        assignedTasks.add(newTask);
    }
}
