//

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class InterfazFormulario16 extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1;
    private JCheckBox checBox1;
    private JButton boton1;

    public InterfazFormulario16(){
        setLayout(null);
        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10, 10, 400, 30);
        add(label1);

        checBox1 = new JCheckBox("Acepto");
        checBox1.setBounds(10, 50, 100, 30);
        checBox1.addChangeListener(this);
        add(checBox1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 100, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false); // Valor Boleano...==Inicia desactivado el btn
    }

    public void stateChanged(ChangeEvent e){
        if(checBox1.isSelected() == true){
            boton1.setEnabled(true);
        } else{
            boton1.setEnabled(false);  //No está habilitado
        }
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        InterfazFormulario16 formulario = new InterfazFormulario16();
        formulario.setBounds(0, 0, 350, 200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

}
