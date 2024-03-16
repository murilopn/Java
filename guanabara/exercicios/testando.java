package exercicios;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class testando implements ActionListener {
    JTextField textField1, textField2;
    JLabel resultadoLabel;

    public testando () {
        JFrame frame = new JFrame("Soma de Campos de Texto");
        frame.setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        JButton botao = new JButton("Somar");
        botao.addActionListener(this);

        resultadoLabel = new JLabel("Resultado:");

        frame.add(textField1);
        frame.add(textField2);
        frame.add(botao);
        frame.add(resultadoLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Obtém o texto dos campos de texto e converte em números
            double numero1 = Double.parseDouble(textField1.getText());
            double numero2 = Double.parseDouble(textField2.getText());
            
            // Realiza a operação de soma
            double resultado = numero1 + numero2;

            // Define o resultado no JLabel
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Erro: Insira números válidos nos campos de texto.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new testando();
            }
        });
    }
}


/*package exercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class calculator implements ActionListener {
	final private Font mainFont = new Font ("Segoe print", Font.BOLD,18);
	JTextField textField1, textField2; 
	JLabel result;

	public calculator() {
		JFrame frame = new JFrame(); //basically the window
		JPanel panel = new JPanel(); // he've gotta put stuff inside the window, that's the JPanel function
		
		
		
		textField1 = new JTextField(10);
        textField2 = new JTextField(10);
	     
        JButton btn = new JButton("Somar");
        btn.addActionListener(this);
        
	   
			
        frame.add(textField1);
        frame.add(textField2);
        frame.add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(600,400);
		 
		 result = new JLabel();
		 result.setFont(mainFont);
		 

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			int n1 = Integer.parseInt(textField1.getText());
			int n2 = Integer.parseInt(textField1.getText());
			
		
	
		}
  
	
	public static void main(String[] args) {
		new calculator(); //Deste objeto, vai direto para o construtor (public GUI), que é basicamente um método
		
	}

}
*/