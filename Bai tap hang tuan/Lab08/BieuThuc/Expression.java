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
public abstract class Expression {

    // Trả về thông tin biểu thức
    @Override
    public abstract String toString();

    // Trả về kết quả
    public abstract int evaluate();
}
