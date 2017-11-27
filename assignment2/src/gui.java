import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class gui extends JFrame {

    private button filepicker;

    public gui() {
        super("Spellchecker");
        setLayout(new FlowLayout());
        filepicker = new button("Open File");
        filepicker.addActionListener(new openfile());
        add(filepicker);
    }

}
