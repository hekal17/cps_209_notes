
import java.util.ArrayList;

public class feb_3 {

// Type of an ArrayList must be a class

// Under the hood of arrays, it looks for more space when it runs out and moves all data

// Factories are used to create objects

// Nested and local loops are not for everyday use but still useful

// Nested class: class inside another class; class B can be defined in class A

// Local class: class inside a method; class B can be defined in method A

// Local classes are only visible inside the method they are defined in; No need to sepcify class as public

// A local class can access all the variables and methods of the enclosing class

// Nested classes can access all the variables of the enclosing class but cannot modify them

public static class Persondata {
    int day;
    int month;
    int year;

    public Persondata(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}


public static void main(String[] args) {
    
    Persondata p = new Persondata(5, 5, 2003);

    int [] Persondata = {5, 5, 2003};

    int month = Persondata[1];
}


// We create inner classes to group stuff together that we care about internally

// eg. point and pointlist. pointlist is a list of points in the form of a class and  
// point is a class within it that represents a point

public class PointList {

private static int nPts = 0;
public ArrayList<Point> points = new ArrayList<Point>();

    public class Point {
        public int x, y;
        public Point(int nx, int ny) {
            x = nx; y = ny;
            nPts++;
        }
    }
}

// Shadowing: when a variable in a nested class has the same name as a variable in the outer class

// Avoid shadowing by using this.variableName or using a different name

// A class may have one superclass, but any number of subclasses




















}
