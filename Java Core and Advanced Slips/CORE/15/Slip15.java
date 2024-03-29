// Define an abstract class Shape with abstract methods area() and volume(). Write a java program to calculate area and volume of Cone and Cylinder.

import java.util.*;

abstract class Shape {
    //definiing PI as constant
    static final double PI= 3.14;
    abstract public void area();

    abstract public void vol();
}

class Cone extends Shape {
    int r, s, h;

    Cone(int r, int s, int h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }

    public void area() {
        System.out.println("Area of Cone = " + (PI * r * s));
    }

    public void vol() {
        System.out.println("volume of Cone = " + (PI * r * r * h) / 3);
    }
}

class Cylinder extends Shape {
    int r, h;

    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public void area() {
        System.out.println("Area of Cylinder = " + (2 * PI * r * h));
    }

    public void vol() {
        System.out.println("volume of Cylinder = " + (PI * r * r * h));
    }
}

class Sphere extends Shape {
    int r, h;

    Sphere(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public void area() {
        System.out.println("Area of Sphere = " + (4 * PI * r * r));
    }

    public void vol() {
        System.out.println("volume of Sphere = " + ((4 / 3) * r * r * r * PI));
    }
}

class Slip15 {

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius, side and height for cone");
        int r = sc.nextInt();
        int s1 = sc.nextInt();
        int h = sc.nextInt();
        Shape s;
        Cone c = new Cone(r, s1, h);
        c.area();
        c.vol();

        System.out.println("Enter radius, height for cylinder");
        //overwrite the value of the variable r and h!
        r = sc.nextInt();
        h = sc.nextInt();
        s = new Cylinder(r, h);
        s.area();
        s.vol();

        System.out.println("Enter radius, height for Sphere");
        r = sc.nextInt();
        h = sc.nextInt();
        s = new Sphere(r, h);
        s.area();
        s.vol();

        sc.close();
    }
}