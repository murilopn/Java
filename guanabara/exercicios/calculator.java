package exercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class calculator implements ActionListener {
	JTextField textField1, textField2; 
	JLabel result;

	public calculator() {
		JFrame frame = new JFrame("Calculator"); //basically the window
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Add");
		btn.addActionListener(this);
		
		
		textField1 = new JTextField(10);
        textField2 = new JTextField(10);
       
        result = new JLabel("Resultado");
        		
        frame.add(textField1);
        frame.add(textField2);
        frame.add(btn);
        frame.add(result);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
		 

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			float num1 = Float.parseFloat(textField1.getText());
			float num2 = Float.parseFloat(textField2.getText());
			
			float resultado = num1 + num2;
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(resultado);
			
			result.setText("Resultado: " + resultado);
		
	
		}
  
	
	public static void main(String[] args) {
		new calculator(); //Deste objeto, vai direto para o construtor (public GUI), que é basicamente um método
		
	}

}
