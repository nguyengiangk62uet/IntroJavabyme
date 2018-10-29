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
public class Subtraction extends BinaryExpression {

    // Constructor
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

}
