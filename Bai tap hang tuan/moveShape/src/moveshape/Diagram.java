/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Diagram extends JFrame {

    ArrayList<Layer> layers = new ArrayList<>();

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    // Delete Circle in Diagram
    public void removeCircle() {
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
                if (layers.get(i).shapes.get(j) instanceof Circle) {
                    layers.get(i).shapes.remove(j);
                    j--;
                }
            }
        }

        System.out.println("Deleted Circle !");
    }

    // Chuyển tất cả hình tròn vào 1 layer
    public void circleToLayer(ArrayList<Shape> listShapes) {
        
        for (int i = 0; i < layers.size(); i++) {
 
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
                if (layers.get(i).shapes.get(j) instanceof Circle) {
            
                    listShapes.add(layers.get(i).shapes.get(j));
                }
            }
        }
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
               
                if (layers.get(i).shapes.get(j) instanceof Circle) {
                    layers.get(i).shapes.remove(j);
                    j--;
                }
            }
        }
    }

}
