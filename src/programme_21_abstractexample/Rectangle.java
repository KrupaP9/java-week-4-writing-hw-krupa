package programme_21_abstractexample;
/**
 * 2. Create a second class name Rectangle which extends by Shape.
 */
public class Rectangle extends Shape {
    public void draw(){
        //implement body of abstract method
        System.out.println("drawing rectangle");
    }
    //trial of method overriding
    public void myMethod(){
        System.out.println("Re-test");
    }

}
