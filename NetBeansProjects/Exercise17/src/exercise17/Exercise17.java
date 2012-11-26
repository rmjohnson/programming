package exercise17;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Class: Computer Science II
 * Assignment: Exercise 17.18
 * @author Ryan Johnson
 * Date of Last Modification: 4/4/2012
 * Description: This program is a multiple window GUI that shows a bar graph
 * of the number of times each letter shows up in an inputted string.
 */
public class Exercise17 extends JFrame {

    private JTextArea jta;
    private JButton jbtShowHistogram = new JButton("Show Histogram");
    private Histogram histogram = new Histogram();
    private JFrame histogramFrame = new JFrame();

    public Exercise17() {
        // Store text area in a scroll pane
        JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
        scrollPane.setPreferredSize(new Dimension(300, 200));
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);

        // Place scroll pane and button in the frame
        add(scrollPane, BorderLayout.CENTER);
        add(jbtShowHistogram, BorderLayout.SOUTH);

        // Register listener
        jbtShowHistogram.addActionListener(new ActionListener() {

            /**
             * Handle the button action
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Count the letters in the text area
                int[] count = countLetters();

                // Set the letter count to histogram for display
                histogram.showHistogram(count);

                // Show the frame
                histogramFrame.setVisible(true);
            }
        });

        // Create a new frame to hold the histogram panel
        histogramFrame.add(histogram);
        histogramFrame.pack();
        histogramFrame.setTitle("Bar Chart");
    }

    /**
     * Count the letters in the text area
     */
    private int[] countLetters() {
        // Count for 26 letters
        int[] count = new int[26];

        // Get contents from the text area
        String text = jta.getText();

        // Count occurrence of each letter (case insensitive)
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if ((character >= 'A') && (character <= 'Z')) {
                count[(int) character - 65]++; // The ASCII for 'A' is 65
            } else if ((character >= 'a') && (character <= 'z')) {
                count[(int) character - 97]++; // The ASCII for 'a' is 97
            }
        }

        return count; // Return the count array
    }

    public static void main(String[] args) {
        Exercise17 frame = new Exercise17();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exercise17");
        frame.pack();
        frame.setVisible(true);
    }
}
