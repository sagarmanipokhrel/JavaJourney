// 2080 Q.No.12  Write a program to create a menu named “File” with menu items “New,” “Save,” and “Exit”.

package advanceSwingComponents;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Example");

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create "New", "Save", and "Exit" menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners to handle menu item actions
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for "New"
                JOptionPane.showMessageDialog(frame, "New file created");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for "Save"
                JOptionPane.showMessageDialog(frame, "File saved");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action for "Exit"
                System.exit(0);  // Exit the application
            }
        });

        // Add menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();  // Adds a separator between Save and Exit
        fileMenu.add(exitItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Set the frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
