/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singletondemo;

import org.junit.Test;
import static org.junit.Assert.*;

/** Class used to test the SingleObject class
 *
 * @author Gunjit Arora
 * @version 1.0
 * 
 */
public class SingleObjectTest {

    /**
     * Test of getInstance method by making two objects and checking if they are the same or not; assertEquals test should pass for a successful Singleton object.
     */
    @Test
    public void testGetInstance() {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        object1.setObjectNumber(12);
        object2.setObjectNumber(29);
        
        /** An integer is set to 12 for object1 and it is then set as 29 for object2. 
         * Later when the same number for object1 is tested with 29, the test is successful. Thus, proving it is the same object.
         */
        
        assertEquals(object1.getObjectNumber(), 29);
        assertEquals(object1, object2);
    }    
}