package exercise18;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ryan
 */
public class AlarmFrame extends JFrame {
    
    JTextField hourField,minuteField,secondField;
    JLabel instructions;
    JButton okButton, cancelButton;
    JPanel instructionsPanel,hourPanel,minutePanel,secondPanel,buttonsPanel;
    private int alarmHour, alarmMinute, alarmSecond;

    public AlarmFrame() throws HeadlessException {
        setPreferredSize(new Dimension(200,200));
        setLayout(new FlowLayout());
        
        instructionsPanel = new JPanel();
        instructionsPanel.setPreferredSize(new Dimension(200,20));
        instructions = new JLabel("Enter Hour, Minute, and Second");//,BorderLayout.NORTH);
        instructionsPanel.add(instructions);
        
        hourField = new JTextField(10);
        minuteField = new JTextField(10);
        secondField = new JTextField(10);
        
        hourPanel = new JPanel();
        hourPanel.setPreferredSize(new Dimension(200,25));
        hourPanel.add(new JLabel("Hour"));
        hourPanel.add(hourField);
        
        minutePanel = new JPanel();
        minutePanel.setPreferredSize(new Dimension(200,25));
        minutePanel.add(new JLabel("Minute"));
        minutePanel.add(minuteField);
        
        secondPanel = new JPanel();
        secondPanel.setPreferredSize(new Dimension(200,25));
        secondPanel.add(new JLabel("Second"));
        secondPanel.add(secondField);
        
        buttonsPanel = new JPanel();
        buttonsPanel.setPreferredSize(new Dimension(200,40));
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alarmHour = -1;
                alarmMinute = -1;
                alarmSecond = -1;
                hourField.setText("");
                minuteField.setText("");
                secondField.setText("");
                setVisible(false);
            }
        });
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alarmHour = Integer.parseInt(hourField.getText());
                alarmMinute = Integer.parseInt(minuteField.getText());
                alarmSecond = Integer.parseInt(secondField.getText());
                setVisible(false);
            }
        });
        buttonsPanel.add(okButton,BorderLayout.EAST);
        buttonsPanel.add(cancelButton,BorderLayout.WEST);
        
        add(instructionsPanel);
        add(hourPanel);
        add(minutePanel);
        add(secondPanel);
        add(buttonsPanel);
        
        pack();
        setLocationRelativeTo(null);
    }

    public int getAlarmHour() {
        return alarmHour;
    }

    public int getAlarmMinute() {
        return alarmMinute;
    }

    public int getAlarmSecond() {
        return alarmSecond;
    }
    
}
