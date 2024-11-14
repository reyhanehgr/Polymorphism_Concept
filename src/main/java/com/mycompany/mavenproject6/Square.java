
package com.mycompany.mavenproject6;
public class Square extends Rectangle {
    
    public Square(){
        super();
    }public Square(double a){
        super(a,a);
    }
    public Square(double a,String color, boolean filled){
        super(a,a,color,filled);
    }
    
    @Override
    public void set_width(double width){
        super.set_width(width);
        super.set_height(width);
    }
    @Override
    public void set_height(double height){
        super.set_width(height);
        super.set_height(height);
    }
    @Override
    public String toString(){
        return "Square Shape [size:"+this.get_width()+ ", color :" + this.get_color()+ 
                ", filled : "+ this.get_filled()+ "]";
    }
}
