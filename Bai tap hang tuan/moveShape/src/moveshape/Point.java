/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

/**
 *
 * @author DELL
 */
public class Point {
    int x; 
    int y;

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
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Di chuyển điểm
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
