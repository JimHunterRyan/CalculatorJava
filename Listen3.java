
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Listen3 implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public Listen3(JTextField input, JTextField output, JButton z) {
        this.z = z;
        this.input = input;
        this.output = output;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.input.setText("0");
        this.output.setText("");
        z.setEnabled(false);
        
    }
    
}
