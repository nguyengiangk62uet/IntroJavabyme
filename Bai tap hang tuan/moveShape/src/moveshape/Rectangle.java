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
public class Rectangle extends Shape {

    int width;
    int height;
    int x;
    int y;
    int speedX = 12;
    int speedY = 12;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    // Constructor
    public Rectangle(int width, int height, int x, int y, Color color) {
        super(color);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    // Vẽ Rectangle lên cửa sổ
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    // Di chuyển rectangle
    public void update() {
        x = x - speedX;
        y = y - speedY;
        if (x < 0 || x + width / 2 > main.WIN_WIDTH || x + width / Math.sqrt(2) > main.WIN_WIDTH) {
            speedX = -speedX;
        }
        if (y < 0 || y + height / 2 > main.WIN_HEIGHT || y + height * Math.sqrt(2) > main.WIN_HEIGHT) {
            speedY = -speedY;
        }
    }

    // Trả về thông tin Rectangle
    @Override
    public String getInfo() {
        return "Rectangle => Width: " + width + " Height: " + height + " Color: " + color;
    }

}
