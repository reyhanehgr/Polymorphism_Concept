
package com.mycompany.mavenproject6;

public abstract class Shape{
    private String color;
    private boolean filled;
    
    public Shape(){
        this("",false);
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String get_color(){
        return this.color;
    }
    public void set_color(String color){
        this.color=color;
    }
    public boolean get_filled(){
        return this.filled;
    }
    public void set_filled(boolean filled){
        this.filled=filled;
    }
    @Override
    public String toString()
    {
        return "Shape [color :" + this.get_color()+ ", filled : "+ this.get_filled()+ "]";
    }
    public abstract double get_Area();
    public abstract double get_Perimeter();
      
}
