/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NgoaiLe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class exception {

    // Xử lý ngoại lệ với biến giá trị null
    static void testNullPointer(List<String> list) {
        try {
            list.forEach((s) -> {
                System.out.println(s);
            });
        } catch (NullPointerException e) {
            System.out.println("Lỗi: " + e);
        }
        // throw new NullPointerException();
    }

    // Ngoại lệ với truy cập ngoài mảng
    static void testArrayIndexOfBound() {
        try {
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println(arr.get(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    // Ngoại lệ với lỗi logic toán học
    static void testArithmetic() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    // Ngoại lệ với ép kiểu không hợp lệ
    static void testClassCast() {
        try {
            Object x = 0;
            System.out.println((String) x);
        } catch (ClassCastException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    // Xử lý ngoại lệ file có tồn tại
    static void testFileNotFound() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("dic.txt")));
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi: " + ex);
        }
    }

    // Xử lý ngoại lệ xuất nhập file
    static void testIO() throws IOException {
//        try {
//            FileInputStream fis = new FileInputStream("cloud9.jpg");
//            byte[] buf = new byte[1024];
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            for (int readNum; (readNum = fis.read(buf)) != -1;) {
//                bos.write(buf, 0, readNum);
//            }
//            FileReader fr;
//            fr = new FileReader("data.txt");
//            int i;
//            while ((i = fr.read()) != -1) {
//                System.out.print((char) i);
//            }
//            fr.close();
//            System.out.println(bos.toByteArray());
//        } catch (IOException ex) {
//            Logger.getLogger(exception.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            try (FileWriter fw = new FileWriter("")) {
                fw.write("");
                fw.flush();
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    public static void main(String[] args) throws Exception {
        List<String> l = null;
        testNullPointer(l);
        testArrayIndexOfBound();
        testArithmetic();
        testClassCast();
        testFileNotFound();
        testIO();
    }

}
