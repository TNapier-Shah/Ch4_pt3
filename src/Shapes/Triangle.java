/**Shapes: Triangle
 * * @author Taj Napier-Shah
 *  * @version 2.0
 *  * ITEC 2150 Spring 2024
 *  * Date: April 5, 2024
*/

package Shapes;

public class Triangle {
    private double x;
    private double y;
    private double z;

    public Triangle(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean checkSides() throws IllegalTriangleSideException{

        if(x + y > z && y + z > x && x + z > y){
            return true;
        }else{
            throw new IllegalTriangleSideException("This triangle does not connect");
        }
    }

    public static void main(String[] args) throws IllegalTriangleSideException {

        try {

            Triangle tri = new Triangle(3, 4, 5);
            System.out.println("Testing..." + tri.checkSides());

            Triangle triangle = new Triangle(24, 32, 40);
            System.out.println("beep beep..." + triangle.checkSides());

            Triangle angle = new Triangle(1, 7, 9);
            System.out.println("Connecting..." + angle.checkSides());
        }catch(IllegalTriangleSideException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
