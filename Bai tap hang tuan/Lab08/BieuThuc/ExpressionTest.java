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
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subtraction tru = new Subtraction(new Square(new Numeral(10)), new Numeral(1));
        Addition cong = new Addition(tru, new Mutilplication(new Numeral(2), new Numeral(3)));
        Square binhPhuong = new Square(cong);
        System.out.println("Kết quả của (10^2 - 1 + 2*3)^2 = " + binhPhuong.evaluate());
        
        // Kiểm tra ngoại lệ chia cho 0
        Division chia = new Division(new Numeral(10), new Numeral(0));
        System.out.println(chia.evaluate());

    }

}
