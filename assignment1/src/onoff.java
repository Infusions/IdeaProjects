import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onoff implements ActionListener {

    private light light;
    private Icon icon;
    public onoff(light light, Icon icon){
        this.light = light;
        this.icon = icon;
    }

    public void actionPerformed(ActionEvent e){
        light.setIcon(icon);
    }
}
