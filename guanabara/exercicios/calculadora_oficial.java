package exercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class calculadora_oficial {
	JTextField textField1, textField2; 
	JLabel result;
	float resultado=0, n1=0,n2=0;
	

	public calculadora_oficial() {
		JFrame frame = new JFrame("Calculator"); //basically the window
		frame.setLayout(new FlowLayout()); //COLOCA TUDO NA MESMA LILNHA
		 JPanel panel = new JPanel(new GridLayout(1, 1));
		 
	
		textField1 = new JTextField(15);
		textField2 = new JTextField(15);
				
	    result = new JLabel("Resultado");
	    
		JButton btnadd = new JButton("Add");
		btnadd.setPreferredSize(new Dimension(70, 40));
		btnadd.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent e) {
				String inputText1 = textField1.getText();
				String inputText2 = textField2.getText();
				n1 = Float.parseFloat(inputText1);
				n2 = Float.parseFloat(inputText2);
				resultado = n1 + n2;
				result.setText(" " + resultado);
				
			}		
		});
		
		JButton btnsub = new JButton("Subtract");
		btnsub.setPreferredSize(new Dimension(70, 40));
		btnsub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String inputText1 = textField1.getText();
				String inputText2 = textField2.getText();
				n1 = Float.parseFloat(inputText1);
				n2 = Float.parseFloat(inputText2);
				resultado = n1 - n2;
				result.setText(" " + resultado);
				
			}	});
		
		JButton btnmult = new JButton("Multiply");
		btnmult.setPreferredSize(new Dimension(70, 40));
		btnmult.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String inputText1 = textField1.getText();
				String inputText2 = textField2.getText();
				n1 = Float.parseFloat(inputText1);
				n2 = Float.parseFloat(inputText2);
				resultado = n1 * n2;
				result.setText(" " + resultado);
				
			}	});
		
		JButton btndiv = new JButton("Divide");
		btndiv.setPreferredSize(new Dimension(70, 40));
		btndiv.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String inputText1 = textField1.getText();
				String inputText2 = textField2.getText();
				n1 = Float.parseFloat(inputText1);
				n2 = Float.parseFloat(inputText2);
				resultado = n1 / n2;
				result.setText(" " + resultado);
				
			}	});
		
		panel.add(textField1);
		panel.add(textField2);
		panel.add(result);
		panel.add(btnadd, BorderLayout.SOUTH);
		panel.add(btnsub, BorderLayout.CENTER);
		panel.add(btndiv, BorderLayout.CENTER);
		panel.add(btnmult, BorderLayout.CENTER);
		
		frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.pack();
    

	}
	
	
	public static void main(String[] args) {
		new calculadora_oficial(); //Deste objeto, vai direto para o construtor (public GUI), que é basicamente um método
		
	}

}
