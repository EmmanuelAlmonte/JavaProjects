/* CSCI 111 Fall 2020
 * Last edited dec 15
 * Graphics program which draws home by overriding the paint method() in the subclass..
 * The main() method displays the canvas with our graphihcs in a JFrame.
 * The Method draws a home.
 * @author Emmanuel Almonte
 */

package javagraphicsp;


import javax.swing.*;
import java.awt.*;
// start graphics class
public class JavaGraphicsP {
    // main method
    public static void main(String[] args)
    {

        // create a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // set up a JFrame to display canvas
        JFrame frame = new JFrame();
        frame.setTitle("Home");
        frame.setSize(600, 600);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame
        frame.getContentPane().add(canvas1);
        frame.setVisible(true);

    } // end main()

} // end class JavaGraphicsP

// Canvas class
class MyCanvas extends Canvas
{
    //start MyCanvas constructor
    public MyCanvas()
    {
    }  // end MyCanvas() constructor

    public void paint(Graphics d)
    {
        // create home rect
        d.setColor(Color.RED);
        d.drawRect(150, 125, 350, 300);
        d.fillRect(150, 125, 350, 300);// color in home
        d.setColor(Color.BLACK);// set color for door
        d.drawRect(300, 300, 50, 125);// this is the door for the home
        d.fillRect(300, 300, 50, 125);// color in door
        d.drawOval(330, 370, 10, 10);// the door knob
        d.setColor(Color.WHITE);// change color for door knob
        d.fillOval(330, 370, 10, 10);// fill in color
        d.drawRect(190, 150, 75, 75 );// draws window
        d.fillRect(190, 150, 75,75 );// color in window
        d.drawRect(390, 150, 75,75 );// draws second window
        d.fillRect(390,150,75,75);// colors second window

        d.setColor(Color.BLACK);// color for roof of home
        Polygon poly = new Polygon();// create obj for roof of home
        poly.addPoint(325, 0);// add first point for roof
        poly.addPoint(150, 125);// add 2nd point for roof
        poly.addPoint(500, 125);// add third point for roof
        d.fillPolygon(poly);
    }  // end paint()

} // end class MyCanvas
