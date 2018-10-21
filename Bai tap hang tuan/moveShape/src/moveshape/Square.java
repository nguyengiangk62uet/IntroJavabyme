/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import javafx.geometry.Side;

/**
 *
 * @author DELL
 */
public class Square extends Rectangle {

    public void setSide(int side) {
        this.width = this.height = side;
    }

    public int getSide() {
        return this.width;
    }

    // Constructor
    public Square(int side, int x, int y, Color color) {
        super(side, side, x, y, color);
    }
}
