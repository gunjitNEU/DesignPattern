/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package singletondemo;


 /** Main Demo Class for the Singleton Package
  * 
  * @author Gunjit Arora
  * @version 1.0
 */
public class SingletonDemo {
    
    /** 
     * The main method for this Demo.
     */
    public static void main(String[] args) {
        SingleObject onlyObject = SingleObject.getInstance();
        onlyObject.showMessage();
    }
}
