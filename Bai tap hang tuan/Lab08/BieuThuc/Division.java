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
public class Division extends BinaryExpression {

    // Constructor
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        try {
            return left.evaluate() / right.evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0!");
            return Integer.MIN_VALUE;
        }
    }

}
