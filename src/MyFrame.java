import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(450, 300);
        this.setResizable(false);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("MV Boli", Font.PLAIN, 40));
        this.add(timeLabel);
        this.setVisible(true);

        setTime();

    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}