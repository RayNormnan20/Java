//Creación de sub Menus

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazFormulario14 extends JFrame implements ActionListener{
    
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4;

    public InterfazFormulario14 () {
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);   //Coloca el objeto en la Inter Graf

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menu2 = new JMenu("Tamaño ventana");
        menu1.add(menu2);                          //Sub Menú

        menu3 = new JMenu("Color de Fondo");
        menu1.add(menu3);

        menuItem1 = new JMenuItem("300*200");
        menu2.add(menuItem1); 
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("640*480");
        menu2.add(menuItem2); 
        menuItem2.addActionListener(this);

        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3); 
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde");
        menu3.add(menuItem4); 
        menuItem4.addActionListener(this);

    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == menuItem1) {
            setSize(300, 200);
        }
        if (e.getSource() == menuItem2) {
            setSize(640, 480);
        }
        if (e.getSource() == menuItem3) {
            getContentPane().setBackground(new Color(255, 0, 0));   //Recupera las dimensiones y las guarda en el contenedor
        }
        if (e.getSource() == menuItem4) {
            getContentPane().setBackground(new Color(0, 255, 0));
        }
    }

    public static void main(String[] args) {
        InterfazFormulario14 formulario = new InterfazFormulario14();
        formulario.setBounds(0, 0, 300, 200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
