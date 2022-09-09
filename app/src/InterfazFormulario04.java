// Diseño de Boton de la Interfaz
import javax.swing.*;
import java.awt.event.*;

public class InterfazFormulario04 extends JFrame implements ActionListener{

    JButton boton1;
    public InterfazFormulario04(){
        setLayout(null);
        boton1 = new JButton ("Cerrar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);  //tiene una funcionalidad de accion
    }

    public void actionPerformed(ActionEvent e){  //Captura el evento generado
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        InterfazFormulario04 Formulario = new InterfazFormulario04();
        Formulario.setBounds(0, 0, 450, 350);
        Formulario.setVisible(true);  //PAra que se vea la IN. Gra..
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null); // Inicia al centro de la pantalla
    }
}
