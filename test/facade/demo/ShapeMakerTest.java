/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package facade.demo;

import org.junit.Test;
import static org.junit.Assert.*;

/** Class used to test the ShapeMaker class
 *
 * @author Gunjit Arora
 * @version 1.0
 * 
 */
public class ShapeMakerTest {
      ShapeMaker shapeMaker = new ShapeMaker();
    
    public ShapeMakerTest() {
    }
    
    /**
     * Test of drawCircle method, of class ShapeMaker; the tests are all checking the Strings that are getting sent by the respective Shape c;asses.
     */
    @Test
    public void testDrawCircle() {
        String message = shapeMaker.getCircle().draw();
        assertEquals(message, "Circle Drawn");
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        String message = shapeMaker.getRectangle().draw();
        assertEquals(message, "Rectangle Drawn");
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        String message = shapeMaker.getSquare().draw();
        assertEquals(message, "Square Drawn");
    }
}
