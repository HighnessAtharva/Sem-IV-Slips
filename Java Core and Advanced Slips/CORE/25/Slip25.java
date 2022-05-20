// Slip25.Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, which will return salaryof manager by adding traveling allowance, house rent allowance etc.

class Employee {
    String name;
    int sal;
    Employee(String n, int s) {
        this.name = n;
        this.sal = s;
    }
    int getSalary() {
        return this.sal;
    }

}

class Manager extends Employee{
    int hra, ta;

    Manager(String n, int sal, int h, int t) {
        super(n, sal);
        this.hra = h;
        this.ta = t;
    }

    int getSalary() {
        return (super.getSalary() + this.hra + this.ta);
    }
}

public class Slip25 {
    public static void main(String args[]) {
        Manager m1 = new Manager("Raj", 20000, 200, 800); 
        System.out.println("Salary of Manager= " + m1.getSalary());
    }
}