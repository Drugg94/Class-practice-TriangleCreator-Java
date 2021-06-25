package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(3, 4, 5);
        Triangle triangleB = new Triangle(7, 8, 9);

        System.out.println("The area of triangleA is " + triangleA.getArea() + ".");
        System.out.println("The circle length of triangleA is " + triangleA.getCircleLength() + ".");
        System.out.println("The area of triangleB is " + triangleB.getArea() + ".");
        System.out.println("The circle length of triangleB is " + triangleB.getCircleLength() + ".");
    }
}

//Create class named triangle that makes a three sided triangle object.
class Triangle{
    //Declare variables used in the Triangle object.
    double edgeA, edgeB, edgeC;

    //Default constructor in case there are no sides declared.
    Triangle(){
        edgeA = 0.00; edgeB = 0.00; edgeC = 0.00;
    }

    //Constructor for when sides are declared.
    Triangle(double sideA, double sideB, double sideC){
        edgeA = sideA; edgeB = sideB; edgeC = sideC;
    }

    //Constructor in case the sides are declared with integers instead of doubles.
    Triangle(int sideA, int sideB, int sideC){
        edgeA = sideA; edgeB = sideB; edgeC = sideC;
    }

    //Function that retrieves the area and returns it. This function utilizes the "Hero's Formula" in order to
    //calculate the area of the triangle with only the three sides. The math utility is also used in order to get
    //the square root.
    double getArea(){
        double area = 0.00;
        double semiperimeter = 0.00;
        double tempNumb = 0.00;
        semiperimeter = (edgeA+edgeB+edgeC)/2;
        tempNumb = (semiperimeter*(semiperimeter-edgeA)*(semiperimeter-edgeB)*(semiperimeter-edgeC));
        area = Math.sqrt(tempNumb);
        return area;
    }

    //Function to calculate the perimeter of the triangle object and then return it.
    double getCircleLength(){
        double perimeter=0.00;
        perimeter=edgeA+edgeC+edgeB;
        return perimeter;
    }
}
