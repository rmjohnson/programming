package exercise18;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Ryan
 */
public class Clock extends JPanel implements ActionListener {

    private int hour, minute, second;
    Timer timer = new Timer(200, this);
    private NumPanel hourPanel,minutePanel,secondPanel;
    private LabelPanel labels;
    private ButtonPanel buttons;
    private AlarmFrame alarmFrame;
    private URL alarmURL;
    private AudioClip alarmSound;

    public Clock() {
        setPreferredSize(new Dimension(300, 150));
        setCurrentTime();
        
        alarmURL = this.getClass().getResource("audio/beep.wav");
        alarmSound = Applet.newAudioClip(alarmURL);
        
        alarmFrame = new AlarmFrame();
        timer.start();
        
        labels = new LabelPanel();
        add(labels);
        hourPanel = new NumPanel(hour+"");
        add(hourPanel);
        minutePanel = new NumPanel(minute+"");
        add(minutePanel);
        secondPanel = new NumPanel(second+"");
        add(secondPanel);
        buttons = new ButtonPanel();
        add(buttons);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setCurrentTime();
        hourPanel.setMessage(hour+"");
        hourPanel.repaint();
        minutePanel.setMessage(minute+"");
        minutePanel.repaint();
        secondPanel.setMessage(second+"");
        secondPanel.repaint();
        
        if(alarmFrame.getAlarmHour() == hour 
            && alarmFrame.getAlarmMinute() == minute 
            && alarmFrame.getAlarmSecond() == second
            && buttons.getAlarmCheckBox().isSelected()) {
                alarmSound.play(); 
        }
    }
    

    public void setCurrentTime() {
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();

        // Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public AlarmFrame getAlarmFrame() {
        return alarmFrame;
    }
}
