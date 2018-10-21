import java.util.Scanner;

public class staticvamang {
    static void solonnhat () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        int a = scan.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int b = scan.nextInt();
        if (a > b) System.out.println("Số lớn nhất là: " + a);
        else System.out.println("Số lớn nhất là: " + b);
    }
    static void mincuaMang () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        int Min = a[0];
        for (int i=0; i<n; i++)
        {
            if (a[i] < Min) a[i] = Min;
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: " + Min);
    }
    static void bmi () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều cao(m): ");
        double cao = scan.nextDouble();
        System.out.println("Nhập cân nặng(kg): ");
        double nang = scan.nextDouble();
        double chiso = nang/(cao*cao);
        if (chiso < 18.5) System.out.println("Thiếu cân");
        else if (chiso >= 18.5 && chiso < 23)
            System.out.println("Bình thường");
        else if (chiso >= 23 && chiso <= 24.99)
            System.out.println("Thừa cân");
        else if (chiso >= 25)
            System.out.println("Béo phì");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: solonnhat();
            case 2: mincuaMang();
            case 3: bmi();
        }
    }
}
