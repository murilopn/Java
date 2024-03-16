import java.awt.*; //esse e ".*" no final serve p/ importar a biblioteca toda e não uma classe específica
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{ 
    final private Font mainFont = new Font ("Segoe print", Font.BOLD,18);
    JTextField tfFirstName, tfLastName; //variáveis
    JLabel lbwelcome; //variável



    public void initialize(){
        /************************NORTH (form panel)******************************/
        JLabel lbFirstName = new JLabel("First Name"); //variável p/ receber a entrada do usuário
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField(); //JTextField é responsável pela inserção dos dados (!!!!!!!!!)
        tfFirstName.setFont(mainFont); 

        JLabel lbLastName = new JLabel("Last Name"); //mesma ideia do First Name
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont); 

        JPanel formPanel = new JPanel(); //Cria-se uma variável pra pegar o label e afins e jogar no main panel
        formPanel.setLayout(new GridLayout(4, 1, 5, 5)); //4 rows,1 column ,5 and 5 it's the margem distance between differents components
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        /*************************CENTER (welcome label)************************/
        lbwelcome = new JLabel();
        lbwelcome.setFont(mainFont);


        /*************************SOUTH (buttons panel)*************************/
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() { //o ActionListener ouve cliques do botão e toma decisão lógica a partir disso

            @Override
            public void actionPerformed(ActionEvent e) { //Here, we are getting the fields of names (North part) and showing them on the center part (the welcome part), which is the display
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText(); //get, pegar o tfFirstName - OBS: É O tf e não o normal, porque é o textfield que preenche o campo, como dito lá em cima
                String lastName = tfLastName.getText();
                lbwelcome.setText("Hello " + firstName + " " + lastName);
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                tfFirstName.setText("");
                tfLastName.setText("");
                lbwelcome.setText("");

            }
            
        });

        JPanel buttonsPanel = new JPanel(); //aqui eu criei o panel que contem os 2 botões
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


    /********************MAIN PANEL (onde tudo acontece)************/

        JPanel mainPanel = new JPanel(); //Criando o painel, sendo este dividido em 5 regiões (n foi utilizado west and east)
        //O Panel uma vez criado, basta adicionar o que irá corresponder às regiões as quais eu dividi
        mainPanel.setLayout(new BorderLayout()); 
        mainPanel.setBackground(new Color (128,128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH); //nomes
        mainPanel.add(lbwelcome, BorderLayout.CENTER); //print
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH); //botões clear and ok

        add(mainPanel);


        setTitle("Welcome"); //Dimensões do frame (da janela)
        setSize(600,700);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }    
    public static void main(String[] args) { //Para executar a classe mainPanel que criamos, precisamos adicionar o main method
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }


}
