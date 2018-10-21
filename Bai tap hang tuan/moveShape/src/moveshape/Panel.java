/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class Panel extends JPanel implements ActionListener {

    static Scanner scan = new Scanner(System.in);

    // Set thuộc tính cho Triangle
    Point p1 = new Point(50, 50);
    Point p2 = new Point(150, 50);
    Point p3 = new Point(50, 200);

    // Set thuộc tính cho Hexagon
    int dai = 90;
    Point p4 = new Point(170, 100);
    Point p5 = new Point((p4.x + dai), p4.y);
    Point p6 = new Point(p4.x + 3 * dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));
    Point p7 = new Point(p4.x + dai, (int) (p4.y + Math.sqrt(3) * dai));
    Point p8 = new Point(p4.x, (int) (p4.y + Math.sqrt(3) * dai));
    Point p9 = new Point(p4.x - dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));

    // Khởi tạo các hình vẽ
    Rectangle rect = new Rectangle(60, 90, 250, 250, Color.BLUE);
    Circle circle = new Circle(40, 200, 80, Color.RED);
    Circle circle1 = new Circle(40, 200, 80, Color.RED);
    Circle circle2 = new Circle(40, 200, 80, Color.RED);
    Square square = new Square(60, 30, 30, Color.GRAY);
    Triangle triangle = new Triangle(p1, p2, p3, Color.DARK_GRAY);
    Hexagon hexagon = new Hexagon(p4, p5, p6, p7, p8, p9, Color.MAGENTA);
//    Hexagon hexagon = new Hexagon(p4, 30, Color.MAGENTA);

    // Khởi tạo timer
    Timer timer;
    public static Layer layer = new Layer(true);
    public static Layer layer1 = new Layer(true);
    ArrayList<Shape> list = new ArrayList<>();
    public static Diagram diagram = new Diagram();

    public Panel() {
        this.setFocusable(true);
        timer = new Timer(40, this);
        timer.start();
        layer.shapes.add(rect);
        layer.shapes.add(square);
        layer.shapes.add(circle);
        layer.shapes.add(triangle);
        layer.shapes.add(hexagon);
        layer.shapes.add(circle1);
        layer.shapes.add(circle2);
        //layer.xoaCircleTrungNhau();
        diagram.layers.add(layer);

        //diagram.layers.add(layer1);
        diagram.circleToLayer(list);
        for (int i = 0; i < list.size(); i++) {
            layer1.shapes.add(list.get(i));
        }
        diagram.layers.add(layer1);
        //diagram.circleToLayer();
        System.out.println(list.size());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, main.WIN_WIDTH, main.WIN_HEIGHT);
        if (diagram.layers.get(1).visible == true) {
            for (int i = 0; i < diagram.layers.get(1).shapes.size(); i++) {
                diagram.layers.get(1).shapes.get(i).paint(g);
            }
        }

    }

    // Lựa chọn hình muốn move
    static int select;

    public static void seLect() {

        System.out.println("Bạn muốn chuyển động hình nào?: ");
        select = scan.nextInt();

    }

    // Up date các hình để di chuyển
    public void update() {
        switch (select) {
            case 1:
                rect.update();
                break;
            case 2:
                circle2.update();
                break;
            case 3:
                square.update();
                break;
            case 4:
                triangle.update();
                break;
            case 5:
                hexagon.update();
                break;
            case 6: {
                rect.update();
                circle2.update();
                square.update();
                triangle.update();
                hexagon.update();
                break;
            }
        }
    }

    // Thực hiện hành động
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        update();
    }
}
