package Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorderPanels extends JFrame {
    JPanel[] panels=new JPanel[5];
    public BorderPanels()
    {
        setSize(500,500);
        setLayout(new BorderLayout());

        panels[0] = new JPanel();
        panels[0].setBorder(BorderFactory.createLineBorder(Color.black));
        add(panels[0],BorderLayout.NORTH);
        panels[0].add(new Label("NORTH"));
        panels[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Эль-Джауф");
            }
        });


        panels[1] = new JPanel();
        panels[1].setBorder(BorderFactory.createLineBorder(Color.black));
        add(panels[1],BorderLayout.SOUTH);
        panels[1].add(new Label("SOUTH"));
        panels[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Абха");
            }
        });

        panels[2] = new JPanel();
        panels[2].setBorder(BorderFactory.createLineBorder(Color.black));
        add(panels[2],BorderLayout.CENTER);
        panels[2].add(new Label("CENTER"));
        panels[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Эр-Рияд");
            }
        });

        panels[3] = new JPanel();
        panels[3].setBorder(BorderFactory.createLineBorder(Color.black));
        add(panels[3],BorderLayout.WEST);
        panels[3].add(new Label("WEST"));
        panels[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");
            }
        });

        panels[4] = new JPanel();
        panels[4].setBorder(BorderFactory.createLineBorder(Color.black));
        add(panels[4],BorderLayout.EAST);
        panels[4].add(new Label("EAST"));
        panels[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");
            }
        });
    }
}
