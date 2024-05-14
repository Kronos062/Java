import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Finestra {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Finestra d'exemple");
        JButton button = new JButton("Clic aqui");
        JTextField pantalla = new JTextField();
        JButton[] numberButtons = new JButton[10];

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(Integer.toString(i));
        }
        pantalla.setEditable(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has hecho clic en el boton");
            }
        });

        frame.add(pantalla);
        for (JButton jButton : numberButtons) {
            frame.add(jButton);
        }
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}