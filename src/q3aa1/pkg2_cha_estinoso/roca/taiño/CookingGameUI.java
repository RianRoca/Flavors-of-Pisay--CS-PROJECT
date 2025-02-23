/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3aa1.pkg2_cha_estinoso.roca.taiño;

import javax.swing.*;
import java.awt.*;

public class CookingGameUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CookingGameUI().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Cooking Game UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);

        // Header Panel
        JLabel headerLabel = new JLabel("Chop the onions!", SwingConstants.CENTER);
        headerLabel.setBounds(300, 10, 200, 50);
        frame.add(headerLabel);
        
        // Progress Bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 80, 200, 20);
        frame.add(progressBar);
        
        // Time Left Panel
        JLabel timeLeftLabel = new JLabel("Time Left: 00:29");
        timeLeftLabel.setBounds(650, 80, 100, 50);
        frame.add(timeLeftLabel);
        
        // Interaction Area
        JPanel interactionArea = new JPanel();
        interactionArea.setBounds(200, 150, 400, 250);
        interactionArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(interactionArea);
        
        // Recipe List
        JTextArea recipeList = new JTextArea("Recipe Steps:\n1. Chop onions\n2. Heat pan\n3. Stir ingredients");
        recipeList.setBounds(150, 420, 500, 50);
        frame.add(recipeList);
        
        // Control Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(50, 500, 300, 50);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton retryButton = new JButton("Retry");
        JButton nextButton = new JButton("Next");
        JButton pauseButton = new JButton("Pause");
        buttonPanel.add(retryButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(pauseButton);
        frame.add(buttonPanel);
        
        frame.setVisible(true);
    }
}