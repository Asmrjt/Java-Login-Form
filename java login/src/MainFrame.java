import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font maiFont = new Font("Futura", Font.PLAIN, 18);
    JTextField tfFirstName, tfLastName;
    JLabel IbWelcome;

    public void initialize() {
        // ********* Form Panel **************//

        JLabel IbFirstName = new JLabel("Nama Depan");
        IbFirstName.setFont(maiFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(maiFont);

        JLabel IbLastName = new JLabel("Nama Belakang");
        IbLastName.setFont(maiFont);

        tfLastName = new JTextField();
        tfLastName.setFont(maiFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(IbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(IbLastName);
        formPanel.add(tfLastName);

        // ******** Welcome Label *******//
        IbWelcome = new JLabel();
        IbWelcome.setFont(maiFont);

        // ********** Button Panel *********//
        JButton btnOK = new JButton("OK");
        btnOK.setFont(maiFont);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName = tfFirstName.getText();
                String LastName = tfLastName.getText();
                IbWelcome.setText("hello " + FirstName + " " + LastName);
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(maiFont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                IbWelcome.setText("");
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel maiPanel = new JPanel();
        maiPanel.setLayout(new BorderLayout());
        maiPanel.setBackground(new Color(0, 255, 255, 128));
        maiPanel.add(formPanel, BorderLayout.NORTH);
        maiPanel.add(IbWelcome, BorderLayout.CENTER);
        maiPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(maiPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
