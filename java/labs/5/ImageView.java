package Lab5;
import java.awt.*;
import javax.swing.*;

public class ImageView  extends JFrame {
    ImageComponent component;
    public ImageView(String fn)
    {
        super("ImageView");
        component = new ImageComponent(fn);
        add(component);
        setSize(component.getWidth(),component.getHeight());
    }

}
