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
public class BinaryExpression extends Expression {

    Expression left;
    Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    // Constructor
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Trả về thông tin biểu thức
    @Override
    public String toString() {
        return "Biểu thức trái: " + left.toString() + "\nBiểu thức phải: " + right.toString();
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

}
