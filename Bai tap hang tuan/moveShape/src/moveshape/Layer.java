/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Layer {

    public static ArrayList<Shape> shapes = new ArrayList<>();
    boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Layer(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    // Delete Triangle in Layer
    public void removeRectangle() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Rectangle) {
                shapes.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Deleted Rectangle !");
    }

    // Xóa tam giác trong layer
    public void removeTriangle() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Deleted Triangle !");
    }

    // Xóa hình vuông trong layer
    public void removeSquare() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Square) {
                shapes.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Deleted Square !");
    }

    // Xóa hình tròn trong layer
    public void removeCircle() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Deleted Circle !");
    }

    // Xóa các Circle trùng nhau
    public void xoaCircleTrungNhau() {
        ArrayList<Circle> listTron = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                listTron.add((Circle) shapes.get(i));
            }
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
        byte hinhtrung = 0;
        for (int i = 0; i < listTron.size() - 1; i++) {
            if (listTron.get(i).x == listTron.get(i + 1).x && listTron.get(i).radius == listTron.get(i + 1).radius
                    && listTron.get(i).y == listTron.get(i + 1).y && listTron.get(i).color == listTron.get(i + 1).color) {
                listTron.remove(i);
                hinhtrung++;
                i--;
            }
        }
        System.out.println("Số hình tròn trùng nhau: " + (hinhtrung + 1));
        for (int i = 0; i < listTron.size(); i++) {
            shapes.add(listTron.get(i));
        }
        System.out.println(
                "Xóa hình trùng nhau thành công!\n"
                + "Kích thước của layer là: " + shapes.size());
    }
}
