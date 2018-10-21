/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TudienJavaCMl1_0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Giang
 */
public class DictionaryManagement {
    public Scanner scan = new Scanner(System.in);
    public void insertFromCommandline(Dictionary dictionary) {
        System.out.println("Enter number words you want to insert: ");
        
        int numWords = scan.nextInt();
        scan.nextLine();
        String check;
        
        for (int i = 0; i < numWords; ++i) {
            Word word = new Word();
            System.out.println("Word " + (i + 1) + " : ");
            check = scan.nextLine();
            if (check != null)
                word.setWord_target(check);
            
            System.out.println("Explain: ");
            check = scan.nextLine();
            if (check != null)
                word.setWord_explain(check);
            
            if(word.getWord_target() != null && word.getWord_explain() != null){
                dictionary.setDic(word);
            }
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void insertFromFile(Dictionary dictionary) throws IOException {
        InputStream in = new FileInputStream("dictionaries.txt");
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream("dictionaries.txt"), "UTF-8"));
        
        String line = "";
        while (line != null) {            
            line = buf.readLine();
            if (line == null) {
                break;
            }
            int index = 0;
            String target = "", explain;
            Word word = new Word();

            // get word
            for (index = 0; line.charAt(index) != '\t' && line.charAt(index) != ' '; ++index) {
                target += line.charAt(index);
            }
            for (; line.charAt(index) == '\t' || line.charAt(index) == ' '; ++index);
            // get explain
            explain = line.substring(index);
            if (target != null && explain != null) {
                word.setWord_target(target);
                word.setWord_explain(explain);
            }

            //truong hop nhap word khong nhap explain or nguoc lai
            if(word.getWord_target() != null && word.getWord_explain() != null){
                dictionary.setDic(word);
            }
        }
    }
     public void dictionaryLookup(Dictionary dictionary) {

        System.out.print("Please enter your word: ");
        String lookup = scan.nextLine();
        System.out.println(lookup);

        ArrayList<Word> wordList; // danh sach cac tu trong database
        wordList = (ArrayList<Word>) dictionary.getDic();

        for (Word word: wordList) { // vong lap tim tu can tra
            if (lookup.equals(word.getWord_target())) {
                System.out.println("=> " + word.getWord_target() + ": " + word.getWord_explain());
                return;
            }
        }
        // het vong lap -> ko tim thay tu can tra
        System.out.println("Sorry! We can't find the word you're looking for!");
    }
    
    public void deleteWord(Dictionary dictionary) {
        System.out.println("Nhập từ bạn muốn xóa: ");
        String delW;
        delW = scan.nextLine();
        for (int i = 0; i < dictionary.getDic().size(); i++) {
            if (dictionary.getDic().get(i).getWord_target().equals(delW)) {
                System.out.println("Đã thấy từ " + delW + " trong từ điển!");
                System.out.println("Bạn có muốn xóa từ " + delW + " không? (Y/N)?");
                char option = scan.next().charAt(0);
                if (option == 'Y' || option == 'y') {
                    dictionary.getDic().remove(i);
                    System.out.println("Xóa thành công!!");
                } else if (option == 'N' || option == 'n') {
                    System.out.println("Xóa không thành công!!");
                } else {
                    System.out.println("Lỗi");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy từ: " + delW);
    }
    
    public void ghiFile(Dictionary dictionary) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dictionaries.txt"), "UTF-8"));
            for (Word ele : dictionary.getDic()) {
                bw.write(ele.getWord_target()    + "\t" + ele.getWord_explain());
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
}