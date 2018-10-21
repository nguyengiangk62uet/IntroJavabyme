/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public abstract class Shape extends JFrame {

    Color color;

    public Color getColorString() {
        return color;
    }

    public void setColorString(Color color) {
        this.color = color;
    }

    // Constructor
    public Shape(Color color) {
        this.color = color;
    }

    // Return info
    public abstract String getInfo();

}
