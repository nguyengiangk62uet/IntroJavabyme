/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author DELL
 */
public class Lap09 {

    public static Scanner scan = new Scanner(System.in);

    // Đọc dữ liệu của file
//    public static void readContentFromFile(String path) throws FileNotFoundException {
//        File file = new File(path);
//        String nString = null;
//        try (Scanner sc = new Scanner(file)) {
//            System.out.println("Nội dung file: ");
//            while (sc.hasNext()) {
//                nString = sc.nextLine();
//                System.out.println(nString);
//            }
//        } catch (IOException e) {
//            System.out.println("Lỗi: " + e);
//        }
//    }
    /*
    public static test() {
        //lksjdflk
    }
    */
    public static String readContentFromFile(String path) throws IOException {  //lkejlerjtlkre
        FileReader reader = new FileReader(path);
        BufferedReader bfReader = new BufferedReader(reader);
        String n = "";
        try {
            String line = bfReader.readLine();
            while (line != null) {
                n += line + "\n";
                line = bfReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e);
        }
        return n;
    }

    // Ghi mới dữ liệu cho file
    public static void writeContentToFile(String path) throws FileNotFoundException, IOException {
        FileWriter outFileWriter;
        try {
            outFileWriter = new FileWriter(path);
            System.out.println("Nhập dữ liệu mới cho file: ");
            outFileWriter.write(scan.nextLine());
            outFileWriter.close();
            System.out.println("Nhập thành công !");
        } catch (IOException e) {
            System.out.println("Lỗi " + e);
        }
    }

    // Thêm dữ liệu vào file
    public static void writeContentToFileContinue(String path) {
        FileWriter outFileWriter;
        try {
            outFileWriter = new FileWriter(path, true);
            System.out.println("Thêm dữ liệu vào file: ");
            outFileWriter.write("\n" + scan.nextLine());
            outFileWriter.close();
            System.out.println("Thêm thành công !");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    // Tìm kiếm file trong thư mục  
    public static File findFileByName(String folderPath, String filePath) {
        File file = new File(folderPath + "\\" + filePath);
        if (file.exists()) {
            System.out.println("Simple Name: " + file);
            System.out.println("Absolute Path: " + file.getAbsolutePath());

            // Kiểm tra kích thước file (Theo đơn vị byte):
            System.out.println("Length (bytes): " + file.length());
            // Thời điểm sửa lần cuối (mili giây)
            long lastMofifyInMillis = file.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);
            System.out.println("Last modify date: " + lastModifyDate);
        } else {
            System.out.println("File không tồn tại !");
        }
        return file;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String path = "doc.txt";
        int chon = 0;
        boolean flag = false;
        while (chon != 5) {
            System.out.println("---Lựa chọn các tùy chọn---\n"
                    + "1. Đọc file\n"
                    + "2. Nhập dữ liệu mới cho file\n"
                    + "3. Thêm dữ liệu vào file\n"
                    + "4. Tìm file trong thư mục\n"
                    + "5. Thoát");
            do {
                System.out.println("Nhập lựa chọn: ");
                String str = scan.nextLine();
                if (str.equals("") == false) {
                    Pattern pattern = Pattern.compile("\\d*");
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        chon = Integer.parseInt(str);
                        flag = true;
                    }
                    if (chon < 1 || chon > 5) {
                        System.out.println("Nhập không chính xác! Vui lòng nhập lại..");
                    }
                }
            } while (flag == false && (chon < 1 || chon > 5));
            switch (chon) {
                case 1:
                    System.out.println(readContentFromFile(path));
                    break;
                case 2:
                    writeContentToFile(path);
                    break;
                case 3:
                    writeContentToFileContinue(path);
                    break;
                case 4: {
                    System.out.println("Nhập đường dẫn thư mục: ");
                    String folderPath = scan.nextLine();
                    System.out.println("Nhập tên file(VD: name.txt): ");
                    String filePath = scan.nextLine();
                    findFileByName(folderPath, filePath);
                    break;
                }
                case 5:
                    break;
            }
        }
    }

}
