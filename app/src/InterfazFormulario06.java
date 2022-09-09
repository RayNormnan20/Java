// Interfaz para Login

import javax.swing.*;
import java.awt.event.*;

public class InterfazFormulario06 extends JFrame implements ActionListener{

    private JTextField textField1; 
    private JLabel  label1;
    private JButton boton1, boton2;
    public InterfazFormulario06 (){
        setLayout(null);
        
        label1 = new JLabel("Usuario: ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(120, 17, 150, 20);
        add(textField1); 

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton ("Cerrar");
        boton2.setBounds(150, 80, 100, 30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            String texto = textField1.getText();
            setTitle(texto);
        }
        if (e.getSource() == boton2){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        InterfazFormulario06 formulario = new InterfazFormulario06();
        formulario.setBounds(0, 0, 300, 200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
} 