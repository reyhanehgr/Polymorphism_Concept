
package com.mycompany.mavenproject6;

public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(){
        this(0,0);
    }
    public Rectangle(double width, double height){
     super();
     this.height=height;
     this.width=width;
    }
    public Rectangle(double width, double height ,String color, boolean filled){
      super(color,filled);
     this.height=height;
     this.width=width;  
    }
    public double get_width(){
        return this.width;
    }
    public void set_width(double width){
        this.width=width;
    }
    public double get_height(){
        return this.height;
    }
    public void set_height(double height){
        this.height=height;
    }
    @Override
    public double get_Area(){
        return width*height;
    }
    @Override
    public double get_Perimeter(){
        return 2*(width+height);
    }

   
    public String toString(){
        return "Rectangle Shape [size:"+this.get_width()+" * "+ this.height +", color :" + this.get_color()+ 
                ", filled : "+ this.get_filled()+"]";
    }
}
