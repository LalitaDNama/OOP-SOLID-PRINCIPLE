package SRP;

public class EmployeeSRP {
    private int employeeId;
    private String department;
    private double salary;

    public EmployeeSRP(int employeeId, String department, double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment(int employeeID){
        this.employeeId=employeeID;
        return this.department;
    }
    public double updateSalary(double salary){
        this.salary=salary;
        return this.salary;
    }
}
