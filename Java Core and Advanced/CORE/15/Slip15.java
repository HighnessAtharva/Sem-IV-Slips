// Define an abstract class Shape with abstract methods area() and volume(). Write a java program to calculate area and volume of Cone and Cylinder.

import java.util.*;
abstract class Shape {
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
        System.out.println("Area of Cone = " + (3.14 * r * s));
    }

    public void vol() {
        System.out.println("volume of Cone = " + (3.14 * r * r * h) / 3);
    }
}

class Cylinder extends Shape {
    int r, h;

    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public void area() {
        System.out.println("Area of Cylinder = " + (2 * 3.14 * r * h));
    }

    public void vol() {
        System.out.println("volume of Cylinder = " + (3.14 * r * r * h));
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
        s = new Cone(r, s1, h);
        s.area();
        s.vol();
        System.out.println("Enter radius, height for cylinder");
        r = sc.nextInt();
        h = sc.nextInt();
        sc.close();
        s = new Cylinder(r, h);
        s.area();
        s.vol();
    }
}