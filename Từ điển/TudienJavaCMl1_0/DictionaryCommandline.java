/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TudienJavaCMl1_0;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Giang
 */
public class DictionaryCommandline {
     public void showAllWord(Dictionary dictionary){
        System.out.println("No\t|English\t|Vietnamese");
        int index = 1;
        String a = " ";
        for(Word dic : dictionary.getDic()){
            System.out.print(index + "\t|" + dic.getWord_target());
            for (int i = 0; i < 15 - dic.getWord_target().length(); i++)
                System.out.print(a);
            System.out.println("|" + dic.getWord_explain() + "\n");
            index++;
        }
    }

   
    public void dictionaryAdvanced(Dictionary dictionary) throws IOException {

        System.out.println("Mời lựa chọn:\n1: Lấy danh sách từ tệp.\n2: Hiển thị danh sách từ." +
                "\n3: Tìm kiếm từ.\n4: Thêm từ.\n5: Xóa từ.\n6: Thoát chương trình.");

        DictionaryManagement management = new DictionaryManagement();
        Scanner scan = new Scanner(System.in);
        int request = scan.nextInt();

        switch(request){
            case 1:
                management.insertFromFile(dictionary);
                dictionaryAdvanced(dictionary);    //ínsert xong quay lai menu chinh
                break;
            case 2:
                showAllWord(dictionary);
                dictionaryAdvanced(dictionary);    //quay lai menu chinh
                break;
            case 3:
                management.dictionaryLookup(dictionary);
                dictionaryAdvanced(dictionary);
                break;
            case 4:
                management.insertFromCommandline(dictionary);
                management.ghiFile(dictionary);
                dictionaryAdvanced(dictionary);
                break;
            case 5:
                management.deleteWord(dictionary);
                management.ghiFile(dictionary);
                dictionaryAdvanced(dictionary);
                break;
            case 6:
                System.exit(0);                 //thoat chuong trinh
                break;
            
            default:
                dictionaryAdvanced(dictionary);
                break;
        }
    }
}
