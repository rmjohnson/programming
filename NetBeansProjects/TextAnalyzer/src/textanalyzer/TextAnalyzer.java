package textanalyzer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ryan
 */
public class TextAnalyzer extends JFrame {

    JButton jbload = new JButton("Load");
    JButton jbAnalyze = new JButton("Analyze");
    JTextArea jta;

    public TextAnalyzer() {
        JScrollPane scrollArea = new JScrollPane(jta = new JTextArea());
        scrollArea.setPreferredSize(new Dimension(300,300));
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);
        JPanel panel = new JPanel();
        panel.add(jbAnalyze, new FlowLayout());
        panel.add(jbload);
        
        add(panel, BorderLayout.SOUTH);
        add(scrollArea, BorderLayout.CENTER);
        
        jbload.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                if(jfc.showOpenDialog(jfc) == JFileChooser.APPROVE_OPTION) {
                    StringBuffer fileText = new StringBuffer();
                    try {
                        Scanner fileIn = new Scanner(jfc.getSelectedFile());
                        while(fileIn.hasNext()) {
                            fileText.append(fileIn.nextLine());
                        }
                        jta.setText(fileText.toString());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(TextAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    public static void main(String[] args) {
        TextAnalyzer frame = new TextAnalyzer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
