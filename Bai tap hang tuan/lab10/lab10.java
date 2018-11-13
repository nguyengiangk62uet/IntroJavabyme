
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyễn Giang
 */
public class lab10 {

    // ASTV
    // Lấy code không có comment vào 1 string
    public static String getCodeWithoutComment(File path) {
        String code = "";
        try {
            String temp;
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                while ((temp = br.readLine()) != null) {
                // Loại các comment "//"
                    if (temp.trim().startsWith("//")) {
                    } else if (temp.contains("//")) {
                        code = code + temp.substring(0, temp.indexOf("//")) + "\n";
                    } else {
                        code = code + temp + "\n";
                    }
                }
                // Loại các comment "/**/"
                int x = code.indexOf("/*");
                while (x != -1) {
                    int y = code.indexOf("*/");
                    String r;
                    if (y == -1) {
                        y = code.length();
                        r = code.substring(x, y);
                        code = code.replace(r, " ");
                    } else {
                        r = code.substring(x, y + 2);
                        code = code.replace(r, " ");
                    }
                    x = code.indexOf("/*");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        } catch (IOException ex) {
            System.out.println("Fail Read File");
        }
        return code;
    }

    // Ghi code không có comment vào file mới
    public static void writeContentToFile(File path, File earlyFile) throws FileNotFoundException, IOException {
        FileWriter outFileWriter;
        try {
            outFileWriter = new FileWriter(path);
            outFileWriter.write(getCodeWithoutComment(earlyFile));
            outFileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi " + e);
        }
    }

    //Trả về danh sách các hàm
    //Mỗi hàm là 1 phần tử trong list
    static List<String> getAllFunctions(File path) throws IOException {
        List<String> listFuntion = new ArrayList<>();
        FileReader reader = new FileReader(path);
        BufferedReader bfReader = new BufferedReader(reader);
        String staticFunction = null;
        boolean ktra = false;
        try {
            staticFunction = bfReader.readLine();
            while (staticFunction != null) {
                String temp = "";   //Biến tạm chứa nội dung 1 hàm
                if (staticFunction.matches("(.*)static(.*)") && !staticFunction.contains(";")) {
                    temp += staticFunction + "\n";
                    ktra = true;
                }
                if (ktra == true && !staticFunction.contains(";")) {
                    int moNgoac = 0, dongNgoac = 0;
                    while (moNgoac != dongNgoac || dongNgoac == 0) {
                        if (staticFunction.contains("{")) {
                            moNgoac++;
                        }
                        if (staticFunction.contains("}")) {
                            dongNgoac++;
                        }
                        staticFunction = bfReader.readLine();
                        temp += staticFunction + "\n";
                    }
                    listFuntion.add(temp);
                }

                ktra = false;
                staticFunction = bfReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return listFuntion;
    }

    //Tìm hàm từ tên có dạng tenCuaHam(String,String)
    public static String findFunctionByName(String name, File path) throws IOException {
        String function = "";
        if (!name.contains("(")) {
            return "";
        }
        String nameFunc = name.substring(0, name.indexOf("(")).trim();
        String variableFunc = name.substring(name.indexOf("(") + 1, name.indexOf(")"));
        String[] vars;
        if (variableFunc.contains(",")) {
            vars = variableFunc.split(",");
        } else if (variableFunc.trim().equals("")) {
            vars = null;
        } else {
            vars = new String[1];
            vars[0] = variableFunc.trim();
        }
        String varString[];
        boolean check = false;
        //Kiểm tra với dữ liệu trong file
        for (int i = 0; i < getAllFunctions(path).size(); i++) {
            //Lọc để lấy nguyên tên của hàm
            String[] s = getAllFunctions(path).get(i).substring(0, getAllFunctions(path).get(i).indexOf("(")).split(" ");
            if (s[s.length - 1].equals(nameFunc)) {
                function = getAllFunctions(path).get(i).substring(getAllFunctions(path).get(i).indexOf("(") + 1, getAllFunctions(path).get(i).indexOf(")"));
                if (function.contains(",")) {
                    varString = function.split(",");
                } else if (function.trim().equals("")) {
                    varString = null;
                } else {
                    varString = new String[1];
                    varString[0] = function.trim();
                }
                int dem = 0;
                if (varString == null && vars == null) {
                    check = true;
                }
                if (varString.length == vars.length) {
                    for (int j = 0; j < varString.length; j++) {
                        if (varString[j].contains(vars[j])) {
                            dem++;
                        }
                    }
                    if (dem == varString.length) {
                        function = getAllFunctions(path).get(i);
                        check = true;
                    }
                }
            }
        }
        if (check == true) {
            return function;
        }
        return "Not found";
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\BTL OOP\\lap09\\src\\lap09\\Lap09.java";
        File file = new File(path);
        File newFile = new File("temp.txt");    //Tạo file mới chứa code không có comment
        Scanner scan = new Scanner(System.in);
        int chon = 0;
        boolean flag = false;
        while (chon != 3) {
            System.out.println("---Tùy chọn---\n"
                    + "1. In ra các hàm static\n"
                    + "2. Tìm kiếm hàm theo tên\n"
                    + "3. Thoát\n");
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
                    if (chon < 1 || chon > 3) {
                        System.out.println("Nhập không chính xác! Vui lòng nhập lại..");
                    }
                }
            } while (flag == false && (chon < 1 || chon > 5));
            switch (chon) {
                case 1: {
                    writeContentToFile(newFile, file);
                    List list = getAllFunctions(newFile);
                    System.out.println("Danh sách các hàm: ");
                    list.forEach((ele) -> {
                        System.out.println(ele);
                    });
                    break;
                }
                case 2: {
                    System.out.println("Tìm hàm theo tên!\n"
                            + "Nhập tên hàm: ");
                    String name = scan.nextLine();
                    System.out.println("Tìm thấy hàm:");
                    System.out.println(findFunctionByName(name, newFile));
                    break;
                }
                case 3:
                    break;
            }
        }
    }
}
