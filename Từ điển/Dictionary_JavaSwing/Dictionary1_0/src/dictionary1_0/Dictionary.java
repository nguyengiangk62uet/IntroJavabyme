/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1_0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Dictionary {

    public static ArrayList<Word> listWord = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);
    private static final String fileName = "dictionaries.txt";

    // FUNCTION check enter integer (not string) use regex
    public int checkNumber() {
        boolean flag = false;
        int num = 0;
        do {
            String str = scan.nextLine();
            if (str.equals("") == false) {
                Pattern pattern = Pattern.compile("\\d*");
                Matcher matcher = pattern.matcher(str);
                if (matcher.matches()) {
                    num = Integer.parseInt(str);
                    flag = true;
                } else {
                    System.out.println("Is not a number ! enter again: ");
                }
            }

        } while (flag == false);
        return num;
    }

    //FUNCTION showAllWords
    public void showAllWords() {
        if (!Dictionary.listWord.isEmpty()) {
            System.out.printf("%-4s%c%-20s%c%-20s\n", "No", '|', "English", '|', "Vietnamese");
            for (int i = 0; i < Dictionary.listWord.size(); i++) {
                System.out.printf("%-5d", i + 1);
                Dictionary.listWord.get(i).printWord();
            }
        } else {
            System.out.println("Dictionary is empty !");
        }
    }

    // FUNCTION insertFromCommandline
    public void insertFromCommandline() {
        System.out.println("------------------ Add word to dictionary --------------------");
        System.out.print("Enter the number of words you want to add: ");
        int num = checkNumber();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter word target: ");
            String target = scan.nextLine();
            boolean check = false;
            for (Word elemt : Dictionary.listWord) {
                if (elemt.getWord_taget().equals(target.trim())) {
                    System.out.println("Word: " + target + "  has already been in the dictionary !! Enter again ...");
                    check = true;
                    i--;
                    break;
                }
            }
            if (!check) {
                System.out.print("Enter word explain: ");
                String explain = scan.nextLine();
                Dictionary.listWord.add(new Word(target, explain));
            }
        }
        System.out.println("Insert success " + num + " word to dictionary !!!");
    }

    //FUNCTION dictionaryLookup
    public void dictionaryLookup() {
        System.out.println("-------------------------- LOOK UP ---------------------------");
        System.out.print("Enter word: ");
        String wordLookup = scan.nextLine();
        for (Word elemt : Dictionary.listWord) {
            if (elemt.getWord_taget().equals(wordLookup)) {
                System.out.println("Lookup Success !\nYour word is: ");
                elemt.printWord();
                return;
            }
        }
        System.out.println("Word Not Found ! ");
    }

    // FUNCTION dictionarySearcher
    public void dictionarySearcher() {
        System.out.println("------------------------ SEARCHER ----------------------------");
        System.out.print("Enter word: ");
        String key = scan.nextLine();
        ArrayList<Word> listWordSearcher = new ArrayList<>();
        for (Word elemt : Dictionary.listWord) {
            if (elemt.getWord_taget().startsWith(key)) {
                listWordSearcher.add(elemt);
            }
        }
        if (listWordSearcher.isEmpty()) {
            System.out.println("Word Not Found !");
        } else {
            System.out.println("Words start with \"" + key + "\": ");
            int i = 1;
            for (Word elemt : listWordSearcher) {
                System.out.printf("%-4d", i);
                elemt.printWord();
                i++;
            }
        }
    }

    //FUNCTION editWordInDictionary
    public void editWordInDictionary() {
        System.out.println("------------------------ EDIT WORD----------------------------");
        System.out.println("Enter word want edit: ");
        String editW = scan.nextLine();
        for (int i = 0; i < Dictionary.listWord.size(); i++) {
            if (Dictionary.listWord.get(i).getWord_taget().equals(editW)) {
                System.out.println(editW + "(*): Word found in dictionary !");
                System.out.print("Enter word replace: ");
                String spel = scan.nextLine();
                System.out.print("Enter explain: ");
                String expl = scan.nextLine();
                Dictionary.listWord.set(i, new Word(spel, expl));
                System.out.println("Edit success !!!");
                return;
            }
        }
        System.out.println("Word Not Found !");
    }

    // FUNCTION deleteWordInDictionary
    public void deleteWordInDictionary() {
        System.out.println("-----------------------DELETE WORD----------------------------");
        System.out.println("Enter word want delete: ");
        String delW = scan.nextLine();
        for (int i = 0; i < Dictionary.listWord.size(); i++) {
            if (Dictionary.listWord.get(i).getWord_taget().equals(delW)) {
                System.out.println(delW + "(*): Word found in dictionary !");
                System.out.println("You want delete " + delW + " ? (Y/N)?");
                char option = scan.next().charAt(0);
                if (option == 'Y' || option == 'y') {
                    Dictionary.listWord.remove(i);
                    System.out.println("Delete success !!!");
                } else if (option == 'N' || option == 'n') {
                    System.out.println("Delete failed !!!");
                } else {
                    System.out.println("Error !!!");
                }
                return;
            }
        }
        System.out.println("Word Not Found !");
    }

    //FUNCTION insertFromFile
    public void insertFromFile() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            String line = br.readLine();;
            while (line != null) {
                if (line.indexOf("\t") == -1) {
                    line = br.readLine();
                    continue;
                }
                String tag = line.substring(0, line.indexOf("\t"));
                String exp = line.substring(line.indexOf("\t") + 1);
                Word w = new Word(tag, exp);
                Dictionary.listWord.add(w);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

    // FUNCTION dictionaryExportToFile
    public static void dictionaryExportToFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
            for (Word ele : Dictionary.listWord) {
                bw.write(ele.getWord_taget() + "\t" + ele.getWord_explain());
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
