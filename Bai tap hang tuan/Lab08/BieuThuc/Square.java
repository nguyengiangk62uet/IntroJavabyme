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
public class Square extends Expression {

    Expression ep;

    public Expression getEp() {
        return ep;
    }

    public void setEp(Expression ep) {
        this.ep = ep;
    }

    // Constructor
    public Square(Expression ep) {
        this.ep = ep;
    }

    // Trả về thông tin biểu thức
    @Override
    public String toString() {
        return "Biểu thức bình phương: " + ep.toString();
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return ep.evaluate() * ep.evaluate();
    }

}
