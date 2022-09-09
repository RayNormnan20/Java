//Agrega texto al Area de text

import javax.swing.*;
import java.awt.event.*;

public class InterfazFormulario09 extends JFrame implements ActionListener {

    private JTextField textField1;
    private JScrollPane ScrollPane1;
    private JTextArea   textArea1;
    private JButton boton1, boton2;

    String texto = "";

    public InterfazFormulario09(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        boton1 = new JButton("Agregar");
        boton1.setBounds(250, 10, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton ("Cerrar");
        boton2.setBounds(390, 10, 100, 30);
        add(boton2);
        boton2.addActionListener(this);

        textArea1 = new JTextArea();
        ScrollPane1 = new JScrollPane(textArea1);
        ScrollPane1.setBounds(10, 50, 400, 300);
        add(ScrollPane1);
    }  
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
        }
        texto += textField1.getText() + "\n ";  //Para dar salto de linea
        textArea1.setText(texto);  //recupera los textos
        textField1.setText(""); //Sirve para limpiar
        if (e.getSource() == boton2){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        InterfazFormulario09 formulario = new InterfazFormulario09();
        formulario.setBounds(0, 0, 540, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
