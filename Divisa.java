import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divisa extends JFrame {
    private JTextField divisaTF;
    private JTextField divisaFinTF;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton convertirBTN;
    private JButton liampiarBTN;
    private JPanel mainPanel;

    public Divisa() {
        setTitle("CONVERSOR");
        setSize(500, 300);
        setContentPane(mainPanel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double moneda = Double.parseDouble(divisaTF.getText());
                int div = comboBox1.getSelectedIndex();
                int div1 = comboBox2.getSelectedIndex();


                conversion conexion = new conversion ();

                conexion.setMoneda(moneda);
                conexion.setDiv(div);
                conexion.setDiv1(div1);
                conexion.convesor();

                divisaFinTF.setText(String.valueOf(conexion.getResultado()));

            }
        });

        liampiarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisaTF.setText("");
                divisaFinTF.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Divisa divisa1 = new Divisa();

    }
}
