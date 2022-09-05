package practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App extends JFrame {
    int milanScore=0, realScore = 0;
    JButton milanBtn = new JButton("AC Milan");
    JButton realBtn = new JButton("Real Madrid");
    JLabel resLabel = new JLabel("Result: " + milanScore+" X "+realScore,SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A",SwingConstants.CENTER);
    JLabel lbl = new JLabel("Winner: DRAW",SwingConstants.CENTER);
    JPanel[] jPanel = new JPanel[6];
    App(){
        super("Example");
        setLayout(new GridLayout(2,3));
        for (int i=0;i<jPanel.length;i++){
            jPanel[i] = new JPanel();
            add(jPanel[i]);
        }
        jPanel[4].setLayout(new BorderLayout());
        jPanel[1].setLayout(new BorderLayout());
        jPanel[0].setLayout(new BorderLayout());
        jPanel[2].setLayout(new BorderLayout());
        setSize(500,250);
        jPanel[0].add(milanBtn,BorderLayout.CENTER);
        jPanel[1].add(resLabel,BorderLayout.CENTER);
        jPanel[2].add(realBtn,BorderLayout.CENTER);
        jPanel[4].add(lastScorer,BorderLayout.NORTH);
        jPanel[4].add(lbl,BorderLayout.SOUTH);
        setVisible(true);

        milanBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                resLabel.setText("Result: " + milanScore+" X "+realScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milanScore > realScore) lbl.setText("Winner: AC Milan");
                else if (milanScore < realScore) lbl.setText("Winner: Real Madrid");
                else lbl.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        realBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                realScore++;
                resLabel.setText("Result: " + milanScore+" X "+realScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milanScore > realScore) lbl.setText("Winner: AC Milan");
                else if (milanScore < realScore) lbl.setText("Winner: Real Madrid");
                else lbl.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new App();
    }

}
