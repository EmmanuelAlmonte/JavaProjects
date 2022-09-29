package guipractice;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;


;public class GUIPractice {
    public static void main(String[] args) {
        mainGridLayout();
    }

    // GridLayout One time GUI.
    public static void mainGridLayout(){
        // Title for main_JFrame.
        String main_JFTitle = "Grid Layout Demo";
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
        
        // Create JlName_text for jlName Label.
        String name_text = "Please enter your name:";

        // Create a label with text "please enter your name:".
        JLabel jlName = new JLabel(name_text);

        // Create a text field for name.
        JTextField jtfName = new JTextField(name_text);
        jtfName.setForeground(Color.gray);

        // Create text for Radio Button, Statisics.
        String stat_text = "Statistics";

        // Create a Radio button for Statistics.

        JRadioButton jrbStat = new JRadioButton(stat_text);

        // Create text for radio button for linear algebra.
        String linear_text = "Linear Algebra";

        // Create a radion button for Linear Algebra.
        JRadioButton jrbLinear = new JRadioButton(linear_text);

        // Create a check box text for Computer Science.
        String csci_text = "Computer Science";

        // Create a check box for Computer Science.

        JCheckBox jcbCSCI = new JCheckBox(csci_text);

        // Create a default slide with no labels.

        JSlider jlsSample = new JSlider();
        
        // create a String array for the list box and combo box.
        String[] languages = new String[] {"Java", "C++", "Python", "Visual Basic"};
        
        // Create a list using the language array.
        JList jlLanguages = new JList<>(languages);

        // Create a comboBox using the language array. 
        JComboBox jcbLanuages = new JComboBox<>(languages);

        // Create text for button "OK".
        String ok_button_text = "OK";

        // Create an "OK" button.
        JButton jbOk = new JButton(ok_button_text);

        // Create text for cancel button.
        String cancel_button_text = "Cancel";

        // Create a cancel button.
        JButton jbCancel = new JButton(cancel_button_text);

        // Create Labels for Pictures.
        ImageIcon top_left = new ImageIcon("Cat.jpeg");
        Image top_left_image = top_left.getImage();
        Image newimg = top_left_image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        top_left = new ImageIcon(newimg);  // transform it back
        
        // Create Labels for Pictures.
        ImageIcon top_middle = new ImageIcon("Cheetah.jpeg");
        Image top_middle_image = top_middle.getImage();
        Image middle_img = top_middle_image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        top_middle = new ImageIcon(middle_img);  // transform it back

        
        JLabel top_middle_photo = new JLabel(top_middle);
        // Create a label for top left.
        JLabel top_left_photo = new JLabel(top_left);

        // Add the components to the BorderLayout.
        //main_JFrame.add(top_left_photo);
        //main_JFrame.add(top_middle_photo);

        // ADD COMPONENTS TO main_JFrame (in order).

        main_JFrame.add(jlName); // Add the label.
        main_JFrame.add(jtfName); // Add the text field.

        main_JFrame.add(jrbStat); // Add the statistics radio button.
        main_JFrame.add(jrbLinear); // Add the Linear Algebra radion button.

        main_JFrame.add(jcbCSCI); // Add the computer science check box.
        main_JFrame.add(jlsSample); // Add the sample slider.
        
        main_JFrame.add(jlLanguages); // Add the languages list.
        main_JFrame.add(jcbLanuages); // Add the languages check box.

        main_JFrame.add(top_middle_photo); // Add the OK button.
        main_JFrame.add(top_left_photo); // Add the Cancel button.

        // Set the title, size, location, and exit behavior for the JFrame.
        main_JFrame.setTitle(main_JFTitle); 
        main_JFrame.setSize(360, 480);     
        main_JFrame.setLocation(200, 100);
        main_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the frame visible.

        main_JFrame.setVisible(true);
    }// end main().









    public static void BorderlayoutDemo(){
        // Create a Frame to hold components.
        JFrame border_JFrame = new JFrame();
        
        // Create a new BorderLayout.
        BorderLayout border_layout = new BorderLayout();
        
        // assign main_layout to main_JFrame.
        border_JFrame.setLayout(border_layout);

        // Create a label with text "Center" for the Center zone.
        JButton jlCenter = new JButton("Center");
        jlCenter.setHorizontalAlignment(JLabel.CENTER);
        jlCenter.setForeground(Color.red);
        jlCenter.setBackground(Color.black);

        // Create a radio button for the NORTH zone.
        JRadioButton jrbNorth = new JRadioButton("North Zone");
        jrbNorth.setHorizontalAlignment(JRadioButton.CENTER);

        // Create a radio button for the South Zone.
        JRadioButton jrbSouth = new JRadioButton("South Zone");
        jrbSouth.setHorizontalAlignment(JRadioButton.CENTER);

        // create a String array for the list box and combo box
        String[] languages = new String[] {"Java", "C++", "Python", "Visual Basic"};

        // Create a list using a language array.
        JList jlLanguages = new JList<>(languages);

        // Create a ComboBox using the language array.
        JComboBox jcombLanguage = new JComboBox<>(languages);

        // add the components to the BorderLayout.
        border_JFrame.add(jlCenter, border_layout.CENTER);
        border_JFrame.add(jrbNorth, border_layout.NORTH);
        border_JFrame.add(jrbSouth, border_layout.SOUTH);
        border_JFrame.add(jlLanguages, border_layout.EAST);
        border_JFrame.add(jcombLanguage, border_layout.WEST);
        
        // Set the title, size, location, and exit behavior. 
        border_JFrame.setTitle("Border Layout Demo");
        border_JFrame.setSize(400, 160);
        border_JFrame.setLocation(200, 100);
        border_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the Fram visible.
        border_JFrame.setVisible(true);
    }// end of BorderLayoutDemo.

} // end class.
