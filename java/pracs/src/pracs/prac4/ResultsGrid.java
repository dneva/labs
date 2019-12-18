package pracs.prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultsGrid extends JFrame {
    JButton bm = new JButton("AC Milan");
    JButton br = new JButton("Real Madrid");
    JLabel res = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel win = new JLabel("Winner: DRAW");
    private int acm;
    private int rm;
    public ResultsGrid()
    {
        acm=0;
        rm=0;
        setSize(300,300);
        setLayout(new BorderLayout());
        add(bm, BorderLayout.WEST);
        add(br, BorderLayout.EAST);
        add(res,BorderLayout.CENTER);
        add(last, BorderLayout.SOUTH);
        add(win, BorderLayout.NORTH);
        bm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                acm++;
                res.setText("Result: " + acm + " X " + rm);
                changeLastScorer(bm.getText());
                changeWinner();
            }
        });
        br.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rm++;
                res.setText("Result: " + acm + " X " + rm);
                changeLastScorer(br.getText());
                changeWinner();
            }
        });
    }
    public void changeLastScorer(String team)
    {
        last.setText("Last Scorer: "+team);
    }
    public void changeWinner()
    {
        if(acm==rm)
            win.setText("Winner: DRAW");
        else if(acm>rm)
            win.setText("Winner: AC Milan");
        else if(rm>acm)
            win.setText("Winner: Real Madrid");
    }
}