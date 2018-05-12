import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * This is a program to convert to from decimal to other number formats such as binary
 * 
 * @author Chris Frome
 * @version 1.0 05/09/2018
 *
 */
public class binConvertGUI extends JPanel 
{
	private static final long serialVersionUID = 6604212468988850010L;

	/*
	 * This is the default constructor
	 */
	public binConvertGUI() 
	{
		setBorder(new TitledBorder
			      (new EtchedBorder(),"BinConvert"));
			      setLayout(new BorderLayout(5, 5));
			      add(cb, BorderLayout.NORTH);
			      add(enterField(), BorderLayout.CENTER);
			      add(convertButton(), BorderLayout.EAST);
			      add(answerField(), BorderLayout.SOUTH);
    }
	
	JPanel panel = new JPanel();

	JLabel lbl = new JLabel("Select one of the possible choices and enter a value");

	String[] choices = { "32 bit unsigned", "32 bit sign magnitude number",
			"32 bit ones complement number",
			"32 bit two's complement number", "BCD number", "octal number",
			"hexadcecimal number", "IEEE Single Precision number",
			"IEEE Double Precision number" };

	final JComboBox<String> cb = new JComboBox<String>(choices); 
	
	JLabel label = new JLabel("Enter number to convert to");
	private JTextField numberField = new JTextField(10);
	JButton ConvertButton = new JButton("Convert");
	
	JLabel answerLabel = new JLabel("Answer");
	private JTextField answerField = new JTextField(22);
	
	/**
	 * This method creates the convert button and its action listener
	 * 
	 * @return panel - the convert button panel
	 */
	private JPanel convertButton() 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		panel.add(ConvertButton);
		ConvertButton.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent ae)
		    {
		        String value = numberField.getText();
				if(cb.getSelectedItem().equals("32 bit unsigned"))
				{
			        String result = binConvert.unsigned(Long.parseLong(value));
					answerField.setText(result);
				}
				else if(cb.getSelectedItem().equals("32 bit sign magnitude number"))
				{
			        String result = binConvert.signMag(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("32 bit ones complement number"))
				{
			        String result = binConvert.onesComp(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("32 bit two's complement number"))
				{
			        String result = binConvert.twosComp(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("BCD number"))
				{
			        String result = binConvert.BCD(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("octal number"))
				{
			        String result = binConvert.octal(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("hexadcecimal number"))
				{
			        String result = binConvert.hexadecimal(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("IEEE Single Precision number"))
				{
			        String result = binConvert.ieeeSingle(Long.parseLong(value));
			        answerField.setText(result);
				}
				if(cb.getSelectedItem().equals("IEEE Double Precision number"))
				{
			        String result = binConvert.ieeeDouble(Long.parseLong(value));
			        answerField.setText(result);
				}
		    }
		});
		return panel;
	}
	
	private JPanel enterField() 
	{
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label, "align label");
        panel.add(numberField, "wrap");
        JButton ClearButton = new JButton("Clear");
        panel.add(ClearButton, "wrap");
        ClearButton.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent ae)
		    {
		    	numberField.setText("");
		    }
		});
	    return panel;
	}
	
	private JPanel answerField() 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
        panel.add(answerLabel);
        panel.add(answerField);
        answerField.setEditable(false);
        JButton ClearButton = new JButton("Clear");
        panel.add(ClearButton, "wrap");
        ClearButton.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent ae)
		    {
		    	answerField.setText("");
		    }
		});
		return panel;
	}
}