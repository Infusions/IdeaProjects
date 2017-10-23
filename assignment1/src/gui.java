import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class gui extends JFrame {

    private int seats = 5;

    private button[] buttons;
    private light[] lights;

    private button cancel;

    public gui() {
        super("Call Buttons");
        setLayout(new FlowLayout());

        Icon off = new ImageIcon(getClass().getResource("off.png"));
        Icon on = new ImageIcon(getClass().getResource("on.png"));

        buttons = new button[seats];
        lights = new light[seats];
        cancel = new button("CANCEL");
        for (int i = 0; i < seats; i++) {
            buttons[i] = new button("CALL");
            add(buttons[i]);
            lights[i] = new light(off);
            add(lights[i]);
            buttons[i].addActionListener(new onoff(lights[i], on));
            cancel.addActionListener(new onoff(lights[i], off));
        }
        add(cancel);
    }
}
