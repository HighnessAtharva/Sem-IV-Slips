// Slip25.Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, which will return salaryof manager by adding traveling allowance, house rent allowance etc.

class Employee {
    String name;
    int sal;

    Employee() {
        name = null;
        sal = 0;
    }

    Employee(String n, int s) {
        name = n;
        sal = s;
    }

    int getSalary() {
        return sal;
    }

}

class Manager extends Employee

{
    int hra, ta;

    Manager() {
        super();
        hra = ta = 0;
    }

    Manager(String n, int sal, int h, int t) {
        super(n, sal);
        hra = h;
        ta = t;
    }

    int getSalary() {
        return (super.getSalary() + hra + ta);
    }
}

class Slip25 {
    public static void main(String args[]) {
        Manager m1 = new Manager("Raj", 20000, 200, 800); // parameter as(Name,salary,HRA,TA)
        System.out.println("Salary of Manager= " + m1.getSalary());
    }
}