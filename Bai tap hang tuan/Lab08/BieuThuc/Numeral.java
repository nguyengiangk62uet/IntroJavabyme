/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BieuThuc;

/**
 *
 * @author DELL
 */
public class Numeral extends Expression {

    int value;

    // Constructor
    public Numeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Trả về thông tin number
    @Override
    public String toString() {
        return "Giá trị number: " + value;
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return value;
    }

}
