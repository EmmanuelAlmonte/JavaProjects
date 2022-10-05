/*
* ElectronicPhotoAlbum.java
* last edited August 15, 2021 
* Created by Emmanuel Almonte.  
* This program is a photo gallery Display only.
* in a JFrame using a GridLayout
* It is an example of a one-time GUI, not defined as a class
* No events have been added to the GUI, it only shows components
*/


package electronicphotoalbum;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class ElectronicPhotoAlbum {
    public static void main(String[] args) {
        mainGridLayout();

    } // end of main.

    // mainGridLayout One time GUI.
    public static void mainGridLayout(){
        // Title for main_JFrame.
        String main_JFTitle = "Photo Gallery";

        // Create a JFrame to hold components.
        JFrame main_JFrame = new JFrame();

        // Grid Layout rows.
        int grid_rows = 5;

        // Grid columns.
        int grid_columns = 2;

        // Create a grid layout for frame - 5 rows and 2 columns.
        GridLayout main_Layout = new GridLayout(grid_rows, grid_columns);
        
        // Height gap for GridLayout.
        int hgap = 20;

        // Width gap for Grid Layout.
        int vgap = 20;

        //main_Layout assign grid gaps.
        main_Layout.setHgap(hgap);
        main_Layout.setVgap(vgap);

        // assign main_layout to be layout for main_JFrame.
        main_JFrame.setLayout(main_Layout);

        // Create text for button "Next".
        String next_button_text = "Next";

        // Create an Next button.
        JButton jbNext = new JButton(next_button_text);
        
        // Create a previous button.
        JButton jbPrevious = new JButton("Previous");

        // Create Labels for Pictures.
        ImageIcon right_first = new ImageIcon("Fox.jpeg");
        Image right_first_image = right_first.getImage();
        Image right_first_newimg = right_first_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        right_first = new ImageIcon(right_first_newimg);  // transform it back
        
        // Create images for Pictures.
        ImageIcon left_first = new ImageIcon("Lion.jpeg");
        Image left_first_image = left_first.getImage();
        Image left_first_img = left_first_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        left_first = new ImageIcon(left_first_img);  // transform it back
        
        // Create images for Pictures.
        ImageIcon right_sec = new ImageIcon("Lizard.jpeg");
        Image right_sec_image = right_sec.getImage();
        Image right_sec_newimg = right_sec_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        right_sec = new ImageIcon(right_sec_newimg);  // transform it back
        
        // Create images for Pictures.
        ImageIcon left_sec = new ImageIcon("Puma.jpeg");
        Image left_sec_image = left_sec.getImage();
        Image left_sec_img = left_sec_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        left_sec = new ImageIcon(left_sec_img);  // transform it back

        // Create images for Pictures.
        ImageIcon right_third = new ImageIcon("Cat.jpeg");
        Image right_third_image = right_third.getImage();
        Image right_third_newimg = right_third_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        right_third = new ImageIcon(right_third_newimg);  // transform it back
        
        // Create images for Pictures.
        ImageIcon left_third = new ImageIcon("Cheetah.jpeg");
        Image left_third_image = left_third.getImage();
        Image left_third_img = left_third_image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        left_third = new ImageIcon(left_third_img);  // transform it back
        
        // Left side of photo gallery, photo # 1
        JLabel left_first_photo = new JLabel(left_first);

        // Right side of photo gallery, photo # 2
        JLabel right_first_photo = new JLabel(right_first);

        // Left side of photo gallery, photo # 2
        JLabel left_sec_photo = new JLabel(left_sec);

        // Right side of photo gallery, photo # 2
        JLabel right_sec_photo = new JLabel(right_sec);

        // Left side of photo gallery, photo # 3
        JLabel left_third_photo = new JLabel(left_third);
        
        // Right side of photo gallery, photo # 3
        JLabel right_third_photo = new JLabel(right_third);

        // ADD COMPONENTS TO main_JFrame
        main_JFrame.add(left_first_photo); // add first left photo.

        main_JFrame.add(right_first_photo); // add first right photo.
        
        main_JFrame.add(left_sec_photo); // add second left photo. 

        main_JFrame.add(right_sec_photo); // add second right photo.

        main_JFrame.add(left_third_photo); // add left third photo.
        main_JFrame.add(right_third_photo); // Add right third photo.

        main_JFrame.add(jbNext); // Add the Next Button.
        main_JFrame.add(jbPrevious); // Add the previous Button. 

        // Set the title, size, location, and exit behavior for the JFrame.
        main_JFrame.setTitle(main_JFTitle); 
        main_JFrame.setSize(700, 700);     
        main_JFrame.setLocation(200, 1000);
        main_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the frame visible.
        main_JFrame.setVisible(true);

    }// end of mainGridLayout.
} // end of ElectronicPhotoAlbum.
