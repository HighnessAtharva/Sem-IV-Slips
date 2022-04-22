// Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword)

interface shape {
    final static float pi = 3.14f;
    float area(float r);
}

class Circle implements shape {
    public float area(float r) {
        return (3.14f * r * r);
    }
}

class sphere implements shape {
    public float area(float r) {
        return (2 * 3.14f * r * r);
    }
}

class Slip22 {
    public static void main(String args[]) {
        Circle cir = new Circle();
        sphere sp = new sphere();
        shape s;
        s = cir;
        System.out.println("Area of Circle:" + s.area(3));
        s = sp;
        System.out.println("Area of Sphere:" + s.area(5));
    }
}