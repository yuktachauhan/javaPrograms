import javax.swing.*;
import java.awt.*;

class SwingPractice {
    public static void main(String... args){
        SwingPractice swingPractice = new SwingPractice();
        swingPractice.go();
    }
   public void go(){
         JFrame frame = new JFrame();
         JPanel panel =new JPanel();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         panel.setBackground(Color.darkGray);
         panel.setLayout(new BoxLayout(panel ,BoxLayout.Y_AXIS));
         JButton button1=new JButton("Yukta Chauhan.");
         JButton button2=new JButton("Shradha Chauhan.");
         JButton button3=new JButton("Shreya Chauhan.");
         JButton button4=new JButton("Yuvraj Chauhan.");
         JButton button5=new JButton("Yukta Chauhan.");
         JButton button6=new JButton("Shradha Chauhan.");
         JButton button7=new JButton("Shreya Chauhan.");
         JButton button8=new JButton("Yuvraj Chauhan.");
         JButton button9=new JButton("Yukta Chauhan.");
         JButton button10=new JButton("Shradha Chauhan.");
         JButton button11=new JButton("Shreya Chauhan.");
         JButton button12=new JButton("Yuvraj Chauhan.");
         panel.add(button1);
         panel.add(button2);
         panel.add(button3);
         panel.add(button4);
         panel.add(button5);
         panel.add(button6);
         panel.add(button7);
         panel.add(button8);
         panel.add(button9);
         panel.add(button10);
         panel.add(button11);
         panel.add(button12);
         frame.setContentPane(panel);  //here we make the panel as contentpane
         frame.setSize(300,300);
         frame.setVisible(true);
    }
}