//Sirve para ver como podmeos cambiar las dimensiones de nuestra interfaz 

import javax.swing.*;

public class InterfazFormulario02 extends JFrame {
    public InterfazFormulario02 (){
        setLayout(null); //No hace nada con el null
    }
    public static void main(String[] args) {
        InterfazFormulario02 Formulario1 = new InterfazFormulario02();
        Formulario1.setBounds(0, 0, 400, 550);
        Formulario1.setVisible(true);   // Sirve para que la interfaz se vea
        Formulario1.setLocationRelativeTo(null); //Infringe las coodernadas 
        Formulario1.setResizable(false); //Permiso para modificar 
    }
}
