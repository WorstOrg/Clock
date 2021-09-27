import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    ImageIcon image = new ImageIcon("src/lo.jpg");
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String day;
    String time;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(800, 750);
        // this.setResizable(false);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("MV Boli", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("MV Boli", Font.PLAIN, 40));
        dayLabel.setForeground(new Color(0x00FF00));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("MV Boli", Font.PLAIN, 25));
        dateLabel.setForeground(new Color(0x00FF00));

        JLabel label = new JLabel();
        label.setIcon(image);

        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        this.add(dateLabel);
        this.add(label);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setTime();

    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}