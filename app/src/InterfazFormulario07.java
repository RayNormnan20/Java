//Texto area 
import javax.swing.*;

public class InterfazFormulario07 extends JFrame{

    private JTextField textField1;
    private JTextArea textArea1;

    public InterfazFormulario07(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        textArea1 = new JTextArea();
        textArea1.setBounds(10, 50, 400, 300);
        add(textArea1);
    }
    public static void main(String[] args) {
        InterfazFormulario07 formulario = new InterfazFormulario07();
        formulario.setBounds(0, 0, 540, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
