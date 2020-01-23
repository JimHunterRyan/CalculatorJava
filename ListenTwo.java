
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ListenTwo implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton z;

    public ListenTwo(JTextField input, JTextField output, JButton z) {
        this.input = input;
        this.output = output;
        this.z = z;
    }

    public boolean isInteger(String input) { 
        try { 
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false; 
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!output.getText().equals("") && !isInteger(output.getText())) {
            this.output.setText("");
            return;
        }

        String x = output.getText();

        if (x.equals("")) {

            int change;
            String num = this.input.getText();
            change = Integer.parseInt(num) - 1;
            if (change == 0) {
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }

            this.input.setText(String.valueOf(change));
            this.output.setText("");
        } else {
            int change;
            change = -Integer.parseInt(x) + Integer.parseInt(input.getText());
            if (change == 0) {
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }

            this.input.setText(String.valueOf(change));
            this.output.setText("");

        }

    }

}
