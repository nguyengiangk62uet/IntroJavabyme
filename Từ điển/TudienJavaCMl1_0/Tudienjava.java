/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TudienJavaCMl1_0;

import java.io.IOException;

/**
 *
 * @author Nguyễn Giang
 */
public class Tudienjava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here 
        Dictionary dictionary = new Dictionary();
        DictionaryCommandline dicCml = new DictionaryCommandline();
        
        dicCml.dictionaryAdvanced(dictionary);
    }
    
}
