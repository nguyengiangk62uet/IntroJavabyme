import java.util.Scanner;

public class fibonaccivsucln {
    //Ham tinh UCLN cua 2 so
    public static int UCLN(int a, int b) {
        return (b == 0) ? a : UCLN(b, a % b);
    }

    //In ra n so fibonacci dau tien
    public static long dayfibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (long i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập số thứ 2: ");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println("UCLN là: " + UCLN(a, b));
        //
        System.out.println("Nhập số giới hạn Fibonacci: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println(n + " số đầu tiên của dãy Fibonacci: ");
        for (int i = 0; i < n; i++)
            System.out.print(dayfibonacci(i) + " ");
    }
}