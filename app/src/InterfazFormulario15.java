//Creacion de un CheckBox

import javax.swing.*;
import javax.swing.event.*;


public class InterfazFormulario15 extends JFrame implements ChangeListener{

    private JCheckBox checkBox1, checkBox2, checkBox3;

    public InterfazFormulario15 (){
        setLayout(null);
        checkBox1 = new JCheckBox("Inglés");
        checkBox1.setBounds(10, 10, 150, 30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        checkBox2 = new JCheckBox("Francés");
        checkBox2.setBounds(10, 50, 150, 30);
        checkBox2.addChangeListener(this);
        add(checkBox2);

        checkBox3 = new JCheckBox("Alemán");
        checkBox3.setBounds(10, 90, 150, 30);
        checkBox3.addChangeListener(this);
        add(checkBox3);
    }
    
    public void stateChanged(ChangeEvent e){
        String cadena="";
        
        if(checkBox1.isSelected() == true){
            cadena = cadena + "Inglés- ";
        }
        if(checkBox2.isSelected() == true){ 
            cadena = cadena + "Francés- ";  
        }
        if(checkBox3.isSelected() == true){
            cadena = cadena + "Alemán- ";
        }
        setTitle(cadena);
    }
    public static void main(String[] args) {
        InterfazFormulario15 formulario = new InterfazFormulario15();
        formulario.setBounds(0, 0, 350, 200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);

    }
}