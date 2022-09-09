//Private --- Solo ciertos elemntos y calses va a ser de dominio pub o priv
//Public  ---

//Label simepre son privados

import javax.swing.*;

public class InterfazFormulario01 extends JFrame {
    int num_uno = 0;
    private JLabel  label1;   //Es una etiqueta

    public InterfazFormulario01(){
        setLayout(null);
        label1 = new JLabel("Este es la Wikipedia de Jose");
        label1.setBounds(50, 0, 200, 300);
        add(label1);
    }
    public static void main(String[] args) {
        InterfazFormulario01 Formulrio1 = new InterfazFormulario01();
        Formulrio1.setBounds(0,0,500,400);
        Formulrio1.setVisible(true);
        Formulrio1.setLocationRelativeTo(null);  //Para que aparezca al centro
    }
}
