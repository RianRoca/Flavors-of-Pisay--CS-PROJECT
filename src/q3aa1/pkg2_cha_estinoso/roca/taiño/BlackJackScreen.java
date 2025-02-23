/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3aa1.pkg2_cha_estinoso.roca.taiño;

import javax.swing.*;
import java.awt.*;

public class BlackJackScreen {

    public static void main(String[] args) {    
        JFrame frame = new JFrame("Card Game Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        // Timers
        frame.add(createCirclePanel("Timer", 145, 90));
        frame.add(createCirclePanel("Timer", 145, 360));

        // Player & Dealer Cards
        frame.add(createCardPanel(300, 80));
        frame.add(createCardPanel(300, 350));

        // Prize
        frame.add(createLabel("Prize", 360, 250, 80, 50));

        // Hit & Stand Buttons
        frame.add(createButton("Hit", 150, 250));
        frame.add(createButton("Stand", 550, 250));

        // Card Count & Name Circles
        frame.add(createCirclePanel("Card Count\nName", 545, 90));
        frame.add(createCirclePanel("Card Count\nName", 545, 360));

        frame.setVisible(true);
    }

    private static JPanel createCardPanel(int x, int y) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2, 10, 10));
        panel.add(createLabel("Card", 0, 0, 80, 100));
        panel.add(createLabel("Card", 0, 0, 80, 100));
        panel.setBounds(x, y, 200, 120);
        return panel;
    }

    private static JPanel createCirclePanel(String text, int x, int y) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(5, 5, 80, 80);
            }
        };
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("<html>" + text.replace("\n", "<br>") + "</html>", SwingConstants.CENTER), BorderLayout.CENTER);
        panel.setBounds(x, y, 90, 90);
        return panel;
    }

    private static JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 80, 30);
        return button;
    }

    private static JLabel createLabel(String text, int x, int y, int width, int height) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setBounds(x, y, width, height);
        return label;
    }
}