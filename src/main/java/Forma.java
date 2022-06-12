import org.openqa.selenium.WebDriver;
import pages.InputFormExercises;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {
    private WebDriver driver;
    private JPanel panelMain;
    private JButton button1;
    private JButton button2;

    public Forma() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BaseClass.firstExerc();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }


            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BaseClass.secondExerc();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        Forma f=new Forma();
        f.setContentPane(f.panelMain);
        f.setTitle("testy");
        f.setSize(300,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
