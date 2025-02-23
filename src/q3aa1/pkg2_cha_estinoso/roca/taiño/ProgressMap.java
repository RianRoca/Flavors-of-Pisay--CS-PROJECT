/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3aa1.pkg2_cha_estinoso.roca.taiño;

import javax.swing.*;
import java.awt.*;

public class ProgressMap extends JFrame {
    public ProgressMap() {
        setTitle("Progress Map");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Absolute positioning

        // Profile Section
        JButton profileButton = createButton("Profile", 20, 20, 100, 150);
        add(profileButton);

        // Assets Bar (Now a Panel)
        JPanel assetsBar = createPanel("Assets Bar", 150, 20, 200, 30);
        add(assetsBar);

        // Settings Section
        JButton settingsButton = createButton("<html><center>Settings</center></html>", 700, 20, 100, 50);
        add(settingsButton);

        // Side Bar (Now a Panel)
        JPanel sideBar = createPanel("Side Bar", 10, 400, 120, 50);
        add(sideBar);

        // Current Level
        JButton currentLevel = createButton("<html><center>Current Level</center></html>", 700, 400, 120, 50);
        add(currentLevel);

        // Randomly Placed Level Number Buttons
        int[][] positions = {{150, 100}, {300, 120}, {450, 140}, {600, 160}, {200, 220}, {350, 240}, {500, 260}, {650, 280}, {275, 350}};
        for (int[] pos : positions) {
            JButton levelButton = createButton("<html><center>Level Number</center></html>", pos[0], pos[1], 100, 50);
            add(levelButton);
        }

        setVisible(true);
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        return button;
    }

    private JPanel createPanel(String text, int x, int y, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBounds(x, y, width, height);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        panel.add(label);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProgressMap::new);
    }
}
