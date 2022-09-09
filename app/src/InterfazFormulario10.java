//Suma por Interfaz 

import javax.swing.*;
import java.awt.event.*;

public class InterfazFormulario10  extends JFrame implements ActionListener{
    
    private JTextField textField1, textField2;
    private JLabel label1, label2, label3;
    private JButton boton1, boton2;

    public InterfazFormulario10(){
        setLayout(null);

        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3  = new JLabel("Resultado: ");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(120, 10, 150, 20);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120, 40, 150, 20);
        add(textField2);

        boton1 = new JButton("Sumar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Cerrar");
        boton2.setBounds(10, 140, 100, 30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            int valor1 = 0, valor2 = 0, resultado = 0;

            valor1 = Integer.parseInt(textField1.getText()); //Sirve para convertir a valores enteros
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 + valor2;

            label3.setText("Resultado: " + resultado);
        }
        if(e.getSource() == boton2){
            System.exit(0);
        }
    }
    public static void main(String[] args) {

        InterfazFormulario10 formulario = new InterfazFormulario10();
        formulario.setBounds(0, 0, 300, 250);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
        
    }
}
