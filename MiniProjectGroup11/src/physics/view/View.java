package physics.view;

import physics.model.*;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    JPanel detailPanel = new JPanel(new GridLayout(6,1));
    JCheckBox forcesDirectionCheckbox = new JCheckBox("Direction of Forces");
    JCheckBox forcesValueCheckBox = new JCheckBox("Value of Forces");
    JCheckBox forcesSumCheckBox = new JCheckBox("Sum of Forces");
    JCheckBox massCheckBox = new JCheckBox("Mass");
    JCheckBox speedAccelerationCheckBox = new JCheckBox("Speed and Acceleration");
    JLabel detailLabel = new JLabel("Details");
    public View(){

    }
    public View(String title, int width, int height){
        // Set the layout of the panel to Border Layout
        // setLayout(new BorderLayout());
        this.setTitle(title);
        this.setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setDefaultLookAndFeelDecorated(true);
        //add checkbox to Detailed Panel
        detailPanel.add(detailLabel);
        detailPanel.add(forcesDirectionCheckbox);
        detailPanel.add(forcesValueCheckBox);
        detailPanel.add(forcesSumCheckBox);
        detailPanel.add(massCheckBox);
        detailPanel.add(speedAccelerationCheckBox);
        detailPanel.setSize(400, 600);
        this.add(detailPanel, BorderLayout.NORTH);
        this.setVisible(true);
        
    }

}
