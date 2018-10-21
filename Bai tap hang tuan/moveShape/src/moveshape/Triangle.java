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
public class Triangle extends Shape {

    Point p1;
    Point p2;
    Point p3;
    int speedX = 12;
    int speedY = 12;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Triangle(Color color) {
        super(color);
    }

    // Constructor
    public Triangle(Point p1, Point p2, Point p3, Color color) {
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Di chuyển các điểm của tam giác
    public void moveTriangle(int dx, int dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
        p3.move(dx, dy);

    }

    // Vẽ tam giác lên cửa sổ
    public void paint(Graphics g) {
        int[] xPoints = {p1.x, p2.x, p3.x};
        int[] yPoints = {p1.y, p2.y, p3.y};
        g.setColor(color);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p1.x, p1.y);
        g.fillPolygon(xPoints, yPoints, 3);
    }

    // Di chuyển tam giác
    public void update() {
        moveTriangle(speedX, speedY);
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p1.x > main.WIN_WIDTH || p2.x > main.WIN_WIDTH || p3.x > main.WIN_WIDTH) {
            speedX = -speedX;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p1.y > main.WIN_HEIGHT || p2.y > main.WIN_HEIGHT || p3.y > main.WIN_HEIGHT) {
            speedY = -speedY;
        }
    }

    // Trả về thông tin tam giác
    @Override
    public String getInfo() {
        return "Yes";
    }
}
