package Lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageComponent extends JComponent {
    private Image image;
    public ImageComponent(String fname)
    {
        try
        {
            image = ImageIO.read(new File(fname));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        g.drawImage(image, 0, 0, null);
    }
    public int getWidth() {
        return image.getWidth(this);
    }
    public int getHeight()
    {
        return image.getHeight(this);
    }
}

