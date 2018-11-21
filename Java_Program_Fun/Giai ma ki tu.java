/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahoa;

/**
 *
 * @author Giang Nguyễn
 */
import java.util.*;

public class mahoa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String code;
        // String code = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        System.out.println("Options: \n"
                + "1. Translate code to English\n"
                + "2. Translate English to code");
        
                System.out.println("Input String: ");
                code = scan.nextLine();
                for (int i = 0; i < code.length(); i++) {
                    char c = code.charAt(i);
                    int j = (int) c;
                    String s = Character.toString(c);
                    if (alphabet.contains(s)) {
                        if (j == 121) {
                            j = 97;
                        } else if (j == 122) {
                            j = 98;
                        } else {
                            j += 2;
                        }
                        c = (char) j;
                        System.out.print(c);
                    } else {
                        System.out.print(s);
                    }

                }
         
                System.out.println("\nInput String: ");
                code = scan.nextLine();
                for (int i = 0; i < code.length(); i++) {
                    char c = code.charAt(i);
                    int j = (int) c;
                    String s = Character.toString(c);
                    if (alphabet.contains(s)) {
                        if (j == 97) {
                            j = 121;
                        } else if (j == 98) {
                            j = 122;
                        } else {
                            j -= 2;
                        }
                        c = (char) j;
                        System.out.print(c);
                    } else {
                        System.out.print(s);
                    }
                }
            
    }
}

//Hello, i hope you didnt translate this code by hand
