// Combobox en Interfaz Java 

import javax.swing.*;
import java.awt.event.*;

public class InterfazFormulario11 extends JFrame implements ItemListener{

    private JComboBox combo1;

    public InterfazFormulario11(){
        setLayout(null);
        combo1 = new JComboBox<>();
        combo1.setBounds(10, 10, 80, 20);
        add(combo1);

        combo1.addItem("Rojo");
        combo1.addItem("Azul");
        combo1.addItem("Verde");
        combo1.addItem("Negro");
        combo1.addItem("Amarillo");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == combo1){
            String selecion = combo1.getSelectedItem().toString();
            setTitle(selecion);
        }

    }
    public static void main(String[] args) {
        InterfazFormulario11 formulario = new InterfazFormulario11();
        formulario.setBounds(0, 0, 300, 250);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
