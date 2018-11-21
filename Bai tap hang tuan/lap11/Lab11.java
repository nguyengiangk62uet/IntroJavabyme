/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Giang Nguyễn
 */
public class Cau1 {

    public static <T extends Comparable> void varSort(T[] arr) {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        T temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static <T extends Comparable> T maxValue(ArrayList<T> list) {
        try {
            T max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).compareTo(max) > 0) {
                    max = list.get(i);
                }
            }
            return max;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strings = {};
        varSort(strings);
        Integer[] integers = {9, 8, 7, 6, 5};
        varSort(integers);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(integers));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strings));
        System.out.println(maxValue(list));
    }
}
