/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TudienJavaCMl1_0;

import java.util.ArrayList;

/**
 *
 * @author Nguyễn Giang
 */
public class Dictionary {
    private ArrayList<Word> dic = new ArrayList<>();

    public ArrayList<Word> getDic() {
        return dic;
    }

    public void setDic(Word word) {
        this.dic.add(word);
    }
    
}
