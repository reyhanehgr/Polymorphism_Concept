
package com.mycompany.mavenproject6;

public class Mavenproject6 {

    public static void main(String[] args) {
        
        Shape[] shapes= new Shape[2];
        shapes[0] = new Rectangle(10 , 20, "White",false);
        shapes[1] = new Square(15, "Black", false);
        
        for(Shape shape:shapes){
            System.out.format("%s \n", shape);
            System.out.format("Area: %s , Perimeter: %s \n", shape.get_Area(),shape.get_Perimeter());
        }
        
        
    }
}
