package SRP;

public class Employee{

  private int employeeId;
  private String department;
  private double salary;

  public Employee(int employeeId, String department, double salary) {
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
  public void sendMail(){
    System.out.println("Sending mail.....");
  }
}