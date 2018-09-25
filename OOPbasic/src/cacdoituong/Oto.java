package cacdoituong;
/*
Lop doi tuong oto
Thuoc tinh: Mau, loai, gia ban
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oto {
    private String color, type;
    private int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Oto(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong tin o to: " + type + " " + color + " " + price);
    }

    //Xe vip
    public void printVipcar() {
        if (this.price > 100000)
            this.getInfo();
    }


}
