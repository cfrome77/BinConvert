import java.awt.FlowLayout;

import javax.swing.JFrame;

/**
 * This is the main class to that is called to run the GUI
 * 
 * @author Chris Frome
 * @version 05/2018
 *
 */
public class binConvertMain
{
    /**
     * This is the main method that creates the main frame and adds all the
     * other panels to it.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(new binConvertGUI());
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}
