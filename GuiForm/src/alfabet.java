import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by MaRV on 1/25/2015.
 */


public class Alfabet extends JFrame {


    private JButton russian;
    private JButton englishButton;
    private JTextArea textArea1;
    private JPanel rootPanel;



    public Alfabet() {
        super("Hello World");
        setContentPane(rootPane);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        russian.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(Alfabet.this, "Yourdkd dkjdk");


            }
        });


        setVisible(true);

    }


}
