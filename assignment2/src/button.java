import javax.swing.*;
import java.awt.Dimension;

public class button extends JButton{

    public button(String text){
        super(text);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setPreferredSize(new Dimension(80, 50));
    }

}