/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class Hexagon extends Shape {

    Point p1, p2, p3, p4, p5, p6;
    int dai;
    int speedX = 10;
    int speedY = 10;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public Point getP5() {
        return p5;
    }

    public Point getP6() {
        return p6;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

//    public Hexagon(Point p1, int dai, Color color) {
//        super(color);
//        this.p1 = p1;
//        this.dai = dai;
//        p2.setX(p1.x + dai);
//        p2.setY(p1.y);
//        p3.setX(p1.x + 3 * dai / 2);
//        p3.setY((int) (p1.y + Math.sqrt(3) * dai / 2));
//        p4.setX(p1.x + dai);
//        p4.setY((int) (p1.y + Math.sqrt(3) * dai));
//        p5.setX(p1.x);
//        p5.setY(p1.y + (int) (p1.y + Math.sqrt(3) * dai));
//        p6.setX(p1.x - dai / 2);
//        p6.setY(p1.y + (int) (p1.y + Math.sqrt(3) * dai / 2));
//    }
    // Constructor
    public Hexagon(Point p1, Point p2, Point p3, Point p4, Point p5, Point p6, Color color) {
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    // Di chuyển các điểm của Hexagon
    public void moveHexagon(int dx, int dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
        p3.move(dx, dy);
        p4.move(dx, dy);
        p5.move(dx, dy);
        p6.move(dx, dy);
    }

    // Vẽ Hexagon lên cửa sổ, fill color cho Hexagon
    public void paint(Graphics g) {
        int[] xPoints = {p1.x, p2.x, p3.x, p4.x, p5.x, p6.x};
        int[] yPoints = {p1.y, p2.y, p3.y, p4.y, p5.y, p6.y};
        g.setColor(color);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p4.x, p4.y);
        g.drawLine(p4.x, p4.y, p5.x, p5.y);
        g.drawLine(p5.x, p5.y, p6.x, p6.y);
        g.drawLine(p6.x, p6.y, p1.x, p1.y);
        g.fillPolygon(xPoints, yPoints, 6);
    }

    // Di chuyển Hexagon
    public void update() {
        moveHexagon(speedX, speedY);
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p4.x < 0 || p5.x < 0 || p6.x < 0
                || p1.x > main.WIN_WIDTH || p2.x > main.WIN_WIDTH || p3.x > main.WIN_WIDTH
                || p4.x > main.WIN_WIDTH || p5.x > main.WIN_WIDTH || p6.x > main.WIN_WIDTH) {
            speedX = -speedX;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p4.y < 0 || p5.y < 0 || p6.y < 0
                || p1.y > main.WIN_HEIGHT || p2.y > main.WIN_HEIGHT || p3.y > main.WIN_HEIGHT
                || p4.y > main.WIN_HEIGHT || p5.y > main.WIN_HEIGHT || p6.y > main.WIN_HEIGHT) {
            speedY = -speedY;
        }
    }

    // Trả về thông tin Hexagon
    @Override
    public String getInfo() {
        return "Thông tin Hexagon: ";
    }
}
