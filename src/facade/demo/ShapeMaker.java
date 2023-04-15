/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facade.demo;

/** Uses the concrete classes Circle, Rectangle and Square to delegate user calls and draw the respective shapes
  * 
  * @author Gunjit Arora
  * @version 1.0
  */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public Shape getCircle() {
        return circle;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public Shape getSquare() {
        return square;
    }
    
    /** Initializes the shape objects
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    /** Executes the draw() method of the Circle class
     */
    public void drawCircle() {
        System.out.println(circle.draw());
        
    }
    
    /** Executes the draw() method of the Rectangle class
     */
    public void drawRectangle() {
        System.out.println(rectangle.draw());
        
    }
    
    /** Executes the draw() method of the Square class
     */
    public void drawSquare() {
        System.out.println(square.draw());
        
    }    
}