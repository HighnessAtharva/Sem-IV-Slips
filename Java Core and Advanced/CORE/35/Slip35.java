import java.util.Scanner;

class AgeException extends Exception {

    public AgeException(String str) {
        System.out.println(str);
    }
}

class Employee {
    Employee(int eno, String name, int age, int salary) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age should be greater than 18");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Number: " + eno);
            System.out.println("Salary: " + salary);
        }
    }

}

public class Slip35 {
    public static void main(String[] args) throws AgeException {
        try {
            System.out.println("------For Employee 1------");
            Employee e1 = new Employee(1, "Raj", 19, 10000);
            System.out.println("------For Employee 2-----");
            Employee e2 = new Employee(2, "Raju", 2, 20000);
        } catch (AgeException a) {
            System.out.println(a);
        }
    }
}