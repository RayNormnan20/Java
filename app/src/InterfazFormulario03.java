//Texto en labels

import javax.swing.*;

public class InterfazFormulario03 extends JFrame {
    private JLabel label1;
    private JLabel label2;

    public InterfazFormulario03 (){
        setLayout(null);
        label1 = new JLabel("Interfaz gráfica...");
        label1.setBounds(10, 20, 300, 30);
        add(label1);

        label2 = new JLabel("Jose 2022");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }
    public static void main(String[] args) {
        InterfazFormulario03 formulario = new    InterfazFormulario03();
        formulario.setBounds(100, 150, 300, 200);
        formulario.setResizable(false);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
}
