import java.awt.FlowLayout;

import javax.swing.JFrame;

public class binConvertMain 
{
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
      frame.getContentPane().add(new binConvertGUI());
      frame.setSize(600, 300);
      frame.setVisible( true );
   }
}
