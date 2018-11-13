/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Random;

/**
 *
 * @author Nguyễn Giang
 */
public class bubbleSort {

    static void bubble(double arr[]) {
        int sz = arr.length;
        for (int i = 0; i < sz - 1; i++) {
            for (int j = i + 1; j < sz; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    static void printArray(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Random rd = new Random();
        double[] randomArray = new double[1000];
        for (int i = 0; i < randomArray.length; i++) {
            double randNum = rd.nextDouble() * 100; //Ramdom các số từ 0 đến 100
            randomArray[i] = Math.round(randNum * 100) / 100.00; //Làm tròn đến 2 chữ số
        }
        printArray(randomArray);
        bubble(randomArray);
        System.out.println("Sau khi sort: ");
        printArray(randomArray);
    }
}
