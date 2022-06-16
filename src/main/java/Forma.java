//import org.openqa.selenium.WebDriver;
//import org.testng.TestNG;
//import pages.CheckBoxExercises;
//import pages.InputFormExercises;
//import tests.BaseTest;
//import tests.InputFormTests;
//
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class Forma extends JFrame {
//    private WebDriver driver;
//    private JPanel panelMain;
//    JButton button1;
//    JButton button2;
//    InputFormTests inputFormTests = new InputFormTests();
//    BaseTest baseTest = new BaseTest();
//    CheckBoxExercises checkBoxExercises = new CheckBoxExercises(driver);
//
//
//
//    public Forma() {
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                baseTest.setup();
//                inputFormTests.simpleFormTest();
//                baseTest.tearDown();
//                JOptionPane.showMessageDialog(button1, "Test przechodzi");
//
//            }
//        });
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                baseTest.setup();
//                checkBoxExercises.checkBoxFirstExercises();
//
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//
//
//        Forma f=new Forma();
//        f.setContentPane(f.panelMain);
//        f.setTitle("testy");
//        f.setSize(300,400);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(3);
//    }
//}
