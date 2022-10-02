import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
	// Variables declaration
	JTextField jTextField1;
	JButton jB0;
	JButton jB1;
	JButton jB2;
	JButton jB3;
	JButton jB4;
	JButton jB5;
	JButton jB6;
	JButton jB7;
	JButton jB8;
	JButton jB9;
	JButton jBMinus;
	JButton jBPlus;
	JButton jBMul;
	JButton jBDiv;
	JButton jBEqual;
	JButton jBDot;
	JButton jBBack;
	JButton jBClear;
	
	String result = "";
	Double memory = 0.0;
	boolean dot = false;
	int operation = 0;
	boolean clearScreen = false;
	boolean equalPressed = false;
	boolean once = false;
	boolean clearView = false;

	private JPanel contentPane;

	public Calculator(){
		initializeComponent();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initializeComponent(){
		jTextField1 = new JTextField();
		jBClear = new JButton();
		jB0 = new JButton();
		jB1 = new JButton();
		jB2 = new JButton();
		jB3 = new JButton();
		jB4 = new JButton();
		jB5 = new JButton();
		jB6 = new JButton();
		jB7 = new JButton();
		jB8 = new JButton();
		jB9 = new JButton();
		jBMinus = new JButton();
		jBPlus = new JButton();
		jBMul = new JButton();
		jBDiv = new JButton();
		jBDot = new JButton();
		jBEqual = new JButton();
		jBBack = new JButton();

		contentPane = (JPanel)this.getContentPane();


		jTextField1.setText("");
		jTextField1.setHorizontalAlignment(SwingConstants.TRAILING);
		//jTextField1.setEnabled(false);
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		

		jBClear.setText("Clear");
		jBClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBClear_actionPerformed(e);
			}
		});
	
		jBBack.setText("Backspace");
		jBBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBBack_actionPerformed(e);
			}
		});
		
		jB0.setText("0");
		jB0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB0_actionPerformed(e);
			}
		});
		
		jB1.setText("1");
		jB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB1_actionPerformed(e);
			}
		});
		
		jB2.setText("2");
		jB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB2_actionPerformed(e);
			}
		});
		
		jB3.setText("3");
		jB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB3_actionPerformed(e);
			}
		});
		
		jB4.setText("4");
		jB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB4_actionPerformed(e);
			}
		});

		jB5.setText("5");
		jB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB5_actionPerformed(e);
			}
		});

		jB6.setText("6");
		jB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB6_actionPerformed(e);
			}
		});		

		jB7.setText("7");
		jB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB7_actionPerformed(e);
			}
		});

		jB8.setText("8");
		jB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB8_actionPerformed(e);
			}
		});

		jB9.setText("9");
		jB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jB9_actionPerformed(e);
			}
		});		

		jBMinus.setText("-");
		jBMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBMinus_actionPerformed(e);
			}
		});

		jBPlus.setText("+");
		jBPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBPlus_actionPerformed(e);
			}
		});

		jBMul.setText("*");
		jBMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBMul_actionPerformed(e);
			}
		});

		jBDiv.setText("/");
		jBDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBDiv_actionPerformed(e);
			}
		});		

		jBDot.setText(".");
		jBDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBDot_actionPerformed(e);
			}
		});

		jBEqual.setText("=");
		jBEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jBEqual_actionPerformed(e);
			}
		});		

		contentPane.setLayout(null);
		addComponent(contentPane, jTextField1, 17,14,198,22);
		addComponent(contentPane, jBBack, 21,44,90,22);
		addComponent(contentPane, jBClear, 121,44,90,22);
		addComponent(contentPane, jB1, 21,170,40,38);
		addComponent(contentPane, jB2, 71,170,40,38);
		addComponent(contentPane, jB3, 121,170,40,38);
		addComponent(contentPane, jB4, 21,122,40,38);
		addComponent(contentPane, jB5, 71,122,40,38);
		addComponent(contentPane, jB6, 121,122,40,38);
		addComponent(contentPane, jB7, 21,74,40,38);
		addComponent(contentPane, jB8, 71,74,40,38);
		addComponent(contentPane, jB9, 121,74,40,38);
		addComponent(contentPane, jBMinus, 171,170,40,38);
		addComponent(contentPane, jBPlus, 171,218,40,38);
		addComponent(contentPane, jBMul, 171,122,40,38);
		addComponent(contentPane, jBDiv, 171,74,40,38);
		addComponent(contentPane, jB0, 21,218,40,38);
		addComponent(contentPane, jBDot, 71,218,40,38);
		addComponent(contentPane, jBEqual, 121,218,40,38);
	

		// Calculator
		this.setTitle("Calculator");
		this.setLocation(new Point(27, 14));
		this.setSize(new Dimension(241, 320));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height){
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	private void jBBack_actionPerformed(ActionEvent e)
	{
		if (jTextField1.getText().length() > 0)
			jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
	}

	private void jBClear_actionPerformed(ActionEvent e){
		jTextField1.setText("");
		this.result = "";
		this.memory = 0.0;
		this.dot = false;
		this.operation = 0;
		this.once = false;
		this.clearView = false;
	}

	private void jB0_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (!(jTextField1.getText().equals ("0")))
		if (this.clearScreen) {
			jTextField1.setText("0");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"0");
	}

	private void jB1_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("1");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"1");
	}

	private void jB2_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("2");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"2");
	}

	private void jB3_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("3");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"3");
	}

	private void jB4_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("4");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"4");
	}

	private void jB5_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("5");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"5");
	}

	private void jB6_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("6");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"6");
	}

	private void jB7_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("7");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"7");
	}

	private void jB8_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("8");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"8");
	}

	private void jB9_actionPerformed(ActionEvent e){
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("9");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"9");
	}	

	private void jBMinus_actionPerformed(ActionEvent e){
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 1;		
	}

	private void jBPlus_actionPerformed(ActionEvent e){
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 2;
	}

	private void jBMul_actionPerformed(ActionEvent e){
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 3;
	}

	private void jBDiv_actionPerformed(ActionEvent e){
		this.dot = false;
		
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 4;
	}	

	private void jBDot_actionPerformed(ActionEvent e){
		if (!(this.clearView)) {

		if (!(jTextField1.getText().equals ("")))
		if (this.dot != true) {
			jTextField1.setText(jTextField1.getText()+".");
			this.dot = true;
		}
		}
	}

	private void jBEqual_actionPerformed(ActionEvent e){
		this.once = false;
		this.dot = false;
		this.clearScreen = true;
		gotoSwitch();
		this.operation = 0;
		this.equalPressed = true;
		this.clearView = false;
	}	

	public static String memoryToString(Double m) {
		String temp = Double.toString(m);
		boolean hasDecimal = false;
		String temp2 = "";
		for (int i=temp.lastIndexOf(".")+1; i<temp.length(); i++)
			if (temp.charAt(i) != '0') {
				hasDecimal = true;
				break;
			}
		if (hasDecimal)
			return temp;
		else {
			for (int i=0; i<temp.lastIndexOf("."); i++)
				temp2 = temp2 + temp.charAt(i);
			return temp2;
		}		
	}

	public void stringToDouble() {
		if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)) == '.')
			this.memory = Double.parseDouble(jTextField1.getText()+"0");
		else
			this.memory = Double.parseDouble(jTextField1.getText());
	}

	public void gotoSwitch() {
		switch (this.operation) {
			case 0 :	break;
			case 1 : 	this.memory = this.memory - Double.parseDouble(jTextField1.getText());
					break;
			case 2 :	this.memory = this.memory + Double.parseDouble(jTextField1.getText());
					break;
			case 3 : 	this.memory = this.memory * Double.parseDouble(jTextField1.getText());
					break;
			case 4 :	this.memory = this.memory / Double.parseDouble(jTextField1.getText());
					break;
			default	 :	System.out.println("Unexpected Error");
		}
		jTextField1.setText(memoryToString(this.memory));
	}
	
	public static void main(String[] args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex){
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new Calculator();
	}
}
