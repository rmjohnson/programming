package exercise18;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class ButtonPanel extends JPanel {
    
    private JButton alarmButton;
    private JCheckBox alarmCheckBox;
    //public AlarmFrame alarmFrame;


    public ButtonPanel() {
        setPreferredSize(new Dimension(300,40));
        alarmButton = new JButton("Set Alarm");
        alarmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Exercise18.getClock().getAlarmFrame().setVisible(true);
            }
        });
        alarmCheckBox = new JCheckBox("Alarm");
        add(alarmCheckBox);
        add(alarmButton);
    }

    public JCheckBox getAlarmCheckBox() {
        return alarmCheckBox;
    }
    
}
