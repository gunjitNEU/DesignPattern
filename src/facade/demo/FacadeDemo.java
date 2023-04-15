/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package facade.demo;

/** The Main Demo class for the Project
 * 
 * 
 * @author Siddharth Vyas
 * @version 1.0
 */
public class FacadeDemo {

    /** The main method for this Demo
     * 
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
