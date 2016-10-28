import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorGUI {
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	private Calculator calculator = new Calculator();
	JLabel lblResult = new JLabel("Result:");
	

	
	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.CYAN);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 255, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("first number");
		lblFirstNumber.setBounds(10, 30, 96, 14);
		frmCalculator.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("second number:");
		lblSecondNumber.setBounds(10, 61, 96, 14);
		frmCalculator.getContentPane().add(lblSecondNumber);
		
		
		lblResult.setBounds(10, 86, 223, 14);
		frmCalculator.getContentPane().add(lblResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;				
				firstNumber = Double.valueOf(txfFirstNumber.getText());
				secondNumber = Double.valueOf(txfSecondNumber.getText());				
				result = calculator.add(firstNumber, secondNumber);				
				lblResult.setText("Result: "+result);
				
			}
		});
		btnAdd.setBounds(10, 139, 47, 23);
		frmCalculator.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;				
				firstNumber = Double.valueOf(txfFirstNumber.getText());
				secondNumber = Double.valueOf(txfSecondNumber.getText());				
				result = calculator.subtract(firstNumber, secondNumber);				
				lblResult.setText("Result: "+result);				
			}
		});
		btnSubtract.setBounds(67, 139, 48, 23);
		frmCalculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;				
				firstNumber = Double.valueOf(txfFirstNumber.getText());
				secondNumber = Double.valueOf(txfSecondNumber.getText());				
				result = calculator.multiply(firstNumber, secondNumber);				
				lblResult.setText("Result: "+result);				
			}
		});
		btnMultiply.setBounds(125, 139, 47, 23);
		frmCalculator.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;				
				firstNumber = Double.valueOf(txfFirstNumber.getText());
				secondNumber = Double.valueOf(txfSecondNumber.getText());				
				result = calculator.divide(firstNumber, secondNumber);				
				lblResult.setText("Result: "+result);				
			}
		});
		btnDivide.setBounds(182, 139, 37, 23);
		frmCalculator.getContentPane().add(btnDivide);
		
		frmCalculator.setVisible(true);
	}
}
