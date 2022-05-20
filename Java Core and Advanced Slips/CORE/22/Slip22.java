// Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword)

interface shape {
    final float pi = 3.14f;
    float area(float r);
}

class Circle implements shape {
    public float area(float r) {
        return (pi * r * r);
    }
}

class Sphere implements shape {
    public float area(float r) {
        return (2 * pi * r * r);
    }
}

class Slip22 {
    public static void main(String args[]) {
        Circle cir = new Circle();
        Sphere sp = new Sphere();
        System.out.println("Area of Circle:" + cir.area(3));
        System.out.println("Area of Sphere:" + sp.area(5));
    }
}