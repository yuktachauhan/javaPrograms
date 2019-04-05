import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Graph2D extends JPanel{
    public void paintComponent(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        Graphics2D g2D=(Graphics2D) g;
        int red =(int) (Math.random()*255);
        int green =(int) (Math.random()*255);
        int blue =(int) (Math.random()*255);
        Color startclr = new Color(red,green,blue);
        red =(int) (Math.random()*255);
        green =(int) (Math.random()*255);
        blue =(int) (Math.random()*255);
        Color endclr = new Color(red,green,blue);
        GradientPaint gradient = new GradientPaint(70,70,startclr,140,140,endclr);
        g2D.setPaint(gradient);
        g2D.fillOval(70,70,100,100);
    }
}
class TwoDGraphics implements ActionListener{
    public JButton button;
    public JFrame frame;
    public static void main(String... x){
        TwoDGraphics graphics=new TwoDGraphics();
        graphics.go();
    }
    public void go(){
    frame =new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    Graph2D graph =new Graph2D();
    button =new JButton("click to change color");
    button.addActionListener(this);
    frame.getContentPane().add(BorderLayout.SOUTH,button);
    frame.getContentPane().add(BorderLayout.CENTER,graph);
    frame.setSize(300,300);
    frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }   
}