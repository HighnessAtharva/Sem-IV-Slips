// Slip25.Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, which will return salaryof manager by adding traveling allowance, house rent allowance etc.


import java.io.*;

class Emp {
    String nm;
    float sal;
    int no;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void accept() throws IOException {
        System.out.println("Enter emp no");
        no = Integer.parseInt(br.readLine());
        System.out.println("Enter emp name");
        nm = br.readLine();
        System.out.println("Enter sal");
        sal = Float.parseFloat(br.readLine());
    }

    float getsalary() {
        return sal;
    }

    void display() throws IOException {
        System.out.println("id = " + no + "\n name = " + nm + "\n salary= " + sal);
    }
}

class Manager extends Emp {
    float tr, ha, t_sal;

    void accept() throws IOException {
        super.accept();
        System.out.println("Enter travelling all");
        tr = Float.parseFloat(br.readLine());
        System.out.println("Enter house rent allo");
        ha = Float.parseFloat(br.readLine());
        float s = super.getsalary();
        t_sal = s + tr + ha;
    }

    float getsalary() {
        return t_sal;
    }

    void display() throws IOException {
        super.display();
        System.out.println("total salary =" + getsalary());
    }

    public static void main(String a[]) throws IOException {
        Manager ob = new Manager();
        ob.accept();
        ob.display();
    }

    class Slip25 {
        public static void main(String args[]) throws IOException {
            Manager m1 = new Manager(); // parameter as(Name,salary,HRA,TA)
            m1.accept();
            System.out.println("Salary of Manager= ");  
            m1.display();
        }
    }
}
