//Cambiar los colores de la Interfaz 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazFormulario13 extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu1, menu2;
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;

    public InterfazFormulario13(){
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menuItem1 = new JMenuItem("Rojo");
        menuItem1.addActionListener(this);
        menu1.add(menuItem1);

        menuItem2 = new JMenuItem("Verde");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);

        //
        menu2 = new JMenu("Colores");
        menuBar.add(menu2);

        menuItem4 = new JMenuItem("Amarillo");
        menuItem4.addActionListener(this);
        menu2.add(menuItem4);

        menuItem5 = new JMenuItem("Anaranjado");
        menuItem5.addActionListener(this);
        menu2.add(menuItem5);

        menuItem6 = new JMenuItem("Celeste");
        menuItem6.addActionListener(this);
        menu2.add(menuItem6);


    }

    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();  //Agarra las dimensiones de la Interfaz

        if(e.getSource() == menuItem1){
            fondo.setBackground(new Color(255, 0, 0));
        }
        if(e.getSource() == menuItem2){
            fondo.setBackground(new Color(0, 255, 0));
        }
        if(e.getSource() == menuItem3){
            fondo.setBackground(new Color(0, 0, 255));
        }
        if(e.getSource() == menuItem4){
            fondo.setBackground(new Color(227 , 232, 35));
        }
        if(e.getSource() == menuItem5){
            fondo.setBackground(new Color(255, 136, 14));
        }
        if(e.getSource() == menuItem6){
            fondo.setBackground(new Color(100, 232, 255));
        }
    }
    public static void main(String[] args) {
        InterfazFormulario13 formulario = new InterfazFormulario13();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setVisible(true);
        //formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
