/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package factorydemo;

/** Main Demo Class for the FactoryDemo Package
  * 
  * @author Gunjit Arora
  * @version 1.0
 */
public class FactoryDemo {

    /** 
     * The main method for this Demo.
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("Square");
        
        
        System.out.println(shape1.draw());;
        System.out.println(shape2.draw());
        System.out.println(shape3.draw());
    }
}