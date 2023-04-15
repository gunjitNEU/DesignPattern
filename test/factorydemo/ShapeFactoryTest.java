/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package factorydemo;


import org.junit.Test;
import static org.junit.Assert.*;

/** Class used to test the SingleObject class
 *
 * @author Gunjit Arora
 * @version 1.0
 * 
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    /**
     * Test of getShape method, of class ShapeFactory; this is checked by making shape objects of different type by passing appropriate parameters and then comparing it with the String assosciated with that particular shape.
     */
    @Test
    public void testGetShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("Square");
        
        
        assertEquals(shape1.draw(), "Circle Drawn");
        assertEquals(shape2.draw(), "Rectangle Drawn");
        assertEquals(shape3.draw(), "Square Drawn");
    }
}
