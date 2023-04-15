/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factorydemo;

/**
 * Factory class that will allow for the creation of the objects without exposing the logic behind it.
 * 
 * @author Gunjit Arora
 * @version 1.0
 */
public class ShapeFactory {
    
    /**
    * Method that will return a Shape depending upon the parameter received.
    * 
    * @param shapeType A String value that will determine what Object will be returned, the values it can take are "Circle", "Rectangle" and "Square" 
    * @return The required Shape object
    */
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        return null;
    }   
}
