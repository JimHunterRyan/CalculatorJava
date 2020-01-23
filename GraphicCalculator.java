
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField input = new JTextField();
        JTextField output = new JTextField();
        input.setText("0");
        output.setText("");
        input.setEnabled(false);
        JButton z = new JButton("Z");
        ListenOne listener = new ListenOne(input, output, z);
        ListenTwo listener2 = new ListenTwo(input, output, z);
        Listen3 listener3 = new Listen3(input, output, z);
        container.add(input);
        container.add(output);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton add = new JButton("+");
        JButton sub = new JButton("-");

        add.addActionListener((ActionListener) listener);
        sub.addActionListener((ActionListener) listener2);
        z.addActionListener((ActionListener) listener3);
        z.setEnabled(false);
        panel.add(add);
        panel.add(sub);
        panel.add(z);
        container.add(panel, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
