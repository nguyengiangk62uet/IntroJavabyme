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
public class Circle extends Shape {

    int radius;
    int x;
    int y;
    int speedX = 15;
    int speedY = 15;

    // Constructor
    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Vẽ Circle lên cửa sổ
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

    // Di chuyển Circle
    public void update() {
        x = x + speedX;
        y = y + speedY;
        if (x < 0) {
            speedX = -speedX;
        } else if (x + radius > main.WIN_WIDTH) {
            speedX = -speedX;
            x = main.WIN_WIDTH - radius;
        }
        if (y < 0) {
            speedY = -speedY;
        } else if (y + radius > main.WIN_HEIGHT) {
            speedY = -speedY;
            y = main.WIN_HEIGHT - radius;
        }
    }
    
    // Trả về thông tin Hexagon
    @Override
    public String getInfo() {
        return "Circle => Radius: " + radius + " Color: " + color;
    }
}
