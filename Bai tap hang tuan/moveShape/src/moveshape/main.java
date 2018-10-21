/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import javax.swing.JFrame;
import static moveshape.Panel.diagram;
import static moveshape.Panel.layer;

/**
 *
 * @author DELL
 */
public class main extends JFrame {

    public static int WIN_WIDTH = 600;
    public static int WIN_HEIGHT = 600;

    public main() {
        setTitle("Move Shapes");
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        Panel panel = new Panel();
        add(panel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new main();
        byte choose = 0;
//        Panel.layer.removeCircle();
//        Panel.layer.removeRectangle();
  
        while (choose != 1) {
            Panel.seLect();
            System.out.println("Exit? (Y = 1/N = 0): ");
            choose = Panel.scan.nextByte();
        }
       
    }
}
