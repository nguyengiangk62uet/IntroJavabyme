/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Giang Nguyễn
 */
public class Cau1 {

    public static <T extends Comparable> void varSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable> T maxValue(ArrayList<T> list) {
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] strings = {"Giang", "Khoi", "Duc", "Hoan", "Ky"};
        varSort(strings);
        System.out.println(Arrays.toString(strings));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strings));
        System.out.println(maxValue(list));
    }
}
