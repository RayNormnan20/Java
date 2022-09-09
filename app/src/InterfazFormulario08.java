//

import javax.swing.*;

public class InterfazFormulario08 extends JFrame{

    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTextArea   textArea1;

    public InterfazFormulario08(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 50, 400, 300);
        add(scrollPane1);

    }
    public static void main(String[] args) {
        InterfazFormulario08 formulario = new InterfazFormulario08();
        formulario.setBounds(0, 0, 540, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
